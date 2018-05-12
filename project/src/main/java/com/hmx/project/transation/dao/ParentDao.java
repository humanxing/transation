package com.hmx.project.transation.dao;

import org.apache.ibatis.annotations.Select;

import com.hmx.project.transation.vo.ParentInfo;

public interface ParentDao {
	@Select("insert into TRAN_TEST_PARENT (ID,CODE,NAME) values( #{id},#{code},#{name})")
	public void save(ParentInfo parent);
}
