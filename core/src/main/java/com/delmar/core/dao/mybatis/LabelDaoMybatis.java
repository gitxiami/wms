/**
* 版权所有 刘大磊 2013-07-01
* 作者：刘大磊
* 电话：13336390671
* email:ldlqdsd@126.com
*/
package com.delmar.core.dao.mybatis;

import com.delmar.core.bo.LabelBo;
import org.springframework.stereotype.Repository;

import com.delmar.core.dao.LabelDao;
import com.delmar.core.model.Label;
import com.delmar.core.dao.mybatis.CoreDaoMyBatis;

import java.util.List;

/**
 * @author 刘大磊 2016-09-10 13:45:14
 */
@Repository("labelDao") 
public class LabelDaoMybatis extends CoreDaoMyBatis<Label> implements LabelDao {

	/* (non-Javadoc)
	 * @see com.delmar.core.dao.mybatis.CoreDaoMyBatis#getSqlName()
	 */
	@Override
	protected String getSqlName() {
		
		return "com.delmar.core.mybatis.sql.LabelMapper";
	}


	@Override
	public Label getLabelByValue(String s) {
		return sqlSessionTemplate.selectOne(getSqlName()+".getLabelByValue",s);
	}

	@Override
	public List<LabelBo> selectLocaleLabel(String locale) {
		return sqlSessionTemplate.selectList(getSqlName()+".selectLocaleLabel",locale);
	}
}
