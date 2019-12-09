package be.ehb.timeleaf_opdracht.controllers;

import be.ehb.timeleaf_opdracht.model.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailsController {

    @Autowired
    StudentDAO dao;

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String showIndex(ModelMap map, @PathVariable(name = "id") int id ) {

        map.addAttribute( "student", dao.findById( id ).get() );

        return"details";
       }

}
