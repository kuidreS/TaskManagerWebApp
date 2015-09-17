package com.task.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Vitalii on 17.09.2015.
 */
@Controller
public class MainCtrl {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
