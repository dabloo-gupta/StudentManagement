package com.avengers.studentMaanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository; //object

    public String addStudent(Student student){
        return studentRepository.addStudent(student);
    }
    //for update
    public String deleteStudent(int id){
        return  studentRepository.deleteStudent(id);
    }
    //for update
    public String updateStudent(int id, int age){
        return studentRepository.updateStudent(id,age);
    }
    //getstudent
    public Student getStudent(int id){
        return studentRepository.getStudent(id);
    }
}
