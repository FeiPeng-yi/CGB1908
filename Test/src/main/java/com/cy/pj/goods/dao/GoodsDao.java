package com.cy.pj.goods.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsDao {
	@Delete("delete from tb_goods where id=#{id}")
	int deletById(Integer id);
	
	int deleteObjects(Integer... ids);
	
}
