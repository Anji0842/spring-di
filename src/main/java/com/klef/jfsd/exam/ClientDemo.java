package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        // Load the context using Java-based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve and print Employee bean
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);

        // Retrieve and print Course bean
        Course course = context.getBean(Course.class);
        System.out.println(course);
    }
}
