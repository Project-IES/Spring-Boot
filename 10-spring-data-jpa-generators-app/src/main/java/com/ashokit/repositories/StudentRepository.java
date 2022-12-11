package com.ashokit.repositories;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entities.Student;


public interface StudentRepository extends JpaRepository<Student, Serializable>{

}
