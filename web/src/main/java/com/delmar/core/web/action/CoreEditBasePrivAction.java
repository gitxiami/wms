package com.delmar.core.web.action;

import com.delmar.core.dto.SearchColumnDto;
import com.delmar.core.service.SearchService;
import com.delmar.core.web.util.FacesUtils;
import com.delmar.sys.model.User;
import com.delmar.system.web.WebConst;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 刘大磊 on 2016/9/2.
 * 所有crud模块的基类
 */
public abstract class CoreEditBasePrivAction extends CoreAction{
    protected Integer id;
    @Autowired
    private SearchService searchService;
    protected static final String EDIT="edit";


    public abstract String getModuleName();
    /*上一条，下一条记录*/
    protected boolean isFirst=false;

    protected boolean isLast=false;
    public abstract String delete();
    public abstract void deleteList(Integer[] ids);
    public abstract Integer getModelId();
    public abstract void editForm();

    public abstract void createForm();
    public abstract String saveForm();
    public abstract String list();
    //// TODO: 2016/8/25
    public  String getPurpose()
    {
        return this.getModuleName();
    }
    public String getSearchWhere()
    {
        List<SearchColumnDto> searchColumnDtoList=FacesUtils.getSearchColumnList();
        if(searchColumnDtoList==null)
        {
            return null;
        }
        else
        {
            return searchService.buildSqlBySearchColumnList(searchColumnDtoList);
        }
    }
    /**
     * 新建表单
     * @return
     */
    @SkipValidation
    public String create()
    {
        if(!PrivilegeOperator.isCreate())
        {
            return NO_PRIVILEGE;
        }
        createForm();
        return EDIT;
    }
    /**
     * 修改单据、查看单据
     * @return
     */
    @SkipValidation
    public String edit()
    {
        if(!(PrivilegeOperator.isUpdate()||PrivilegeOperator.isView()))
        {
            return NO_PRIVILEGE;
        }
        editForm();
        return EDIT;
    }

    /**
     * 保存单据
     * @return
     */
    public String save()
    {
        if(!((PrivilegeOperator.isCreate()&&getModelId()==null)||PrivilegeOperator.isUpdate()))
        {
            return NO_PRIVILEGE;
        }
        String msgKey="success.update";
        if(this.getModelId()==null)
        {
            msgKey="success.create";
        }
        addActionMessage(getText(msgKey));
        String returnUrl=saveForm();

        return returnUrl;
    }


    public List<Integer> getIdList()
    {
        return (List)FacesUtils.getValueInHashtableOfSession(getModuleName()+"IdList");
    }

    public boolean validateDelete(Integer id)
    {
        return true;
    }
    @SkipValidation
    public String deletes()
    {
        if(!(PrivilegeOperator.isDelete()))
        {
            return NO_PRIVILEGE;
        }
        String[] ids=ServletActionContext.getRequest().getParameterValues("ids");
        if(ids==null)
        {
            String message=this.getText("error.deletes.empty");
            ServletActionContext.getRequest().getSession().setAttribute("msg", message);

        }
        Integer[] idints=new Integer[ids.length];

        for(int i=0;i<idints.length;i++)
        {
            idints[i]=Integer.parseInt(ids[i]);
            if (validateDelete(idints[i])==false)
                return "error";
        }
        deleteList(idints);

        ServletActionContext.getRequest().getSession().setAttribute("msg", getText("success.deletes"));
        return list();
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    @SuppressWarnings("unchecked")
    public boolean getIsFirst()
    {
        List<Integer>ids=(List)FacesUtils.getValueInHashtableOfSession(getModuleName()+"IdList");
        if(id==null||id==0)
        {
            isFirst=true;
        }
        int index=ids.indexOf(id);
        if(index==-1)
        {
            return true;
        }
        if(index==0)
        {
            isFirst=true;
        }
        return isFirst;
    }
    @SuppressWarnings("unchecked")
    public boolean getIsLast()
    {
        List<Integer>ids=(List)FacesUtils.getValueInHashtableOfSession(getModuleName()+"IdList");
        if(id==null||id==0)
        {
            isLast=true;
        }
        int index=ids.indexOf(id);
        if(index==-1)
        {
            return true;
        }
        if(index+1==ids.size())
        {
            isLast=true;
        }
        return isLast;
    }
    @SuppressWarnings("unchecked")
    public String getPrevionsOne()
    {
        List<Integer>ids=(List)FacesUtils.getValueInHashtableOfSession(getModuleName()+"IdList");

        int i = ids.indexOf(getModelId());

        id=ids.get(i - 1);
        return edit();
    }

    @SuppressWarnings("unchecked")
    public String getNextOne()
    {
        List<Integer>ids=(List)FacesUtils.getValueInHashtableOfSession(getModuleName()+"IdList");
        int i = ids.indexOf(getModelId());
        id=ids.get(i+1);
        return edit();
    }
    public User getUserInSession()
    {
        return	(User)FacesUtils.getSession().getAttribute(WebConst.SESSION_ACTUALUSER);
    }

}
