package my.study.mybatis.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;
import my.study.mybatis.dvo.PtntItemRcrdDVO;

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

	@Test
	public void getMecfsirmtList() {

		var ptntItemRcrd = new PtntItemRcrdDVO();

		ptntItemRcrd.setCnosRcrdNo(6045L);

		var ptntItemRcrdList = mecfsirmtDAO.getMecfsirmtList(ptntItemRcrd);

		ptntItemRcrdList.forEach(it -> log.debug("it={}", it));

	}

}
