/******************************************************************************
 * 版权所有 刘大磊 2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：13336390671                                                                * 
 * email:ldlqdsd@126.com						                               *
 *****************************************************************************/

package com.delmar.sys.dao.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.delmar.core.dao.mybatis.CoreDaoMyBatis;
import com.delmar.sys.dao.UsergroupDao;
import com.delmar.sys.model.Usergroup;

/**
 * @author 刘大磊 2015-01-20 16:14:21
 */
@Repository("usergroupDao") 
public class UsergroupDaoMybatis extends CoreDaoMyBatis<Usergroup> implements UsergroupDao {

	/* (non-Javadoc)
	 * @see com.delmar.core.dao.mybatis.CoreDaoMyBatis#getSqlName()
	 */
	@Override
	protected String getSqlName() {
		
		return "com.delmar.sys.mybatis.sql.UsergroupMapper";
	}





}
