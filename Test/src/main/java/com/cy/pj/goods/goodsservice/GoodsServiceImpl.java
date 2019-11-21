package com.cy.pj.goods.goodsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
	
	@Autowired
	private GoodsDao goodsDao;
	
	@Override
	public int deleteObjects(Integer... ids) {
		System.out.println("start:"+System.currentTimeMillis());
		int rows = goodsDao.deleteObjects(5,9);
		System.out.println("end:"+System.currentTimeMillis());
		return rows;
	}

}
