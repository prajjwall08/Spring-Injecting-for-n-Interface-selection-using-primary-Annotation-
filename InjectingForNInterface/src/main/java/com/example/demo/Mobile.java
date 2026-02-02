package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mobile implements ElectronicGoods{
	public void useDevice() {
		System.out.println("mobile is been used");
	}
}
