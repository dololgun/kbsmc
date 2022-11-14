package my.study.mybatis.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
import my.study.mybatis.entity.Mecfsirmt;

@SpringBootTest
@Slf4j
public class MecfsirmtDAOTest {

	@Autowired
	private MecfsirmtDAO mecfsirmtDAO;

	@Test
	public void getMecfsirmt() {

		Mecfsirmt mecfsirmt = mecfsirmtDAO.getMecfsirmt(11980L);

		log.info("mecfsirmt={}", mecfsirmt);

	}

}
