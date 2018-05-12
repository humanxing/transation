package com.hmx.project.transation.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hmx.project.transation.base.ThirdService;
import com.hmx.project.transation.dao.ChildDao;
import com.hmx.project.transation.vo.ChildInfo;

@Service
public class ChildService {

	public static final Logger logger = Logger.getLogger(ChildService.class);
	@Autowired
	private ThirdService thirdService;
	@Autowired
	private ChildDao childDao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void child(int id) {
		ChildInfo child = new ChildInfo();
		child.setId(id);
		child.setCode("childCode" + id);
		child.setName("childName" + id);
		childDao.save(child);
		int i = 1 / 0;

		// thirdService.third(id);
	}
}

// thirdService.third(id);