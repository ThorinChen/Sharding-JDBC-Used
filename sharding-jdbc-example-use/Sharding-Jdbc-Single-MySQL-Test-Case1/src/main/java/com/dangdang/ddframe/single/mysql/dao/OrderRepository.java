package com.dangdang.ddframe.single.mysql.dao;

import java.util.List;

import com.dangdang.ddframe.single.mysql.domain.Order;

public interface OrderRepository {
	
	void insert(Order model);
	
	int update(List<Integer> userIds);
	
	int deleteAll();
	
	List<Order> selectAll();
}
