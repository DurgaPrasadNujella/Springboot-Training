package com.bootjpa.jpacodeexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(method= RequestMethod.GET, value="/bootjpa/{bootjpaID}")
	public Bootjpa getByBootjpaID(@PathVariable int bootjpaID) {
		return bootjpaService.getByBootjpaID(bootjpaID);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/bootjpa/{bootjpaName}")
	public Bootjpa getByBootjpaName(@PathVariable String bootjpaName) {
		return bootjpaService.getByBootjpaName(bootjpaName);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/bootjpa/{deletebootjpaID}")
	public Bootjpa deleteByBootjpaID(@PathVariable int bootjpaID) {
		return bootjpaService.deleteByBootjpaID(bootjpaID);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/deleteAllbootjpa")
	public List<Bootjpa> deleteAllBootjpa() {
		return bootjpaService.deleteAllBootjpas();
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/bootjpa/{bootjpaOne}")
	public Bootjpa getByBootjpaOne(@PathVariable String bootjpaOne) {
		return bootjpaService.getByBootjpaOne(bootjpaOne);
	}
	
	@RequestMapping(method= RequestMethod.GET, value="/bootjpa/{bootjpaNameContaining}")
	public Bootjpa getByBootjpaNameContain(@PathVariable String bootjpaNameContain) {
		return bootjpaService.getByBootjpaNameContain(bootjpaNameContain);
	}
}
