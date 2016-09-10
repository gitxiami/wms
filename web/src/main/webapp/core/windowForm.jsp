<%--
  Created by IntelliJ IDEA.
  User: 刘大磊
  Date: 2016-09-10 14:38:01
--%>
<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ include file="/commons/taglib.jsp"%>
<html>
<head>

<title>
	窗体
</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" charset="utf-8" />
    <link rel="stylesheet" href="../css/style.css" type="text/css" media="all"/>
    <script type='text/javascript' src='../js/ea.effect.js'></script>
    <script type='text/javascript' src='../js/ea.validate.js'></script>
    <script type="text/javascript" src="../js/jquery/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="../js/jquery/jquery-ui-1.11.4.custom/jquery-ui.min.js"></script>
    <script type="text/javascript" src="../js/jquery/plugin/jquery.datetimepicker.full.min.js"></script>
    <link rel="Stylesheet" href="../js/jquery/jquery-ui-1.11.4.custom/jquery-ui.min.css" type="text/css" >
    <link rel="Stylesheet" href="../js/jquery/jquery-ui-1.11.4.custom/jquery-ui.theme.min.css" type="text/css" >
    <link rel="Stylesheet" href="../js/jquery/plugin/jquery.datetimepicker.min.css" type="text/css" >
    <link rel="stylesheet" href="../css/bootstrap/bootstrap.min.css" type="text/css" media="all"/>
    <link rel="stylesheet" href="../css/bootstrap/bootstrap-theme.min.css" type="text/css" media="all"/>
    <script type='text/javascript' src='../js/bootstrap/bootstrap.js'></script>
    <script type='text/javascript' src='../js/jquery/plugin/bootbox.min.js'></script>
<script type="text/javascript">
 function gotoList()
 {
	 window.location='<c:url value="/core/window_list.action"/>';
 }
function addWindowTrl() {
var editForm = document.getElementById('editForm');
editForm.action = '<c:url value="/core/window_addWindowTrl.action"/>';
editForm.submit();
}
function deleteWindowTrls() {
if(isEmptyCheckBox('WindowTrl_ids'))
{
alert('请先选择再删除');
return;
}
var editForm = document.getElementById('editForm');
editForm.action = '<c:url value="/core/window_deleteWindowTrls.action"/>';
editForm.submit();
}
 $(document).ready(function(){
    $('#formDetail tr:odd').addClass("query_one");
     $('#formDetail tr:even').addClass("query_two");
     $("#formDetail").find("tr:last").removeClass("query_one").removeClass("query_two");
        $.datetimepicker.setLocale('en');
     $("#saveBtn").click(function(){
            if (isEmpty($("#name").val())) {
            alert("名称不允许为空");
            $("#name").focus();
            return false;
            }


            if (isEmpty($("#isactive").val())) {
            alert("是否有效不允许为空");
            $("#isactive").focus();
            return false;
            }


            if (!isInt($("#typeId").val())) {
            alert("typeId必须为整数");
            $("#typeId").focus();
            return false;
            }


            if (isEmpty($("#typeId").val())) {
            alert("typeId不允许为空");
            $("#typeId").focus();
            return false;
            }




         var validateLine=true;
         var lineMsg="";
$("input[name^=windowTrlList]").each(function(i, item){

        if(endWith(item.name,'name')){
                if (isEmpty($(item).val())) {
                lineMsg+="<br>"+"窗体翻译 名称不允许为空";
                $(item).focus();
                validateLine=false;
                }


        }






        if(endWith(item.name,'language')){
                if (isEmpty($(item).val())) {
                lineMsg+="<br>"+"窗体翻译 language不允许为空";
                $(item).focus();
                validateLine=false;
                }


        }

});
        if(!validateLine)
        {
            bootbox.alert(lineMsg);
            return false;
        }

         return true;
     });
 });
