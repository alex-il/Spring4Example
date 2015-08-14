package com.verint.api.services;

import org.springframework.stereotype.Service;

/**
 * Spring bean
 * 
 */

@Service("aaa")
public class HelloWorld {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
	}
}