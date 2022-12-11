package com.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entities.ContactsMasterEntity;
import com.ashokit.repositories.ContactMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactMasterRepo bean = context.getBean(ContactMasterRepo.class);
		List<String> names=bean.findContactNameByContactNumber(943375415);
		names.forEach(name-> {
			System.out.println(name);
		});
		
		
		
		/*bean.deleteById(100);*/
		
		/*Iterable<ContactsMasterEntity> entities = bean.findAll();
		entities.forEach(entity-> {
			System.out.println(entity);
		});*/
		
		/*Iterable<ContactsMasterEntity> entities = bean.findAllById(Arrays.asList(101,100));//take the value and convert into List
		entities.forEach(entity-> {
			System.out.println(entity);
		});*/
		
		/*ContactsMasterEntity entity = new ContactsMasterEntity();
		entity.setContacId(101);
		entity.setContactName("Parambrata");
		entity.setContactNumber((long) 943375415);
		bean.save(entity); */
		
		/*Optional<ContactsMasterEntity> opt = bean.findById(1001);
		if(opt.isPresent()) {
			ContactsMasterEntity entity=opt.get();
			System.out.println(entity);
		}
		else
			System.out.println("No record found");*/
		context.close();
	}
}

