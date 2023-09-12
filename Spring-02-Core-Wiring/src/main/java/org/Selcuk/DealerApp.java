package org.Selcuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class DealerApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);
        Car car = container.getBean(Car.class);
        Person person = container.getBean(Person.class);
        System.out.println("Person's name is : " + person.getName());
        System.out.println("Car's make is : " + car.getMake());
        System.out.println("Person's car is : " + person.getCar().getMake());
    }


}
