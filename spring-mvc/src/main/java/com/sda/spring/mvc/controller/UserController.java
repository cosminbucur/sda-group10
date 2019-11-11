package com.sda.spring.mvc.controller;

import com.sda.spring.mvc.model.User;
import com.sda.spring.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(name = "/", method = RequestMethod.GET)
    public String userForm(Model model) {
        model.addAttribute("user", userService.list());
        return "editUsers";
    }

    @ModelAttribute("user")
    public User fromBackingObject() {
        return new User();
    }

    // add user
    @RequestMapping(name = "/addUser", method = RequestMethod.POST)
    public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("user", userService.list());
            return "editUser";
        }

        userService.save(user);
        return "redirect:/";
    }
}
