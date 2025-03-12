package com.example.springkadaitodo1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springkadaitodo1.service.ToDoService;

@Controller
public class ToDoController {
   private final ToDoService todoService;
   
   public ToDoController(ToDoService todoService){
	   this.todoService=todoService;
	   
   }
   

    @RequestMapping("/todo")
    public ModelAndView ToDo() {
    	ModelAndView mod =new ModelAndView();
    	mod.setViewName("ToDo");
    	mod.addObject("todos","todoId");
    	
    	
        return mod;
    }
}