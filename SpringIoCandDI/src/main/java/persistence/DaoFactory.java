package persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class DaoFactory {
	@Bean
	public static ItemDAO create() {
		return new ItemDAO();
	}
}

