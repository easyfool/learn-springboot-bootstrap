package com.github.wangfeng.learnspringbootbootstrap.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/bootstrap-add-tab")
@Slf4j
public class BootstrapAddTabController {
    @RequestMapping(method = RequestMethod.GET)
    public String boostrapTable() {
        return "views/bootstrap-addtab";
    }


    @RequestMapping(value = "/getHtml",method = RequestMethod.GET)
    public String getHtml() {
        return "views/bootstrap-table";
    }


}
