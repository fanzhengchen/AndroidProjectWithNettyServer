package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mark on 17-3-13.
 */

@RestController
public class MainController {


    @RequestMapping("/main")
    public String queryMain() {
        return "hello world!";
    }
}
