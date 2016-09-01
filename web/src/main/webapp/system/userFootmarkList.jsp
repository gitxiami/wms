<%--
  Created by IntelliJ IDEA.
  User: 刘大磊
  Date: 2016-09-01 17:30:01
--%>
<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ include file="/commons/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <link rel="Stylesheet" href="../css/displaytag.css" type="text/css"/>
    <link rel="stylesheet" href="../css/style.css" type="text/css" media="all"/>
    <script type="text/javascript" src="../js/jquery/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="<c:url value="/js/jquery/jquery-ui-1.11.4.custom/jquery-ui.min.js"/>"></script>
    <link rel="Stylesheet" href="../js/jquery/jquery-ui-1.11.4.custom/jquery-ui.min.css" type="text/css" />
    <script type='text/javascript' src='../js/ea.effect.js'></script>
    <script type='text/javascript' src='../js/ea.validate.js'></script>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" charset="utf-8"/>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#selectDiv").dialog({
                autoOpen: false,
                height: 500,
                width: 700,
                modal: true,
                title:'位置：查询条件',
                resizable:false});
            highlightTableRows("list");
            $('#search_but').click(function()
            {
                openDialog('system_userFootmark');
            });
        });
        function openDialog(url)
        {
            document.getElementById('selectIframe').src='<c:url value='/commons/searchPage.do'/>?action_value='+url;
            $('#selectDiv').dialog('open');
        }
        function closeDialog()
        {
            $("#selectDiv").dialog('close');
        }
        function search()
        {
            closeDialog();
            document.forms[0].submit();
        }
    </script>
</head>
<body >
<s:form action="userFootmark_list" namespace="/system"  theme="simple" >
<table width="100%" border="0" cellspacing="0" cellpadding="5">
<tr>
<td>
    <table border="0" cellpadding="0" cellspacing="0" class="cTableBorder">
        <tr>
            <td align="left" class="navig">位置：Struts日志</td>
            <td class="navig" align="right">
                <table id="normalQuery" cellpadding="0" cellspacing="0" border="0">
                    <tr>
                        <td>
                            <input type="button" value="查询" class="input_submit" id="search_but">
                            <s:submit method="create" cssClass="input_submit" value="新建"></s:submit>
                            <s:submit method="deletes" cssClass="input_submit" value="删除" onclick="return confirmListDelete()"></s:submit>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    <display:table name="sessionScope.MAP_KEY_OF_SESSION.userFootmarkList" cellspacing="0" cellpadding="0"  requestURI=""
		    id="list" pagesize="20" class="table" export="true">
		<display:column style="width:30px;text-align:center" title="<input type='checkbox' name='selectall' onClick='selectAll(\"ids\",this);' style='margin:0px;'/>" media="html">
          		<input type="checkbox" name="ids" value="<c:out value='${list.id}'/>" style='border: none' />
        </display:column>
        <display:column title="序号" media="html csv excel xml pdf rtf">
              	<c:out value=" ${list_rowNum}"/>
        </display:column>



        <display:column property="visiteDate"  escapeXml="true" title="visiteDate" sortable="true"
        
                        decorator="com.delmar.core.web.displaytag.decorator.DateDecorator"
                                                                                                    />






        <display:column property="userId"  escapeXml="true" title="userId" sortable="true"
        
                                        decorator="com.delmar.base.web.displaytag.decorator.UserDecorator"
                                                            />


        <display:column property="orgId"  escapeXml="true" title="组织" sortable="true"
        
                                                                decorator="com.delmar.base.web.displaytag.decorator.OrgDecorator"
                                    />


        <display:column property="remark"  escapeXml="true" title="备注" sortable="true"
        
                                                                                                    />


        <display:column property="remoteAddr"  escapeXml="true" title="remoteAddr" sortable="true"
        
                                                                                                    />


        <display:column property="remoteHost"  escapeXml="true" title="remoteHost" sortable="true"
        
                                                                                                    />


    </display:table>
</td>
</tr>
</table>
</s:form>
<script type="text/javascript">
    function viewExport(id) {
       window.location='<c:url value="/system/userFootmark_edit.action"/>?id='+id;
    }
    function confirmListDelete()
    {
        if(isEmptyCheckBox('ids'))
        {
            alert('请先选择记录再删除');
            return false;
        }
        return confirm("<delmar:message key="org.message.confirmdelete" />");
    }
    highlightTableRows("list");
</script>
<div id="selectDiv">
    <iframe frameborder="0" align="top" height="100%" width="100%" style="margin:0px; border:0px; padding: 0px;" id="selectIframe"></iframe>
</div>
</body>
</html>