package com.hmx.project.transation.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hmx.project.transation.dao.ParentDao;
import com.hmx.project.transation.vo.ParentInfo;

@Service
public class FourService {

	@Autowired
	private ParentDao parentDao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void change() {
		ParentInfo parent = new ParentInfo();
		parent.setId(100);
		parent.setName("ThirdName" + 100);
		parent.setCode("ThirdCode" + 100);
		parentDao.save(parent);
		int t = 1 / 0;

	}
}
