package com.demo.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.demo.dao.ICustomerDao;
import com.demo.domain.Customer;

public class CustomerDaoImpl implements ICustomerDao{

	private HibernateTemplate hibernateTemplate ;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public List<Customer> findAllCustomer() {
	
		return (List<Customer>) hibernateTemplate.find("from Customer") ;
	}

	@Override
	public void saveCustomer(Customer customer) {
		System.out.println(customer);
		System.out.println("hibernateTemplate = "+hibernateTemplate);
		hibernateTemplate.save(customer);
		
	}

	
	
	
}
