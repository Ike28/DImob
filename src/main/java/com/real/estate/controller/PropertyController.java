package com.real.estate.controller;

import com.real.estate.entity.Property;
import com.real.estate.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/home_registry")
    public ModelAndView homeRegistry() {
        List<Property> propertyList = propertyService.getAllProperties();
        return new ModelAndView("home_registry", "property", propertyList);
    }

    @GetMapping("/add_property")
    public String addProperty() {
        return "add_property";
    }

    @PostMapping("/save")
    public String addProperty(@ModelAttribute Property property) {
        propertyService.save(property);
        return "redirect:/add_property";
    }
}
