package com.crm.dao;

import java.util.List;
import java.util.Map;

import com.crm.entity.Product;

/**
 * 产品Dao接口
 * @author Administrator
 *
 */
public interface ProductDao {

	
	/**
	 * 查询产品集合
	 * @param map
	 * @return
	 */
	public List<Product> find(Map<String,Object> map);
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);

}
