package com.crm.dao;

import java.util.List;
import java.util.Map;

import com.crm.entity.CustomerLoss;

/**
 * 客户流失Dao接口
 * @author Administrator
 *
 */
public interface CustomerLossDao {

	
	/**
	 * 查询客户流失集合
	 * @param map
	 * @return
	 */
	public List<CustomerLoss> find(Map<String,Object> map);
	
	
	/**
	 * 获取总记录数
	 * @param map
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
	
	/**
	 * 添加客户流失记录
	 * @param customerLoss
	 * @return
	 */
	public int add(CustomerLoss customerLoss);
	
	/**
	 * 通过Id查找实体
	 * @param id
	 * @return
	 */
	public CustomerLoss findById(Integer id);
	
	/**
	 * 修改客户流失记录
	 * @param customerLoss
	 * @return
	 */
	public int update(CustomerLoss customerLoss);
}
