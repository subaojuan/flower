package com.baojuan.dao;

import java.util.List;

import com.baojuan.pojo.Flower;

public interface FlowerDao {
	/**
	 * 查询全部
	 * @return
	 */
List<Flower> selAll();
/**
 * 新增花卉
 */
int insertFlower(Flower flower);
}
