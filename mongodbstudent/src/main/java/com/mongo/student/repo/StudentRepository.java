package com.mongo.student.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongo.student.models.Student;

public interface StudentRepository  extends MongoRepository<Student,Integer>{
}
