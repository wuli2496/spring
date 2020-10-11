package mine.spring_study.mybatis;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;
import mybatis.entity.Blog;

@Slf4j
public class TestMybatis {
	
	private SqlSession sqlSession;
	
	@Before
	public void init() throws Exception{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
	}
	
	@Test
	public void testSelectById() {
		List<Blog> blogs = sqlSession.selectList("mybatis.dao.BlogDao.selectById", 1);
		
		log.info("size:{}, blogs:{}", blogs.size(), blogs);
		
	}
}
