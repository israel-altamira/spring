package com.template.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.template.demo.model.SequenceGenerator;
import com.template.demo.model.SequenceGeneratorBasic;

public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		System.out.println("instanciate with properties");
		SequenceGeneratorBasic properties = (SequenceGeneratorBasic) context.getBean("properties");
		System.out.println(properties.getSequence());
		System.out.println(properties.getSequence());
		System.out.println(properties.getSequence());
		System.out.println(properties.getSequence());
		System.out.println(properties.getSequence());
		
		System.out.println("instanciate with constructor");
		SequenceGeneratorBasic constructor = (SequenceGeneratorBasic) context.getBean("constructor");
		System.out.println(constructor.getSequence());
		System.out.println(constructor.getSequence());
		System.out.println(constructor.getSequence());
		System.out.println(constructor.getSequence());
		System.out.println(constructor.getSequence());
		System.out.println(constructor.getSequence());

		System.out.println("instanciate with properties and shortcut declaration");
		SequenceGeneratorBasic propertiesshortcut = (SequenceGeneratorBasic) context.getBean("properties-shortcut");
		System.out.println(propertiesshortcut.getSequence());
		System.out.println(propertiesshortcut.getSequence());
		System.out.println(propertiesshortcut.getSequence());
		System.out.println(propertiesshortcut.getSequence());
		System.out.println(propertiesshortcut.getSequence());

		System.out.println("instanciate with properties and shortcut declaration");
		SequenceGeneratorBasic constructorshortcut = (SequenceGeneratorBasic) context.getBean("constructor-shortcut");
		System.out.println(constructorshortcut.getSequence());
		System.out.println(constructorshortcut.getSequence());
		System.out.println(constructorshortcut.getSequence());
		System.out.println(constructorshortcut.getSequence());
		System.out.println(constructorshortcut.getSequence());

		System.out.println("instanciate a generator");
		SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());

		System.out.println("webapp ends.");
	}

}
