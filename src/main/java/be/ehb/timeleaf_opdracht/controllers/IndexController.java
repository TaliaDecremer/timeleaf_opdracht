package be.ehb.timeleaf_opdracht.controllers;

import be.ehb.timeleaf_opdracht.model.Student;
import be.ehb.timeleaf_opdracht.model.StudentDAO;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@Controller
public class IndexController {

    @Autowired
    StudentDAO dao;

    @ModelAttribute(value="all")
    public Iterable<Student> findAll(){
        return dao.findAll();
    }
    @RequestMapping(value={"", "/index"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map){
        return"index";
    }



}
