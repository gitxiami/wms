/******************************************************************************
 * 版权所有 刘大磊 2013-07-01												  *
 *	作者：刘大磊								                                              *
 * 电话：13336390671                                                               * 
 * email:ldlqdsd@126.com						                              *
 *****************************************************************************/
package com.delmar.core.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 刘大磊 2015年2月12日 下午4:07:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class MailTest {
	@Autowired
	private JavaMailSender mailSender;
	@Test
	public void testSendEmail()
	{
	
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom("swms_admin@126.com");
	//	smm.setTo("liua@delmarchina.com");
		smm.setTo(new String[]{"ldlqdsd@126.com"});
		smm.setSubject("测试·邮件");
		
		smm.setText("<html><body><h1>test H1</h1><i>i 测试</i></body></html>");
		//smm.setText("Hello 这是测测试邮件！！！");
		mailSender.send(smm);
	}
}
