<%@ page contentType="text/html; charset=utf-8" language="java"%>
<%@ include file="/commons/taglib.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
	<%@include file="/commons/header.jsp"%>
	<jsp:include page="/commons/list_js.jsp">
		<jsp:param name="search_name" value="base_city"/>
		<jsp:param name="edit_url" value="/base/city_edit.action"/>
	</jsp:include>
</head>

<body >

<s:form action="city_list" namespace="/base"  theme="simple" >
<table width="100%" border="0" cellspacing="0" cellpadding="5">

<tr>
<td>
<table border="0" cellpadding="0" cellspacing="0" class="cTableBorder">
        <tr> 
          <td align="left" class="navig"><delmar:message key="city.location" /></td>
          <td class="navig" align="right"> <table id="normalQuery" cellpadding="0" cellspacing="0" border="0">
              <tr> 
                <td >
                
                  <input type="button"  value="<delmar:message key="common.button.search" />"  class="input_submit" id="search_but">
                  <s:submit method="create" cssClass="input_submit" value="%{#session.resource.get('common.button.create')}" />
                  <s:submit method="deletes" cssClass="input_submit" value="%{#session.resource.get('common.button.delete')}"/>
                 </td>
              </tr>
            </table></td>
         
        </tr>
      </table> 

<!-- <c:out value="${buttons}" escapeXml="false"/> -->
 <display:table name="sessionScope.MAP_KEY_OF_SESSION.cityList" cellspacing="0" cellpadding="0"  requestURI=""
		    id="list" pagesize="20" class="table" export="true">
		<display:column style="width:30px;text-align:center" title="<input type='checkbox' name='selectall' onClick='selectAll(\"ids\",this);' style='margin:0px;'/>" media="html" >
		
		<input type="checkbox" name="ids"
				value="<c:out value='${list.id}'/>" style='border: none' />
				
		</display:column>    
		<display:column 
			titleKey="common.label.sequence"
		media="html csv excel xml pdf rtf">
			   <c:out value="${list_rowNum}"/>
    	</display:column>
		     <display:column   	titleKey="city.column.code" sortable="true" media="html">
		      <a href="javascript:viewExport('<c:out value="${list.id}"/>')"><c:out value="${list.code}"/>
     		  </a>
		     </display:column>
		     <display:column property="code"    media="csv excel xml pdf rtf"	titleKey="city.column.code"/>
				
			<display:column property="id"  escapeXml="true" titleKey="city.column.cname" sortable="true"  decorator="com.delmar.base.web.displaytag.decorator.CityDecorator"/>
		    <display:column property="levelint"  escapeXml="true" titleKey="city.column.levelint" sortable="true"/>
		    <display:column property="parentId"  escapeXml="true" titleKey="city.column.parentCity" sortable="true"  decorator="com.delmar.base.web.displaytag.decorator.CityDecorator"/>
		    <display:column property="relateCityId"  escapeXml="true" titleKey="city.column.relateCity" sortable="true"  decorator="com.delmar.base.web.displaytag.decorator.CityDecorator"/>
		    <display:column property="remark"  escapeXml="true"  titleKey="common.label.remark" sortable="true"/>
		</display:table>
</td>
</tr>
</table>
</s:form>
<%@include file="/commons/list_footer.jsp"%>
</body>
</html>
