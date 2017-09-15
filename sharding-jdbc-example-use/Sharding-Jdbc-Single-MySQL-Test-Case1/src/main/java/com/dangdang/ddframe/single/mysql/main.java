package com.dangdang.ddframe.single.mysql;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dangdang.ddframe.single.mysql.base.BaseTestCase;
import com.dangdang.ddframe.single.mysql.service.OrderService;

public class main extends BaseTestCase {
	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void clear() {
		// CHECKSTYLE:ON
		orderService.clear();
		orderService.select();
	}
	
	/**
	 * <p>
	 * Discription:[方法功能中文描述]
	 * </p>
	 * Created on 2017年9月14日
	 * Update on 2017年9月14日 [变更者中文名字]
	 * Start : Thu Sep 14 19:03:12 CST 2017
	 * End : Thu Sep 14 19:03:18 CST 2017
	 * Take {6417} ms .
	 * @author:[陈师兄]
	 */
	@Test
	public void Insert20000MysqlTest() {
		try {
			Date start = new Date();
			System.err.println("Start : " + start);
			orderService.batchInsert(20000);
			Date end = new Date();
			System.err.println("End : " + end);
			System.err.println("Take {" + (end.getTime() - start.getTime()) + "} ms .");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
