package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class Laptop implements ElectronicGoods{
	public void useDevice() {
		System.out.println("Laptop is been used");
	}
}
