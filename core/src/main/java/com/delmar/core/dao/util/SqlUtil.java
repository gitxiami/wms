/******************************************************************************
 * 版权所有 刘大磊 2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：13336390671                                                               * 
 * email:ldlqdsd@126.com						                              *
 *****************************************************************************/
package com.delmar.core.dao.util;

import java.util.List;

/**
 * @author 刘大磊 2015年1月16日 下午2:43:49
 */
public class SqlUtil {
	public static final String ACCESS_STRING="accessString";
	public static final String SEARCH_STRING="searchString";
	/**
	 * 目前只支持数值和字符串
	 * 注意，改方法目前不支持原生类
	 * @param list
	 * @return
	 */
	 public static String arrayToInSQL(String column,List<Object> list) 
	 {
		 if(list.isEmpty()) return null;
		 String appendString="";
		 if(list.get(0) instanceof String)
		 {
			 appendString="'";
		 }
		
		 StringBuilder sb=new StringBuilder(column);
		 sb.append(" in(");
		 sb.append(appendString);
		 sb.append(list.get(0));
		 sb.append(appendString);
		 for(int i=1;i<list.size();i++)
		 {
			 sb.append(",");
			 sb.append(appendString);
			 sb.append(list.get(i));
			 sb.append(appendString);
		 }
		
		 sb.append(")");
		 return sb.toString();
	 }
	 public static String arrayToInSQL(String column,Object[] list) 
	 {
		 if(list==null||list.length==0) return null;
		 String appendString="";
		 if(list[0] instanceof String)
		 {
			 appendString="'";
		 }
		
		 StringBuilder sb=new StringBuilder(column);
		 sb.append(" in(");
		 sb.append(appendString);
		 sb.append(list[0]);
		 sb.append(appendString);
		 for(int i=1;i<list.length;i++)
		 {
			 sb.append(",");
			 sb.append(appendString);
			 sb.append(list[i]);
			 sb.append(appendString);
		 }
		
		 sb.append(")");
		 return sb.toString();
	 }
	 public static void main(String[] args)
	 {
		 int i=1;
		// System.out.println(i instanceof int);
	 }
}
