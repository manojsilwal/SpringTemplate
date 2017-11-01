package service;

import domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by manoj on 10/31/2017.
 */
@Service
public class StudentService {
    public List<Student> studentList;

    public StudentService(){
        studentList = new ArrayList<>();
        studentList.add(new Student("manoj",12));
        studentList.add(new Student("Deeyas",2));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
