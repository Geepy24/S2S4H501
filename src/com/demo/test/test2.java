package com.demo.test;
/**
 * 测试hibernate
 * @author Huangjiping
 *
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.domain.Customer;

public class test2 {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustName("ssh整合Customer");
		//1.加载配置文件
		Configuration cfg = new Configuration();
		cfg.configure();
		//2.根据配置文件创建SessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		//3.获取session
		Session session = factory.openSession() ;
		//4.开启事务
		Transaction tx = session.beginTransaction();
		//5.执行操作  此时不用写dao层实现类也可以有sql语句生成
		session.save(c);
		//6.提交/回滚事务
		tx.commit();
		//7.释放资源
//		session.close();
		factory.close();
	}
	
}

