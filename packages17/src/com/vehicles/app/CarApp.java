package com.vehicles.app;

import com.vehicles.parts.Engine;
import com.vehicles.Car;

public class CarApp {
	public static void main(String[] args) {
		Engine engine=new Engine();
		Car car=new Car();
		
		engine.setEngineType("Diesel");
		engine.setHorsepower(1000);
		engine.showEngineDetails();
		
		System.out.println("________");
		
		car.setBrand("BMW");
		car.setModel("2025");
		car.setPrice(2500000.00000);
		car.showCarDetails();
    }
}
