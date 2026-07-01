package com.library.LibraryManagement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;
@SpringBootApplication
public class LibraryManagementApplication {
    public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService service= (BookService) context.getBean("BookService");
		service.addBook();
		SpringApplication.run(LibraryManagementApplication.class, args);
        //System.out.println("hello");

	}
    
}
