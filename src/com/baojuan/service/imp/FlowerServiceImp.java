package com.baojuan.service.imp;

import java.util.List;

import com.baojuan.dao.FlowerDao;
import com.baojuan.dao.imp.FlowerDaoImp;
import com.baojuan.pojo.Flower;
import com.baojuan.service.FlowerService;

public class FlowerServiceImp implements FlowerService {
	private FlowerDao flowerdao = new FlowerDaoImp();

	public List<Flower> show() {

		return flowerdao.selAll();
	}

	@Override
	public int add(Flower flower) {
		return flowerdao.insertFlower(flower);
	}

}
