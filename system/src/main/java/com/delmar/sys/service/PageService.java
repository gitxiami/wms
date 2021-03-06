
/******************************************************************************
 * 版权所有 刘大磊 2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：13336390671                                                          * 
 * email:ldlqdsd@126.com						                          *
 *****************************************************************************/

package com.delmar.sys.service;

import com.delmar.sys.model.Page;
import com.delmar.core.service.CoreService;

/**
 * @author 刘大磊 2015-01-13 09:38:52
 */
public interface PageService extends CoreService<Page> {

	/**
	 * @param ids
	 */
	void deletePages(Integer[] ids);

}