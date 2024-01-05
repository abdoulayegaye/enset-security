package ma.enset.customerfrontthymeleafapp;

import ma.enset.customerfrontthymeleafapp.entity.Customer;
import ma.enset.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Abdoulaye").email("abdoulaye@gmail.com").build());
            customerRepository.save(Customer.builder().name("Fatou").email("fatou@gmail.com").build());
            customerRepository.save(Customer.builder().name("Moussa").email("moussa@gmail.com").build());
        };
    }
}
