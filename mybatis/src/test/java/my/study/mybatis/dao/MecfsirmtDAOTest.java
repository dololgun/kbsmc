package my.study.mybatis.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class MecfsirmtDAOTest {

	@Autowired
	private MecfsirmtDAO mecfsirmtDAO;

	@Test
	public void getMecfsirmt() {

		var cnosRcrdMstrNoP = 11980L;
		var mecfsirmt = mecfsirmtDAO.getMecfsirmt(cnosRcrdMstrNoP);

		log.info("mecfsirmt={}", mecfsirmt);

		assertEquals(mecfsirmt.getCnosRcrdMstrNo(), cnosRcrdMstrNoP);
	}

}
