package controller;

import domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    StudentService studentService1;

    @RequestMapping("/students")
    public List<Student> display() {
        System.out.println("display");
        studentService1.getStudentList();
        return studentService.getStudentList();
    }

}
