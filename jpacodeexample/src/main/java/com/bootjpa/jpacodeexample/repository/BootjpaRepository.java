package com.bootjpa.jpacodeexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bootjpa.jpacodeexample.model.Bootjpa;


@Repository
/*
 * public interface BootjpaRepository extends CrudRepository<Bootjpa, Integer>{
 * 
 * //Bootjpa save(Bootjpa bootjpa);
 * 
 * }
 */

public interface BootjpaRepository extends JpaRepository<Bootjpa, Integer> {
	  List<Bootjpa> findById(int bootjpaId);
	  List<Bootjpa> findByName(String bootjpaName);
	  List<Bootjpa> deleteById(int bootjpaId);
	  long count();
	  List<Bootjpa> findByAll();
	  List<Bootjpa> deleteByAll();
	  List<Bootjpa> findOne(String bootjpaName);
	  List<Bootjpa> findByNameContaining(String bootjpaName);
	  
	  
	  
	  
	  
	}
