/**
* 版权所有 刘大磊 2013-07-01
* 作者：刘大磊
* 电话：13336390671
* email:ldlqdsd@126.com
*/
package com.delmar.core.model;

import lombok.Data;
 /**
  * table name core_message
  * Date:2016-09-12 10:38:52
  **/
@Data
public class Message extends CoreModel {

private Integer id;
private String value;
private String msgtext;

}