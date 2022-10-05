package org.vasvari.kreta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.vasvari.kreta.model.Subject;
import org.vasvari.kreta.service.SubjectService;

import javax.validation.Valid;
import java.util.List;

@Controller
public class SubjectController {
    @Autowired
    SubjectService service;

    //https://www.baeldung.com/spring-boot-crud-thymeleaf?fbclid=IwAR2czivf1vO9ywPVVRhOXrytgvHRXEuDv0zLD5WOTGPNIl3N3kJ5uKBthtE
    // http://localhost:7777/swagger-ui/index.html
}
