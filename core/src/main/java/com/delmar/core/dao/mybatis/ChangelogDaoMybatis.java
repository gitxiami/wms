/******************************************************************************
 * 版权所有 刘大磊 2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：13336390671                                                                * 
 * email:ldlqdsd@126.com						                               *
 *****************************************************************************/

package com.delmar.core.dao.mybatis;

import org.springframework.stereotype.Repository;

import com.delmar.core.dao.ChangelogDao;
import com.delmar.core.model.Changelog;
import com.delmar.core.dao.mybatis.CoreDaoMyBatis;

/**
 * @author 刘大磊 2015-01-09 10:48:25
 */
@Repository("changelogDao") 
public class ChangelogDaoMybatis extends CoreDaoMyBatis<Changelog> implements ChangelogDao {

	/* (non-Javadoc)
	 * @see com.delmar.core.dao.mybatis.CoreDaoMyBatis#getSqlName()
	 */
	@Override
	protected String getSqlName() {
		
		return "com.delmar.core.mybatis.sql.ChangelogMapper";
	}



}
