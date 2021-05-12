package com.example.springbootjpa.course;

import com.example.springbootjpa.Employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {

    @Autowired
    CoursesService coursesService;

    @RequestMapping("employeees/{id}/courses")
    public List<Courses> getCourses(@PathVariable int id) {
        return coursesService.getCourses(id);
    }

    @RequestMapping("employees/{employeeId}/add")
    public void addCourse(@RequestBody Courses courses, @PathVariable int employeeId){
        courses.setEmployee(new Employee(employeeId,"","",""));
        coursesService.addCourse(courses);
    }

    @RequestMapping("courses/get/{id}")
    public Courses getCoursebyId(@PathVariable int id){
        return coursesService.getEployeebyId(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "courses/delete/{id}")
    public void deleteCourse(@PathVariable int id){
        coursesService.removeCourse(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "courses/update/{id}")
    public void updateStudent(@RequestBody Courses courses, @PathVariable int id){
        coursesService.updateCourse(courses, id);
    }
}