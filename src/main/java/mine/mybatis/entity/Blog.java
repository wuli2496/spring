package mine.mybatis.entity;

import java.util.List;

import lombok.Data;

@Data
public class Blog {
	private Integer id;
	
	private String title;
	
	
	private Author author;
	
	private List<Post> posts;
}
