package cn.hr.dao;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hr.bean.Car;

@Service(value="carDao")
public class CarDao {
//	@Autowired
//	private Car car;  //使用注解注入对象属性实现一
	
	@Resource(name="car")
	private Car car;   //使用注解注入对象属性二
	
	public void add() {
		car.setCarName("bmw");
		car.setPrice(200000);
		System.out.println("cardao add...." + car.toString());
	}
}
