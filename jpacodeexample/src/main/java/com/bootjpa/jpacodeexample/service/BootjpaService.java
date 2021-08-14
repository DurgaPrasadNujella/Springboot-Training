package com.bootjpa.jpacodeexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	public Bootjpa getByBootjpaID(Integer bootjpaID) {
		// TODO Auto-generated method stub
		return bootjpaRepository.getById(bootjpaID);
	}
	
	public Bootjpa getByBootjpaName(String bootjpaName) {
		// TODO Auto-generated method stub
		return (Bootjpa) bootjpaRepository.findByName(bootjpaName);
	}

	public Bootjpa deleteByBootjpaID(int bootjpaID) {
		// TODO Auto-generated method stub
		return (Bootjpa) bootjpaRepository.deleteById(bootjpaID);
	}

	public List<Bootjpa> deleteAllBootjpas() {
		// TODO Auto-generated method stub
		return  (List<Bootjpa>)bootjpaRepository.deleteByAll();
	}

	public Bootjpa getByBootjpaOne(String bootjpaOne) {
		// TODO Auto-generated method stub
		return (Bootjpa) bootjpaRepository.findOne(bootjpaOne);
	}

	public Bootjpa getByBootjpaNameContain(String bootjpaNameContain) {
		// TODO Auto-generated method stub
		return (Bootjpa) bootjpaRepository.findByNameContaining(bootjpaNameContain);
	}
    
	
	
}
