package com.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.vehicle.Car;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome to spring core xml based configuration for beans!\n");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        // Setter injection
        Car car = (Car) context.getBean("car");
        car.carStart();
    }
}