package com.sda.main;

import com.sda.com.sda.config.WorkerConfig;
import com.sda.production.Worker;
import com.sda.production.WorkerMotto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String[] beans = new String[]{
                "worker.xml", "tools.xml"};
        ApplicationContext xmlapplicationContext = new ClassPathXmlApplicationContext(beans);

        Worker worker = xmlapplicationContext.getBean(Worker.class);
        //Worker worker1 = xmlapplicationContext.getBean(Worker.class);
        System.out.println("\n\n" + worker + "\n\n");

        ApplicationContext annotationApplicationContext =
                new AnnotationConfigApplicationContext(WorkerConfig.class);

        WorkerMotto workerMottoAnnotation= annotationApplicationContext.getBean(WorkerMotto.class);
        System.out.println(workerMottoAnnotation);





//        Tool tool = xmlapplicationContext.getBean(Tool.class);
//        System.out.println(tool);
//        WorkerMotto testWorkerMoto = xmlapplicationContext.getBean(WorkerMotto.class);
//
//        System.out.println(worker.toString());

//        if (worker == worker1) {
//            System.out.println("We have this worker");
//        } else {
//            System.out.println("We have two workers");
//        }

//        System.out.println("Worker with age: " + testWorker.getAge() + ", with profession: "
//                + testWorker.getProfession() + ", has the tool " + testTool.getName() +" with weight "+ testTool.getWeight() +
//                ". The worker has the next citate: "+ testWorkerMoto.getCitate());

    }
}
