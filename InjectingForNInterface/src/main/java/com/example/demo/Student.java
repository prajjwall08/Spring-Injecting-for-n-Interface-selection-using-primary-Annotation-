package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
	ElectronicGoods ref;
	void study() {
		System.out.println("Student is studying");
	}
	void useObject() {
		ref.useDevice();
	}
	public Student(ElectronicGoods ref) {
		super();
		this.ref = ref;
	}
	
	
}
