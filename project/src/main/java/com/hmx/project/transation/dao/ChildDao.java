package com.hmx.project.transation.dao;

import org.apache.ibatis.annotations.Select;

import com.hmx.project.transation.vo.ChildInfo;

public interface ChildDao {
	@Select("insert into TRAN_TEST_CHILD (ID,CODE,NAME) values( #{id},#{code},#{name})")
	public void save(ChildInfo child);
}
