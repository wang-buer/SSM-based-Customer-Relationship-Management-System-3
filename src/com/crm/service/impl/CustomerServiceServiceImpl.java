package com.crm.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.crm.dao.CustomerServiceDao;
import com.crm.entity.CustomerService;
import com.crm.service.CustomerServiceService;

/**
 * 客服服务Service实现类
 * @author Administrator
 *
 */
@Service("customerServiceService")
public class CustomerServiceServiceImpl implements CustomerServiceService{

	@Resource
	private CustomerServiceDao customerServiceDao;
	
	@Override
	public int add(com.crm.entity.CustomerService customerService) {
		return customerServiceDao.add(customerService);
	}

	@Override
	public List<CustomerService> find(Map<String, Object> map) {
		return customerServiceDao.find(map);
	}

	@Override
	public Long getTotal(Map<String, Object> map) {
		return customerServiceDao.getTotal(map);
	}

	@Override
	public int update(CustomerService customerService) {
		return customerServiceDao.update(customerService);
	}

	

}
