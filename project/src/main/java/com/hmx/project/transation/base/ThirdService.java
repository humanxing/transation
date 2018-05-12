package com.hmx.project.transation.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hmx.project.transation.dao.ParentDao;

@Service
@Transactional
public class ThirdService {
	@Autowired
	private ParentDao parentDao;

	@Autowired
	private FourService fourService;

	public void third(int id) {
		try {
			change();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public void change() {
		fourService.change();
	}

}
