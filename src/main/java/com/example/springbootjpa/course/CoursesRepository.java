package com.example.springbootjpa.course;

import jdk.dynalink.linker.LinkerServices;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoursesRepository extends CrudRepository<Courses, Integer> {

    public List<Courses> findByEmployeeId(Integer employeeID);
}
