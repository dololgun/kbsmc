package my.study.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import my.study.mybatis.dvo.PtntItemRcrdDVO;
import my.study.mybatis.dvo.PtntItemRcrdRecord;
import my.study.mybatis.entity.Mecfsirmt;

public interface MecfsirmtDAO {

	@Select("""
			select a.cnos_rcrd_mstr_no
			     , a.cnos_rcrd_no
			  from mecfsirmt a
			 where a.cnos_rcrd_mstr_no = #{cnosRcrdMstrNo}
			""")
	Mecfsirmt getMecfsirmt(@Param("cnosRcrdMstrNo") Long cnosRcrdMstrNo);

	List<PtntItemRcrdDVO> getMecfsirmtList(@Param("ptntItemRcrd") PtntItemRcrdDVO ptntItemRcrd);

	List<PtntItemRcrdRecord> getMecfsirmtList1(@Param("ptntItemRcrd") PtntItemRcrdRecord ptntItemRcrd);

}
