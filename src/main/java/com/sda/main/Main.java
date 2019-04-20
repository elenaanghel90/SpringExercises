package com.sda.main;

import com.sda.production.Worker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String[] beans = new String[]{
                "worker.xml", "tools.xml"};
        ApplicationContext xmlapplicationContext = new ClassPathXmlApplicationContext(beans);
        Worker testWorker = xmlapplicationContext.getBean(Worker.class);
        System.out.println("Worker with age: " + testWorker.getAge() + ", with profession: " + testWorker.getProfession());
    }
}
