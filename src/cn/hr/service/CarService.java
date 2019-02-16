package cn.hr.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import cn.hr.dao.CarDao;

public class CarService {
	@Autowired
	private CarDao carDao;
	//service中引入dao
	public void add() {
		System.out.println("carService add...");
		carDao.add();
		
	}
}
