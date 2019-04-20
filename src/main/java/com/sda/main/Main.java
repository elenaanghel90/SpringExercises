package com.sda.main;

import com.sda.production.Tool;
import com.sda.production.Worker;
import com.sda.production.WorkerMotto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String[] beans = new String[]{
                "worker.xml", "tools.xml"};
        ApplicationContext xmlapplicationContext = new ClassPathXmlApplicationContext(beans);
        Worker testWorker = xmlapplicationContext.getBean(Worker.class);
        Tool testTool = xmlapplicationContext.getBean(Tool.class);
        WorkerMotto testWorkerMoto = xmlapplicationContext.getBean(WorkerMotto.class);
        System.out.println("Worker with age: " + testWorker.getAge() + ", with profession: "
                + testWorker.getProfession() + ", has the tool " + testTool.getName() +" with weight "+ testTool.getWeight() +
                ". The worker has the next citate: "+ testWorkerMoto.getCitate());

    }
}
