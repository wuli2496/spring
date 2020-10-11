package mybatis.entity;

import lombok.Data;

@Data
public class Post {
	private Integer id;
	
	private Integer blogId;
	
	private String content;
}
