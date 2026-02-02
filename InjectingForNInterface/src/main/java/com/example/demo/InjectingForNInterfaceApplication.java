package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class InjectingForNInterfaceApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(InjectingForNInterfaceApplication.class, args);
		
		Student st = ac.getBean(Student.class);
		st.study();
		st.useObject();
		
	}

}
