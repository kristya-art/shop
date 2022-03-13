package shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

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
