package com.example.springApi.payroll;

//import com.example.springApi.Employee;
//import org.hibernate.boot.model.relational.Database;
import com.example.springApi.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository){
        return args -> {
            log.info("Preloading" + repository.save(new Employee("melody","software")));
            log.info("preloading" + repository.save(new Employee("khan towett","software developer")));
        };
    }
}
