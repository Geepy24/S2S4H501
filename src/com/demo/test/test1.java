package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.ICustomerService;

public class test1 {
	/**	
	 * 	测试IOC是否能使用
	 */
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml") ;
		ICustomerService customerService =(ICustomerService) ac.getBean("customerService") ;
		customerService.findAllCustomer() ;
	}
		
		
		
	
	
	
}
