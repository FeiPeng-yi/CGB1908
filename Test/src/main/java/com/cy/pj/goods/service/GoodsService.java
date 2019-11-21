package com.cy.pj.goods.service;

import org.springframework.stereotype.Service;

@Service
public interface GoodsService {
	
	int deleteObjects(Integer... ids);
}
