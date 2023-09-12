package org.Selcuk.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);
        FullTimeMentor fullTimeMentor = container.getBean(FullTimeMentor.class);
        //PartTimeMentor partTimeMentor = container.getBean("p1",PartTimeMentor.class);
        PartTimeMentor partTimeMentor = container.getBean(PartTimeMentor.class);

        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();

        String string = container.getBean(String.class);
        System.out.println("string = " + string);

    }
}
