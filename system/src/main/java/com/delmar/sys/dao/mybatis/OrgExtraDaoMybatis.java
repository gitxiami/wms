/******************************************************************************
 * 版权所有 刘大磊 2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：13336390671                                                                * 
 * email:ldlqdsd@126.com						                               *
 *****************************************************************************/

package com.delmar.sys.dao.mybatis;

import org.springframework.stereotype.Repository;

import com.delmar.sys.dao.OrgExtraDao;
import com.delmar.sys.model.OrgExtra;
import com.delmar.core.dao.mybatis.CoreDaoMyBatis;

/**
 * @author 刘大磊 2015-08-27 18:05:33
 */
@Repository("orgExtraDao") 
public class OrgExtraDaoMybatis extends CoreDaoMyBatis<OrgExtra> implements OrgExtraDao {

	/* (non-Javadoc)
	 * @see com.delmar.core.dao.mybatis.CoreDaoMyBatis#getSqlName()
	 */
	@Override
	protected String getSqlName() {
		
		return "com.delmar.sys.mybatis.sql.OrgExtraMapper";
	}



}
