package persistence;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import domain.User;

@Repository
public class UserDAO implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware  {
	private ApplicationContext context;
	private String beanName;

	@Override
	public void setBeanName(String arg0) {
		beanName = arg0;
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		context = arg0;
	}

	
	public User getUser() {
		User user = new User();
		user.setId("itstudy");
		user.setPw("1234");
		return user;
	}
	
	@PostConstruct
	public void annoInit(){
		System.out.println("어노테이션을 이용한 초기화 메서드");
	}
		
	@PreDestroy
	public void annoDestroy(){
		System.out.println("어노테이션을 이용한 소멸자 메서드");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("인터페이스를 이용한 소멸자 메서드");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("인터페이스를 이용한 초기화 메서드");
	}

}
