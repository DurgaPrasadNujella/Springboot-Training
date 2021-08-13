package com.bootjpa.jpacodeexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootjpa.jpacodeexample.model.Bootjpa;
import com.bootjpa.jpacodeexample.service.BootjpaService;


@RestController
public class BootjpaController {

	@Autowired
	BootjpaService bootjpaService;
	
	@RequestMapping(method= RequestMethod.POST, value="/bootjpa")
	public Bootjpa addNewMethod(@RequestBody Bootjpa bootjpa) {
		return bootjpaService.addBootjpa(bootjpa);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/bootjpa")
	public List<Bootjpa> getAllBootjpa() {
		return bootjpaService.getBootjpas();
	}
	
	
}
