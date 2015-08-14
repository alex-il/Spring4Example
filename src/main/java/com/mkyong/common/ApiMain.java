package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.verint.api.services.CustomerService;
import com.verint.api.services.HelloWorld;


@Configuration
@ComponentScan("com.verint.api")
public class ApiMain {

 
  public static void main(String[] args) {
      ApplicationContext context = 
          new AnnotationConfigApplicationContext(ApiMain.class);
      CustomerService cust = (CustomerService) context.getBean("customerService");
      System.out.println(cust);
  
      HelloWorld obj = (HelloWorld) context.getBean("aaa");
  		obj.printHello();
  }
}
