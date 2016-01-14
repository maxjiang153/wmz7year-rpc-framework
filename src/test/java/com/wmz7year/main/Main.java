package com.wmz7year.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.wmz7year.main.annotation.EnableWmz7year;

@EnableWmz7year
@Configuration
@ComponentScan
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		System.out.println(context);
	}
}
