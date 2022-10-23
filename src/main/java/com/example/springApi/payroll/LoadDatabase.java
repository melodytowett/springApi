package com.example.springApi.payroll;

//import com.example.springApi.Employee;
//import org.hibernate.boot.model.relational.Database;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository,OrderRepository orderRepository){
        return args -> {
            employeeRepository.save(new Employee("melody","towett","software"));
            employeeRepository.save(new Employee("khan", "towett","software developer"));
            employeeRepository.findAll().forEach(employee -> log.info("preloaded"+ employee));
//            orderRepository.save(new Order("MacBook pro",Status.COMPLETED));
//            orderRepository.save(new Order("iphone",Status.IN_PROGRESS));
//            orderRepository.findAll().forEach(order -> {
//                log.info("Preloaded" + order);
//            });
        };
    }
}
