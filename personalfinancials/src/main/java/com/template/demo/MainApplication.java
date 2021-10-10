package com.template.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		LambdasChapter2 lambdas = new LambdasChapter2();
		lambdas.execute();

		ApplicationContext context = new ClassPathXmlApplicationContext();

		System.out.println("webapp ends.");
	}

}
