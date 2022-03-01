/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring_mvc_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Dell
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    
    @RequestMapping("/showForm")
    public String showForm(Model theModel){
        
        //create a student object
        Student theStudent = new Student();
        
        //add student object to the model
        theModel.addAttribute("student",theStudent);
        
        return "student-form";
    }
    
    @RequestMapping("/processFormStd")
    public String processFormStd(@ModelAttribute("student")Student theStudent){
        //log the input data
        System.out.println("The Student:"+theStudent.getFirstName()+" : "+theStudent.getLastName());
        
        return "student-confirmation";
    }
}
