package com.bootjpa.jpacodeexample.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bootjpa.jpacodeexample.model.Bootjpa;
import com.bootjpa.jpacodeexample.service.BootjpaService;
import com.google.common.net.MediaType;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


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
	
	@RequestMapping(method= RequestMethod.GET, value="/bootjpa/{bootjpaID}")
	public Bootjpa getByBootjpaIDAll(@PathVariable int bootjpaID) {
		return bootjpaService.getByBootjpaIDAll(bootjpaID);
	}
	
	
	
	
	/*
	 * @PutMapping("/bootjpa/{bootjpaID}")
	 * 
	 * @ApiOperation(value= "Update the Bootjpa resourse") public Bootjpa
	 * updateBootjpa(@ApiParam( value="Book Object is Mandatory",
	 * required=true)@Valid
	 * 
	 * @RequestBody Bootjpa bootjpa, @PathVariable int bootjpaID) { return
	 * bootjpaService.updateBootjpa(bootjpaID); }
	 */
	 
	
	
	@RequestMapping(method= RequestMethod.GET, value="/bootjpa/{bootjpaName}")
	public Bootjpa getByBootjpaName(@PathVariable String bootjpaName) {
		return bootjpaService.getByBootjpaName(bootjpaName);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/bootjpa/{deletebootjpaID}")
	public Bootjpa deleteByBootjpaID(@PathVariable int bootjpaID) {
		return bootjpaService.deleteByBootjpaID(bootjpaID);
	}
	
	/*
	 * @RequestMapping(method= RequestMethod.DELETE, value="/deleteAllbootjpa")
	 * public List<Bootjpa> deleteAllBootjpa() { return
	 * bootjpaService.deleteAllBootjpas(); }
	 */
	
	@RequestMapping(method= RequestMethod.GET, value="/bootjpa/{bootjpaOne}")
	public Bootjpa getByBootjpaOne(@PathVariable String bootjpaOne) {
		return bootjpaService.getByBootjpaOne(bootjpaOne);
	}
	
	@GetMapping(path = "/{bootjpaIdCustom}")
	public ResponseEntity<Object> getByBootjpaOneCustom(@PathVariable int bootjpaIdCustom) {
		// Faulty Code
		String firtname = null;
		
		return bootjpaService.getByBootjpaOneCustom(bootjpaIdCustom);
		
	}
	/*
	 * @RequestMapping(method= RequestMethod.GET,
	 * value="/bootjpa/{bootjpaNameContaining}") public Bootjpa
	 * getByBootjpaNameContain(@PathVariable String bootjpaNameContain) { return
	 * bootjpaService.getByBootjpaNameContain(bootjpaNameContain); }
	 */
	@RestController
	@RequestMapping("/Bootjpausers")
	public class BootjpaUserController {

		@PostMapping
		public ResponseEntity<Bootjpa> createUser(@Valid @RequestBody Bootjpa us) {

			Bootjpa um = new Bootjpa();
			um.setEmail(us.getEmail());
			um.setFirstname(us.getFirstname());
			um.setLastname(us.getLastname());
			um.setUserId(us.getUserId());

			return new ResponseEntity<Bootjpa>(um, HttpStatus.CREATED);
		}
	}
}
