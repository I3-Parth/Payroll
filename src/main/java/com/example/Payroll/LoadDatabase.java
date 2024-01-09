package com.example.Payroll;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import java.util.logging.Logger;
import org.slf4j.Logger;

@Configuration
public class LoadDatabase {
    private static final Logger log= LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){
        return args -> {
            log.info("Preloading "+repository.save(new Employee("Ashish","Patil","SDE")));
            log.info("Preloading "+repository.save(new Employee("Ajit","Gokhale","Manager")));
        };
    }
}
