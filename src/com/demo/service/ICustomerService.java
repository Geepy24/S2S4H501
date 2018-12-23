package com.demo.service;

import java.util.List;

import com.demo.domain.Customer;

public interface ICustomerService {

	/**
	 * 查询所有客户
	 * @return
	 */
	List<Customer> findAllCustomer();
	
	/**
	 * 保存客户
	 * @param customer
	 */
	void saveCustomer(Customer customer);
	
	
}
