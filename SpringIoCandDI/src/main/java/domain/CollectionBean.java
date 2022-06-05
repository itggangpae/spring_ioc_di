package domain;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import lombok.Data;

@Data
public class CollectionBean {
	private List<String> list;
	private Set<String> set;
	private Map<String, Object> map;
	private Properties properties;	
}