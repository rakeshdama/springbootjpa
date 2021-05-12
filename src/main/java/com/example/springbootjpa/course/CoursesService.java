package com.example.springbootjpa.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoursesService {

    @Autowired
    CoursesRepository coursesRepository;
    List<Courses> courses = new ArrayList<>();

 /*   public void createStudent(){
        courses.add(new Courses(111, "rakesh", "Pentester", "100000$"));
        courses.add(new Courses(112, "dama", "hacker", "110000$"));
        courses.add(new Courses(113, "royal", "Soc Analyst", "120000$"));
    }*/

/*    public List<Courses> getCourses() {
//        createStudent();
//        return employees;
        List<Courses> courses = new ArrayList<>();
        coursesRepository.findAll().forEach(courses::add);
        return courses;
    }*/

    public List<Courses> getCourses(int id) {
        List<Courses> employees = new ArrayList<>();
        coursesRepository.findByEmployeeId(id).forEach(employees::add);
        return employees;
    }
    public void addCourse(Courses courses) {
        coursesRepository.save(courses);
    }

    public Courses getEployeebyId(int id) {
            return coursesRepository.findById(id).get();

        }

    public void removeCourse(int id) {
        coursesRepository.deleteById(id);
    }

    public void updateCourse(Courses courses, int id) {
        coursesRepository.save(courses);
    }


}
