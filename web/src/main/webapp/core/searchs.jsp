<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ include file="/commons/taglib.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<%@include file="/commons/header.jsp"%>
	<jsp:include page="/commons/list_js.jsp">
		<jsp:param name="search_name" value="core_search"/>
		<jsp:param name="edit_url" value="/core/search_edit.action"/>
	</jsp:include>
</head>

<body >

<s:form action="search_list" namespace="/core"  theme="simple" >
<table width="100%" border="0" cellspacing="0" cellpadding="5">

<tr>
<td>
<table border="0" cellpadding="0" cellspacing="0" class="cTableBorder">
        <tr> 
          <td align="left" class="navig"><delmar:message key="search.location" /></td>
          <td class="navig" align="right"> <table id="normalQuery" cellpadding="0" cellspacing="0" border="0">
              <tr> 
                <td >
					<input type="button" value="查询" class="input_submit" id="search_but">
                  <input type="button" value="<delmar:message key="common.button.create" />" class="input_submit" onclick="viewExport(0)">
                  
                  <s:submit method="deletes" cssClass="input_submit" value="%{#session.resource.get('common.button.delete')}" onclick="return confirmListDelete('ids')"/>
                 </td>
              </tr>
            </table></td>
         
        </tr>
      </table> 

<!-- <c:out value="${buttons}" escapeXml="false"/> -->
 <display:table name="sessionScope.MAP_KEY_OF_SESSION.searchList" cellspacing="0" cellpadding="0"  requestURI=""
		    id="list" pagesize="20" class="table" export="true">
		<display:column style="width:30px;text-align:center" media="html" title="<input type='checkbox' name='selectall' onClick='selectAll(\"ids\",this);' style='margin:0px;'/>">
		<input type="checkbox" name="ids"
				value="<c:out value='${list.id}'/>" style='border: none' />
		</display:column>    
		<display:column titleKey="common.label.sequence"  media="html csv excel xml pdf rtf">
			   <c:out value="${list_rowNum}"/>
    	</display:column>
    	<display:column   titleKey="search.column.name"  sortable="true" media="html">
		      <a href="javascript:viewExport('<c:out value="${list.id}"/>')">
     				 <c:out value="${list.name}"/></a>
		     </display:column>
		     <display:column property="name" media="excel,rtf,pdf,csv"
							  titleKey="search.column.name"  />
		     <display:column property="pageUrl"  escapeXml="true"  sortable="true"
							titleKey="search.column.pageUrl" />
			<display:column property="remark"  escapeXml="true"  sortable="true"
							titleKey="common.label.remark" />
		</display:table>

</td>
</tr>
</table>
</s:form>
<%@include file="/commons/list_footer.jsp"%>
</body>
</html>
