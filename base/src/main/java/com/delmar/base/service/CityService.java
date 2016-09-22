
/******************************************************************************
 * 版权所有 刘大磊 2013-07-01												      *
 *	作者：刘大磊								                                      *
 * 电话：13336390671                                                          * 
 * email:ldlqdsd@126.com						                          *
 *****************************************************************************/

package com.delmar.base.service;

import java.util.List;

import com.delmar.base.model.City;
import com.delmar.base.model.CityTrl;
import com.delmar.core.service.CoreService;

/**
 * @author 刘大磊 2014-12-29 09:54:05
 */
public interface CityService extends CoreService<City> {
	/**
	 * @param relateCityId
	 * 获取关联城市
	 * @return
	 */
	City  getRelateCity(Integer relateCityId);

	/**
	 * @param ids
	 */
	void deleteCityList(Integer[] ids);
	
	void saveCity(City city, List<CityTrl> cityTrlList);
	
	CityTrl getCityTrl(String language, Integer cityId);

	List<City> getCityListByName(String nameLike);
}