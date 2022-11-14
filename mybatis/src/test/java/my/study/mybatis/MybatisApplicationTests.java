package my.study.mybatis;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import my.study.mybatis.dao.MecfsirmtDAO;

@SpringBootTest
class MybatisApplicationTests {

	@Autowired
	private DataSource datasource;

	@Autowired
	private MecfsirmtDAO mecfsirmtDAO;

	@Test
	void contextLoads() {

		assertNotNull(datasource);
		assertNotNull(mecfsirmtDAO);
	}
	
	

}
