package de.codecentric.workshop.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.cloud.task.listener.annotation.AfterTask;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.cloud.task.repository.TaskRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class TaskApp {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(TaskApp.class, args);
    }

    @Bean
    public CommandLineRunner command1() {
        return args -> System.out.println("adsasd");
    }

    @AfterTask
    public void afterMe(TaskExecution taskExecution) {
        System.out.println("dafaf");
    }
}
