package com.ctk.controller;

import com.ctk.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/10/31 0031.
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/addsex")
    public void addsex(@RequestParam("sex") String sex) {
        testService.addSex(sex);
    }
}
