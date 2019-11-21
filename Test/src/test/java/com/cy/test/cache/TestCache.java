package com.cy.test.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.cy.Cache;
import com.cy.DefaultCache;
@SpringBootTest
public class TestCache {
	
	//@Autowired
	//private DefaultCache defaultCache;
	@Autowired
	private Cache defaultCache;
	@Autowired
	private ApplicationContext ctx;
	
	@Test
	public void testCache() {
		System.out.println("defaultCache()");
	}
	@Test
	public void ctx() {
		System.out.println("defaultCache()");
		Object obj = ctx.getBean("defaultCache");
		System.out.println(obj==defaultCache);
	}
}
