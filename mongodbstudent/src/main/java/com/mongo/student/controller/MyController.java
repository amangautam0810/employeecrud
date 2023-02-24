package com.mongo.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mongo.student.repo.StudentRepository;
import com.xadmin.SpringBootCrud.bean.Subject;

import models.Student;


@RestController
public class MyController {
	@Autowired
	private StudentRepository studentRepository;
	
	
	@RequestMapping("/getstudent")
	public ResponseEntity<?> getStudent()
	{   
		return ResponseEntity.ok(this.studentRepository.findAll());	
	}
	
	@RequestMapping(method= RequestMethod.POST , value="/addstudent")
	public ResponseEntity<?> addSubject(@RequestBody  Student student) 
	{ Student save=this.studentRepository.save(student); 
      return ResponseEntity.ok(save);
	}
	
//	@PostMapping("/")
//	public ResponseEntity<?> addStudent(@RequestBody Student student)
//	{   
//		Student save=this.studentRepository.save(student); 
//		return ResponseEntity.ok(save);
//		}
//	
//	@GetMapping("/")
//	public ResponseEntity<?> getStudent()
//	{   
//		return ResponseEntity.ok(this.studentRepository.findAll());
//		}
	}
