/******************************************************************************
 * 德玛国际物流有限公司  2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：0532-66701118                                                                * 
 * email:liua@delmarchina.com						                               *
 *****************************************************************************/

package com.delmar.core.dao.mybatis;

import org.springframework.stereotype.Repository;

import com.delmar.core.dao.WindowDao;
import com.delmar.core.model.Window;
import com.delmar.core.dao.mybatis.CoreDaoMyBatis;

/**
 * @author 刘大磊 2016-08-28 17:16:34
 */
@Repository("windowDao") 
public class WindowDaoMybatis extends CoreDaoMyBatis<Window> implements WindowDao {

	/* (non-Javadoc)
	 * @see com.delmar.core.dao.mybatis.CoreDaoMyBatis#getSqlName()
	 */
	@Override
	protected String getSqlName() {
		
		return "com.delmar.core.mybatis.sql.WindowMapper";
	}



}
