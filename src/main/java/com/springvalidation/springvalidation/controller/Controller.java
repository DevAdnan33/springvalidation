package com.springvalidation.springvalidation.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springvalidation.springvalidation.entities.LoginData;

import jakarta.validation.Valid;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/form")
    public String form(Model model) {
        model.addAttribute("loginData", new LoginData()); // Corrected to loginData
        return "form";
    }

    // Handler for processing form
    @RequestMapping(value = "/process", method = RequestMethod.POST)
    public String processForm(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result);
            return "form";
        }
        return "success";
    }
}
