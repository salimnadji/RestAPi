package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log= LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
     CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository){
        return args -> {
            log.info("preloading "+ employeeRepository.save(new Employee("Nadji","Salim","Developer")));
            log.info("preloading "+ employeeRepository.save(new Employee("Yeshy","Rodreguez","ImageTech")));

            employeeRepository.findAll().forEach(employee -> log.info("preloaded :"+employee));

            log.info("preloading "+orderRepository.save(new Order("Iphone",Status.IN_PROGRESS)));
            log.info("preloading "+orderRepository.save(new Order("Mac pro",Status.COMPLETED)));
            orderRepository.findAll().forEach(order -> log.info("preloaded :"+order));
        };
    }
}
