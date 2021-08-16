package com.bootjpa.jpacodeexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.bootjpa.jpacodeexample.exceptions.BootjpaNotFoundException;
import com.bootjpa.jpacodeexample.exceptions.CustomError;
import com.bootjpa.jpacodeexample.model.Bootjpa;
import com.bootjpa.jpacodeexample.repository.BootjpaRepository;


@Service
public class BootjpaService {

	@Autowired
	BootjpaRepository bootjpaRepository;
	
	public Bootjpa addBootjpa(Bootjpa bootjpa) {
		return bootjpaRepository.save(bootjpa);
	}

	@SuppressWarnings("unchecked")
	public List<Bootjpa> getBootjpas() {
		// TODO Auto-generated method stub
		return (List<Bootjpa>) bootjpaRepository.findAll();
	}

	
	  public Bootjpa getByBootjpaID(Integer bootjpaID) 
	  
	  { // TODO Auto-generated
	   return bootjpaRepository.getById(bootjpaID); 
	   }
	 
	
public Bootjpa getByBootjpaIDAll(Integer bootjpaID) throws BootjpaNotFoundException {
		
		List<Bootjpa> bootjpaList=bootjpaRepository.findAll();
		if(bootjpaList !=null && bootjpaList.size() >0) {
			return (Bootjpa) bootjpaList;
		}
		// TODO Auto-generated method stub
		/* return bootjpaRepository.getById(bootjpaID); */
		throw new BootjpaNotFoundException();
	}

public ResponseEntity<Object> getByBootjpaOneCustom(int bootjpaIdCustom) throws BootjpaNotFoundException {
	
	List<Bootjpa> user=bootjpaRepository.findAll();
	/*if(user !=null && user.size() >0) {
		return (Bootjpa) user;
	}*/

//int len = firtname.length();

if (user.contains(bootjpaIdCustom)) {
	return new ResponseEntity<Object>(user.get(bootjpaIdCustom), HttpStatus.CREATED);
} else {
	return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
}

}

	
	public Bootjpa getByBootjpaName(String bootjpaName) {
		// TODO Auto-generated method stub
		return (Bootjpa) bootjpaRepository.findByName(bootjpaName);
	}

	public Bootjpa deleteByBootjpaID(int bootjpaID) {
		// TODO Auto-generated method stub
		return (Bootjpa) bootjpaRepository.deleteById(bootjpaID);
	}

	/*
	 * public List<Bootjpa> deleteAllBootjpas() { // TODO Auto-generated method stub
	 * return (List<Bootjpa>)bootjpaRepository.deleteByAll(); }
	 */

	public Bootjpa getByBootjpaOne(String bootjpaOne) {
		// TODO Auto-generated method stub
		return (Bootjpa) bootjpaRepository.findOne(bootjpaOne);
	}

	/*
	 * public Bootjpa getByBootjpaNameContain(String bootjpaNameContain) { // TODO
	 * Auto-generated method stub return (Bootjpa)
	 * bootjpaRepository.findByNameContaining(bootjpaNameContain); }
	 */
    
	
	
}
