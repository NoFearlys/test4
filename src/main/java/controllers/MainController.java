package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
        public String index(){
        return "index";
    }
    @GetMapping("/calc")
    public String calc(@RequestParam(value = "firstNumber",required = false) int firstNumber, @RequestParam(value = "secondNumber", required = false) int secondNumber, @RequestParam(value = "operation", required = false) String operation){
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(operation);
        return "result";
    }
}
