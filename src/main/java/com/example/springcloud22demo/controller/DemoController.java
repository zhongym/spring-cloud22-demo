package com.example.springcloud22demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhongym
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String get(boolean bool) {
        if (bool) {
            throw new RuntimeException("报错啦");
        }
        return "成功返回================================>";
    }
}
