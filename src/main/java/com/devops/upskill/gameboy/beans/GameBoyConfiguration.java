package com.devops.upskill.gameboy.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GameBoyConfiguration {
    @Bean
    public String Name(){
        return "Tinesh Babu Katta";
    }
    @Bean
    public String Profession(){
        return "DevOps Engineer";
    }
    @Bean
    public String Company(){
        return "Credit Suisse";
    }
    @Bean(name = "EmpId")
    public Integer EmployeeId(){
        return 933337;
    }
    @Bean(name = "Adr")
    public String Adress(){
        return "Eon Free Zone, Phase2, Kharadi, Maharashtra";
    }
}
