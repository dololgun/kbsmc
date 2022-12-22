package my.study.mybatis.svc.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.study.mybatis.dao.MecfsirmtDAO;
import my.study.mybatis.dvo.PtntItemRcrdDVO;
import my.study.mybatis.svc.PtntItemRcrdSvc;

@Service
public class PtntItemRcrdSvcImpl implements PtntItemRcrdSvc {

	private MecfsirmtDAO mecfsirmtDAO;

	@Autowired
	public void setMecfsirmtDAO(MecfsirmtDAO mecfsirmtDAO) {
		this.mecfsirmtDAO = mecfsirmtDAO;
	}

	@Override
	public List<PtntItemRcrdDVO> getPtntItemRcrdList(Long cnosRcrdNo) {
		var ptntItemRcrd = new PtntItemRcrdDVO();
		ptntItemRcrd.setCnosRcrdNo(cnosRcrdNo);
		return mecfsirmtDAO.getMecfsirmtList(ptntItemRcrd);
	}

}
