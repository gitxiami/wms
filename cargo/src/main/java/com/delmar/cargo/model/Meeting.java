/**
* 版权所有 刘大磊 2013-07-01
* 作者：刘大磊
* 电话：13336390671
* email:ldlqdsd@126.com
*/
package com.delmar.cargo.model;

import java.util.Date;
import com.delmar.core.model.CoreModel;
import lombok.Data;
 /**
  * table name b_meeting
  * Date:2016-09-13 13:40:33
  **/
@Data
public class Meeting extends CoreModel {

private String title;
private Date bgnTime;
private Date endTime;
private Integer userId;
private Integer orgId;
private Integer clientId;

}