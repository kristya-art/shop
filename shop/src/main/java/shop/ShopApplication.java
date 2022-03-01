package shop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shop.user.model.Customer;
import shop.user.repository.CustomerRepository;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class ShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(CustomerRepository CustomerRepository){
//		return  args -> {
//			Customer Customer1 = new Customer("Alic", "alic@gmx.com");
//			Customer Customer3 = new Customer("Make", "make@gmx.com");
//			Customer Customer2 = new Customer("Karol", "karol@gmx.com");
//
//			ArrayList<Customer> list = new ArrayList<>();
//			list.add(Customer1);
//			list.add(Customer2);
//			list.add(Customer3);
//			for(Customer u: list){
//				CustomerRepository.save(u);
//			}
//						CustomerRepository.findAll().forEach(System.out::println);
//		};
//	}
//   @Bean
//	public CommandLineRunner commandLineRunner(ApplicationContext ctx){
//		return args -> {
//			System.out.println("Let's inspect the beans:");
//			String[] beanNames =
//					ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for(String name : beanNames){
//				System.out.println(name);
//			}
//		};
//   }
}
