package my.study.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import my.study.mybatis.entity.Mecfsirmt;

@Mapper
public interface MecfsirmtDAO {

	@Select("""
			select a.cnos_rcrd_mstr_no
			     , a.cnos_rcrd_no
			  from mecfsirmt a
			 where a.cnos_rcrd_mstr_no = #{cnosRcrdMstrNo}
			""")
	public Mecfsirmt getMecfsirmt(@Param("cnosRcrdMstrNo") Long cnosRcrdMstrNo);

}
