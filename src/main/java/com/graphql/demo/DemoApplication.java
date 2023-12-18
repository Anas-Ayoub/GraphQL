package com.graphql.demo;

import com.graphql.demo.dao.entities.Car;
import com.graphql.demo.dao.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private CarRepository cr;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		cr.saveAll(
				List.of(
						Car.builder().model("MERCEDES").color("Black").price(70000F).build(),
						Car.builder().model("SEAT").color("White").price(40000F).build(),
						Car.builder().model("BMW").color("Black").price(60000F).build()
				)
		);
	}
}
