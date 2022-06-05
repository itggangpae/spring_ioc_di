import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import domain.CollectionBean;
import service.UserService;

public class Main {

	public static void main(String[] args) {
		try (GenericXmlApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");) {
			UserService service = context.getBean(UserService.class);
			System.out.println(service.getUser());
		} catch (Exception e) {
			e.printStackTrace();
		}	

	}
}
