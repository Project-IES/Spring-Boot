package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.ashokit.entities.ContactsMasterEntity;
import com.ashokit.repositories.ContactsMasterRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactsMasterRepository bean = context.getBean(ContactsMasterRepository.class);
		
		int pageSize=3;
		int pageNo=1;
		
		PageRequest pageReq=PageRequest.of(pageNo, pageSize);
		Page<ContactsMasterEntity> pageData = bean.findAll(pageReq);
		int totalPages = pageData.getTotalPages();
		System.out.println("Total page required= "+totalPages);
		
		List<ContactsMasterEntity> list = pageData.getContent();
		list.forEach(entity->{
			System.out.println(entity);
		});
		
		//List<ContactsMasterEntity> list = bean.findAll();
		/*List<ContactsMasterEntity> list = bean.findAll(Sort.by("contactName").descending());
		list.forEach(entity-> {
			System.out.println(entity);
		});*/
		
	}

}

