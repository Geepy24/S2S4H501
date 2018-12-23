package com.demo.web.action;

import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.demo.domain.Customer;
import com.demo.service.ICustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 *	 客户的动作类
 * @author Huangjiping
 *
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	//模型驱动
	private Customer customer = new Customer() ;
	private List<Customer> customers ;
	private ICustomerService customerService ;
	
//	
//	//得到应用域
//	ServletContext sc = ServletActionContext.getServletContext() ;
//	//得到Spring容器
//	ApplicationContext ac =  WebApplicationContextUtils.getWebApplicationContext(sc) ;
//	
//	private ICustomerService customerService = (ICustomerService) ac.getBean("customerService") ;
//	//但是此时没有容器，要在web中配置监听器，在action中从应用域中取出容器，再取出bean
//	
	
	
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	//customers的getter and setter,放入值栈
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public Customer getModel() {
		return customer ;
	}
	//获取添加用户的界面
	public String addUICustomer() {
		return "addUICustomer" ;
	}
	//获取用户列表
		public String findAllCustomer() {
			//调用客户层查询客户列表
			customers = customerService.findAllCustomer() ;
			 
			return "findAllCustomer" ;
		}
}
