package my.study.mybatis.svc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class PtntItemRcrdSvcTest {

	@Autowired
	private PtntItemRcrdSvc ptntItemRcrdSvc;

	@Test
	public void getPtntItemRcrdList() {
		var ptntItemRcrdList = ptntItemRcrdSvc.getPtntItemRcrdList(6045L);
		ptntItemRcrdList.forEach(it -> log.debug("it={}", it));

	}
}
