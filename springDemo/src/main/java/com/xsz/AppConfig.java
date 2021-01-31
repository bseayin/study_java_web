package com.xsz;

import com.xsz.services.PetStoreService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
@SpringBootApplication
public class AppConfig {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml", "daos.xml");
        // retrieve configured instance
        PetStoreService service = context.getBean("petStore", PetStoreService.class);
        // use configured instance
        List<String> userList = service.getUsernameList();
        System.out.println(userList);
        SpringApplication.run(AppConfig.class, args);
    }

}
