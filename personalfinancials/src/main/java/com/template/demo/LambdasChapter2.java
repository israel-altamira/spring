package com.template.demo;

import java.text.SimpleDateFormat;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.swing.text.DateFormatter;

public class LambdasChapter2 {

	// Pregunta 2B
	static ThreadLocal<DateFormatter> formatter = ThreadLocal
			.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

	public void execute() {
		Predicate<Long> predicate = x -> x > 1;
		System.out.println("predicate.test(123l)" + predicate.test(123l));

		// Pregunta 2A
		ThreadLocal<String> thread = ThreadLocal.withInitial(new Supplier<String>() {
			@Override
			public String get() {
				return "ThreadName=1234TT";
			}
		});
		ThreadLocal<String> otherthread = ThreadLocal.withInitial(() -> "anotherThread1234");
	}
}
