package com.delmar.core.model;

import lombok.Data;
 /**
  * table name core_search
  * Date:2016-08-29 16:03:22
  **/
@Data
public class Search extends CoreModel {

private Integer id;
private String name;
private String remark;
private String pageUrl;
  /**
   * 查询界面显示类型 普通查询界面还是组合查询界面
   */
  private Integer searchShowType;

}