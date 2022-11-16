package my.study.mybatis.svc;

import java.util.List;

import my.study.mybatis.dvo.PtntItemRcrdDVO;

public interface PtntItemRcrdSvc {
	List<PtntItemRcrdDVO> getPtntItemRcrdList(Long cnosRcrdNo);
}
