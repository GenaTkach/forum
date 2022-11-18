package telran.java2022;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import telran.java2022.accounting.dao.UserAccountRepository;

@SpringBootApplication
public class ForumServiceApplication{
	
	@Autowired
	UserAccountRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ForumServiceApplication.class, args);
	}

}
