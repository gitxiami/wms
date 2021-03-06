package com.delmar.base.model;

import com.delmar.core.model.CoreModel;

/**
 * @author 刘大磊 2014年12月22日 上午9:45:51
 */
public class Strategy extends CoreModel{

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_strategy.name
     *
     *
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_strategy.remark
     *
     *
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_strategy.class_name
     *
     *
     */
    private String className;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_strategy.id
     *
     * @return the value of base_strategy.id
     *
     *
     */
    @Override
	public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_strategy.id
     *
     * @param id the value for base_strategy.id
     *
     *
     */
    @Override
	public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_strategy.name
     *
     * @return the value of base_strategy.name
     *
     *
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_strategy.name
     *
     * @param name the value for base_strategy.name
     *
     *
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_strategy.remark
     *
     * @return the value of base_strategy.remark
     *
     *
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_strategy.remark
     *
     * @param remark the value for base_strategy.remark
     *
     *
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_strategy.class_name
     *
     * @return the value of base_strategy.class_name
     *
     *
     */
    public String getClassName() {
        return className;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_strategy.class_name
     *
     * @param className the value for base_strategy.class_name
     *
     *
     */
    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}