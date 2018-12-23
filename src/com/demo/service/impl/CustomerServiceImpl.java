package com.demo.service.impl;

import java.util.List;

import com.demo.dao.ICustomerDao;
import com.demo.domain.Customer;
import com.demo.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao customerDao;
	
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> findAllCustomer() {
		return customerDao.findAllCustomer();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}
	
	
}
