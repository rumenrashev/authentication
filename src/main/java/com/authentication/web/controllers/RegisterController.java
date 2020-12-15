package com.authentication.web.controllers;

import com.authentication.models.bindings.UserRegisterBindingModel;
import com.authentication.persistance.entities.User;
import com.authentication.services.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/users/register")
public class RegisterController extends BaseController {

    private final UserRegisterService userRegisterService;

    @Autowired
    public RegisterController(UserRegisterService userRegisterService) {
        this.userRegisterService = userRegisterService;
    }

    @PostMapping
    public ModelAndView register(@Valid UserRegisterBindingModel userRegisterBindingModel, BindingResult bindingResult){
        return super.view("/users/register");
    }
}
