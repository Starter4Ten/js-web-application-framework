package com.starter4ten.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.starter4ten.controllers.SignupForm;

@Controller
@RequestMapping("/signup")
public class RegistrationController {

    @RequestMapping(method=RequestMethod.GET)
    public String load(Model model) {
        model.addAttribute(new SignupForm());
        return "signup";
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public String signup(SignupForm form, BindingResult bindingResult) {
        
        if (form.getPassword().length() < 8) {
            bindingResult.addError(new ObjectError("password", "Password must be greater than 8 characters."));
        }
        
        if(!form.getPassword().equals(form.getPasswordRpt())) {
            bindingResult.addError(new ObjectError("password-match", "The Passwords don't match."));
        }
        
        if (bindingResult.hasErrors()) {
            return null;
        }
        
        return "signup-complete";
    }
}
