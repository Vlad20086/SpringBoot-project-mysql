package com.exemple.Stdent.controller;
import java.utils.*;
package org.springframework.stereotype.Controller;
@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @getMapping("/")
    public String viewHomePage(Model model){
        <List<Student>> list = service.listAll();
        model.AddAtribute("List Student", liststudent);
        System.out.println("Get / ");
        return "index";
    }

    @getMapping("/new")
    public String add(Model model) {
        model.addAttribute("student", new Student());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student std){
        service.save(std);
        return "redirect:/";
    }
    @RequestMapping(value = "/edit/{id}",)
    public ModelAndView showEditStudentPage(@PathVariable(name = "id") int id){
        ModelAndView mav = new ModelAndView("new");
        Student std = service.get(id);
        mav.addObject("student", std);
        return mav;
    }
    @RequestMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable(name = "id") int id){
        service.delete(id);
        return "redirect:/";
    }
}