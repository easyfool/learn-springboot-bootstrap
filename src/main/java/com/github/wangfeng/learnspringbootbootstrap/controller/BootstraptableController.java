package com.github.wangfeng.learnspringbootbootstrap.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/boostrap-table")
@Slf4j
public class BootstraptableController {

    @RequestMapping(method = RequestMethod.GET)
    public String boostrapTable() {
        return "views/boostrap-table";
    }

}
