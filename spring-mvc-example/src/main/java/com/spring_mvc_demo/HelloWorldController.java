/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring_mvc_demo;


import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Dell
 */
@Controller
@RequestMapping("hello")
public class HelloWorldController {
    
    //need a controller method to show the initial html form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }
    
    //need a controller method to process the html form
    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
    
    //need a controller method to process the html form
    @RequestMapping("/processFormTwo")
    public String letsShoutDude(HttpServletRequest request,Model model){
        
        //read the request parameter for html form page
        String theName = request.getParameter("studentName");
        
        //convert the Parameter into Uppcase
        theName = theName.toUpperCase();
        
        //create the Message
        String result = "Yo!" +theName;
        
        // add message to the Model
        model.addAttribute("message",result);
        
        return "helloworld";
    }
    
    //need a controller method to process the html form
    @RequestMapping("/processFormThree")
    public String processFormThree(@RequestParam("studentName") String theName,Model model){
        
        //convert the Parameter into Uppcase
        theName = theName.toUpperCase();
        
        //create the Message
        String result = "Yo!" +theName;
        
        // add message to the Model
        model.addAttribute("message",result);
        
        return "helloworld";
    }
}
