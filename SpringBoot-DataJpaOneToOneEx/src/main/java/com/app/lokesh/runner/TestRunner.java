package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.entity.Car;
import com.app.lokesh.entity.Engine;
import com.app.lokesh.repository.CarRepository;
import com.app.lokesh.repository.EngineRepository;

@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private CarRepository carRepository;
	@Autowired
	private EngineRepository engineRepository;

	@Override
	public void run(String... args) throws Exception {
		Engine engine = new Engine(100012,"Automatic");
		engineRepository.save(engine);
		
		Car car = new Car(1001,"BMW",4500000.0,engine);
		carRepository.save(car);
	}
}
