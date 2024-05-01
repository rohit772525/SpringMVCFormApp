package com.ashok.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ashok.model.User;

@Controller
public class UserController {

    @RequestMapping(value = "/displayForm.htm", method = RequestMethod.GET)
    public String displayForm(Model model) {
        model.addAttribute("user", new User());
        return "userForm";
    }

    @RequestMapping(value = "/regUser.htm", method = RequestMethod.POST)
    public String regUser(@ModelAttribute("user") User u) {
        return "display";
    }

}
