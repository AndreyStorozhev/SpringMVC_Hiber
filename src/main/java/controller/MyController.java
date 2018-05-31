package controller;

import entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.PersonService;

@Controller
@RequestMapping("/")
public class MyController {
    @Autowired
    private PersonService service;

    @RequestMapping({"/home", "/"})
    public String home(Model model){
        model.addAttribute("listPerson", service.listUsers());
        return "home";
    }
    @GetMapping("/add")
    public String createPage(){
        return "create";
    }
    @PostMapping("/add")
    public String addPerson(@ModelAttribute("person")Person person){
        service.add(person);
        return "redirect:/home";
    }
    @GetMapping("/delete/{id}")
    public String deletePerson(@PathVariable("id") int id){
        service.removePerson(id);
        return "redirect:/home";
    }
    @GetMapping("/look/{id}")
    public String lookPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", service.lookPerson(id));
        return "lookPerson";
    }
}
