package com.hmx.project.transation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hmx.project.transation.service.ChildService;
import com.hmx.project.transation.service.ParentService;

@RestController
public class TestController {
	@Autowired
	ParentService parentService;

	@Autowired
	ChildService bService;

	@RequestMapping(value = "/test/{id}")
	@ResponseBody
	public String saveUser(@PathVariable int id) {
		parentService.parent(id);
		return "success";
	}
}