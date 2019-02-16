package cn.hr.bean;

import org.springframework.stereotype.Component;

@Component(value="car")
public class Car {
	private String carName;
	private int price;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public void add() {
		System.out.println("增加一辆车");
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", price=" + price + "]";
	}
	
}
