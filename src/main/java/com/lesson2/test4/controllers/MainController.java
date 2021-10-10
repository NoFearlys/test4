package com.lesson2.test4.controllers;

import com.lesson2.test4.services.CalcOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
        public String index(){
        return "index";
    }
    @GetMapping("/calc")
    public String calc(@RequestParam(value = "firstNumber",required = false) double firstNumber, @RequestParam(value = "secondNumber", required = false) double secondNumber, @RequestParam(value = "operation", required = false) String operation, Model model){
        double result = CalcOperation.calculate(firstNumber,secondNumber,operation);
        model.addAttribute("result", result);
        return "result";
    }
}
