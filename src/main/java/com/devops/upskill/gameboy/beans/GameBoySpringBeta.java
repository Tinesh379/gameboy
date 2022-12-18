package com.devops.upskill.gameboy.beans;
import com.devops.upskill.gameboy.beans.GameBoyConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class GameBoySpringBeta {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GameBoyConfiguration.class)) {
            System.out.println(context.getBean("Name"));
            System.out.println(context.getBean("Profession"));
            System.out.println(context.getBean("Company"));
            System.out.println(context.getBean("EmpId"));
            System.out.println(context.getBean("Adr"));
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
