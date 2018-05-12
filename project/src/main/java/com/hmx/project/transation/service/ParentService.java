package com.hmx.project.transation.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hmx.project.transation.dao.ChildDao;
import com.hmx.project.transation.dao.ParentDao;
import com.hmx.project.transation.vo.ParentInfo;

/**
 * ((ParentService) AopContext.currentProxy()).

 *
 */
@Service
public class ParentService {
	public static final Logger logger = Logger.getLogger(ParentService.class);

	@Autowired
	private ChildService childService;

	@Autowired
	private ParentDao parentDao;

	@Autowired
	private ParentService parentService;

	@Autowired
	private ChildDao childDao;

	@Transactional(propagation = Propagation.REQUIRED)
	public void parent(int id) {
		ParentInfo parent = new ParentInfo();
		parent.setId(id);
		parent.setName("parentName" + id);
		parent.setCode("parentCode" + id);
		parentDao.save(parent);

		try {
			childService.child(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
