package com.avengers.studentMaanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

   @Autowired
   StudentService studentService;
    //for getting information then we use
    @GetMapping("/get_student/{admnNo}")
    public Student getSudent(@PathVariable("admnNo") int admnNo){
        return studentService.getStudent(admnNo);
    }
    //adding the information
    @PostMapping("/add_student")
    public  String addStudent(@RequestBody Student student){
       return studentService.addStudent(student);
    }
    @DeleteMapping("/delete_student/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        return studentService.deleteStudent(id);
    }

    //also make a put aoi
    @PutMapping("/update_student")
    public String updateStudent(@RequestParam("id") int id, @RequestParam("age") int age){
       return studentService.updateStudent(id,age);
    }
}