</script>
</head>
<body>
<s:form id="editForm" action="window_edit" namespace='/core' theme="simple">
<s:hidden id="id" name="window.id"/>
<!--table 01 bgn-->
<table width="100%" border="0" cellspacing="0" cellpadding="5">
  <tr>
    <td valign="top">
        <!--table 02 bgn-->
    	<table border="0" cellpadding="0" cellspacing="0" class="cTableBorder">
        <tr>
          <td align="left" class="navig">	窗体</td>
         <td background="../images/table_page_bg.gif" width="*"  height="26" align="right">

         <div class="C_S_F_L">
			<c:if test="${!isFirst}">

				<s:submit method="getPrevionsOne" value="%{#session.resource.get('common.button.previous')}"  cssClass="input_submit"/>
			</c:if>


			<c:if test="${!isLast}">
			<s:submit method="getNextOne" value="%{#session.resource.get('common.button.next')}"  cssClass="input_submit"/>

			</c:if>
		</div></td>
        </tr>
      </table>
        <!--table 02 end-->
        <!--table 03 bgn-->
    	<table width="100%" border="0" cellpadding="0" cellspacing="0"  class="table_blue">
        <tr align="center" valign="top">
          <td>
          <!--table 04 bgn-->
            <table width="100%" cellpadding="10" cellspacing="0" >
              <tr>
                <td align="center">
                    <!--table 05 bgn-->
                    <table width="100%" border="0" cellpadding="10" cellspacing="0" bgcolor="#FFFFFF" class="table_blue">
                <tr>
                <td>


                    <!--table 06 bgn-->
                <table width="100%" border="0" cellpadding="0" cellspacing="1" id="formDetail">
                        <tr>
                        <td width="20%"><s:label for="name" value="名称" /></td>
                        <td width="30%">
                        
                          <s:textfield name="window.name" id="name"   />
                            <span style="color:red">*</span>
                            <s:fielderror fieldName="window.name"    cssStyle="color:red" />
                          </td>
                        </tr>
                        <tr>
                        <td width="20%"><s:label for="descr" value="描述" /></td>
                        <td width="30%">
                        
                          <s:textfield name="window.descr" id="descr"  cssStyle="width:500px;" />
                            
                            <s:fielderror fieldName="window.descr"    cssStyle="color:red" />
                          </td>
                        </tr>
                        <tr>
                        <td width="20%"><s:label for="help" value="帮助" /></td>
                        <td width="30%">
                        
                          <s:textfield name="window.help" id="help"  cssStyle="width:500px;" />
                            
                            <s:fielderror fieldName="window.help"    cssStyle="color:red" />
                          </td>
                        </tr>
                        <tr>
                        <td width="20%"><s:label for="created" value="创建时间" /></td>
                        <td width="30%">
                        
                          <s:textfield name="window.created" id="created" readonly="true"  />
                            <span style="color:red">*</span>
                            <s:fielderror fieldName="window.created"    cssStyle="color:red" />
                          </td>
                        </tr>
                        <tr>
                        <td width="20%"><s:label for="createdby" value="创建人" /></td>
                        <td width="30%">
                        
                           <delmar:user userId="${window.createdby}" module="user"/>
                          </td>
                        </tr>
                        <tr>
                        <td width="20%"><s:label for="updated" value="修改时间" /></td>
                        <td width="30%">
                        
                          <s:textfield name="window.updated" id="updated" readonly="true"  />
                            <span style="color:red">*</span>
                            <s:fielderror fieldName="window.updated"    cssStyle="color:red" />
                          </td>
                        </tr>
                        <tr>
                        <td width="20%"><s:label for="updatedby" value="修改人" /></td>
                        <td width="30%">
                        
                           <delmar:user userId="${window.updatedby}" module="user"/>
                          </td>
                        </tr>
                        <tr>
                        <td width="20%"><s:label for="isactive" value="是否有效" /></td>
                        <td width="30%">
                        
                          <s:radio id="isactive" name="window.isactive" list="#{'Y':'Y','N':'N'}" required="true"/>
                            <span style="color:red">*</span>
                            <s:fielderror fieldName="window.isactive"    cssStyle="color:red"/>

                          </td>
                        </tr>
                        <tr>
                        <td width="20%"><s:label for="typeId" value="typeId" /></td>
                        <td width="30%">
                        
                          <s:textfield name="window.typeId" id="typeId"   />
                            <span style="color:red">*</span>
                            <s:fielderror fieldName="window.typeId"    cssStyle="color:red" />
                          </td>
                        </tr>

<tr>
    <td colspan="4" style="padding-left: 0;">
        <!-- table 页 bgn -->
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tr>
                        <td  style="height: 26px;width: 90px;" align="center" background="../images/table_page_1.gif">
                            窗体翻译
                        </td>
                <td background="../images/table_page_bg.gif" width="*"  style="height: 26px;"><div class="C_S_F_L">
                    &nbsp;
                </div></td>
            </tr>
        </table>
        <!-- table 页 end -->
    </td>

</tr>
<tr>
    <td colspan="4">
        <table id="WindowTrlTable" class="table">
            <thead>
            <th>序号</th>
            <th >名称</th>
            <th >描述</th>
            <th >帮助</th>
            <th >language</th>
            </thead>
            <tbody>
            <s:iterator value="windowTrlList" status="st">

                <tr class="<s:property value="#st.index%2==0?'odd':'even'"/>">
                      <td>
                        <s:property value="#st.index+1"/>
                        <s:hidden
                                name="%{'windowTrlList['+#st.index+'].id'}"/>
                    </td>
                <td>
                    <s:textfield
                            name="%{'windowTrlList['+#st.index+'].name'}">
                    </s:textfield> <span style="color:red">*</span>
                </td>
                <td>
                    <s:textfield
                            name="%{'windowTrlList['+#st.index+'].descr'}">
                    </s:textfield> 
                </td>
                <td>
                    <s:textfield
                            name="%{'windowTrlList['+#st.index+'].help'}">
                    </s:textfield> 
                </td>
                <td>
                    <s:textfield
                            name="%{'windowTrlList['+#st.index+'].language'}">
                    </s:textfield> <span style="color:red">*</span>
                        <s:hidden name="%{'windowTrlList['+#st.index+'].windowId'}"/>
                </td>


                </tr>

            </s:iterator>

            </tbody>
        </table>
    </td>
</tr>
                      <tr>
                          <td colspan="4" class="td_page_right" style="text-align:right;height: 24px;">
                              <s:submit method="create" value="%{#session.resource.get('common.button.create')}"  cssClass="input_submit"/>
                              <s:submit id="saveBtn" method="save" value="%{#session.resource.get('common.button.save')}"  cssClass="input_submit" />
                              <c:if test="${window.id!=null}">
                                  <s:submit method="delete"  value="%{#session.resource.get('common.button.delete')}"  cssClass="input_submit" onclick="return confirmDelete()"/>
                              </c:if>
                              <input onclick="gotoList()"  type="button" value="<delmar:message key="common.button.back"/>"  class="input_submit" >
                          </td>
                      </tr>
                </table>
                    <!--table 06 end-->
                </td>
                </tr>
                <tr>
                <td >
                <s:actionmessage cssStyle="color:red"/>

                </td>
                </tr>
                </table>
                <!--table 05 end-->
                </td></tr></table>
                <!--table 04 end-->
</td></tr></table>
    </td></tr></table>
</s:form>
</body>
</html>
