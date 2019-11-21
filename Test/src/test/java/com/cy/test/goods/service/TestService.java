package com.cy.test.goods.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.goods.service.GoodsService;

@SpringBootTest
public class TestService {
	
	@Autowired
	private GoodsService goodsService;
	@Test
	public void test() {
		goodsService.deleteObjects(6,8);
	}
}
