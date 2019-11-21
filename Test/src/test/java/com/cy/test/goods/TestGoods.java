package com.cy.test.goods;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.goods.dao.GoodsDao;

@SpringBootTest
public class TestGoods {
	
	@Autowired
	private GoodsDao goodsDao;
	@Test
	public void test() {
		int rows = goodsDao.deletById(10);
		System.out.println("rows="+rows);
	}
	@Test
	public void test2() {
		int rows = goodsDao.deleteObjects(13,15);
		System.out.println("rows="+rows);
	}
}
