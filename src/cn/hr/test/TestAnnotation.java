package cn.hr.test;

import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hr.bean.Car;
import cn.hr.service.CarService;

public class TestAnnotation {

	@Test
	public void car() {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Car car=  (Car) context.getBean("car");
		car.add();
	}
	
	@Test
	public void add() {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		CarService carService = (CarService) context.getBean("carService");
		carService.add();
	}
	
	
}
