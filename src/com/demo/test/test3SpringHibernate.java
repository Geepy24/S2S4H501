package com.demo.test;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.domain.Customer;
import com.demo.service.ICustomerService;
import com.demo.service.impl.CustomerServiceImpl;

/**
 * 测试spring和hibernate的整个使用
 * @author Huangjiping
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:bean.xml"})
public class test3SpringHibernate {
	
	@Autowired
	ICustomerService customerService ;
	
	@Test
	public void testSave() {
		Customer customer = new Customer() ;
		customer.setCustName("SpringHibernate");
		customerService.saveCustomer(customer);
	}
	
	@Test
	public void testFindAll() {
		
		List<Customer> customers = customerService.findAllCustomer() ;
		Iterator<Customer> it = (Iterator<Customer>) customers.iterator() ;
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	
}
