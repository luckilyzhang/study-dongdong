package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Customer;
import com.example.demo.mapper.CustomerMapper;

//测试类可以理解为CustomerController类
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerMapperTest{
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Test
	public void testgetAll() throws Exception {
		List<Customer> customer = customerMapper.getAll();
		System.out.println(customer.toString());
	}
	
//	@Test
//	public void testgetOne() throws Exception {
//		Customer customer = customerMapper.getOne(2);
//		System.out.println(customer.toString());
//	}
	
//	@Test
//	public void testInsert() {
////		Customer customer = new Customer("张娜妮",18,"2","1990-10-20",new Date());
//		Customer customer = new Customer("产美芳",18,"2","1990-10-20",new Date());
//		customerMapper.insert(customer);
//	}
	
//	@Test
//	public void testUpdate() throws Exception {
//		Customer customer = new Customer();
//		customer.setId(2);
//		customer.setAge(25);
//		customer.setBirthday("1991-12-16");
//		customer.setUpdateTime(new Date());
//		customerMapper.update(customer);
//	}
	
//	@Test
//	public void testDelete() throws Exception {
//		customerMapper.delete(6);
//	}

}
