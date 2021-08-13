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
		return (List<Bootjpa>) bootjpaRepository;
	}

}
