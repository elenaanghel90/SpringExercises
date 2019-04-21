package com.sda.production;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class Worker {

    public static final Log LOGGER = LogFactory.getLog(Worker.class);
    private String profession;
    private int age;
    @Autowired
    private WorkerMotto workerMotto;
    List<Tool> tools;


    public Worker(String profession, int age, WorkerMotto workerMotto) {
        this.profession = profession;
        this.age = age;
        this.workerMotto = workerMotto;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void initWorker() {
        LOGGER.info("welcome to log and initialize");
    }

    public void destroyWorker() {
        LOGGER.info("Left the log and destroy");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Worker worker = (Worker) o;

        if (age != worker.age) return false;
        return profession.equals(worker.profession);
    }

    @Override
    public int hashCode() {
        int result = profession.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "profession='" + profession + '\'' +
                ", age=" + age +
                ", workerMotto=" + workerMotto +
                ", tools=" + tools +
                '}';
    }
}
