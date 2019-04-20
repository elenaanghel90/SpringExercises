package com.sda.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String[] beans = new String[]{
                "worker.xml", "tools.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(beans);
    }
}
