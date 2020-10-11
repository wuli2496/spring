package mybatis.entity;

import lombok.Data;

@Data
public class Author {
	private Integer id;
	
	private String username;
	
	private String password;
	
	private String email;
}
