package com.baojuan.service;

import java.util.List;

import com.baojuan.pojo.Flower;

public interface FlowerService {
/**
 *展示花卉信息
 */
	public List<Flower> show();
	
	public int add(Flower flower);
}
