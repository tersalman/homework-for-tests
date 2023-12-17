package com.example.calculator.controllers;

import com.example.calculator.services.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorCantroller {

    Calculator calculator;

    public CalculatorCantroller(Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping
    public String meetingTheUser() {
        return "Welcome to the Calculator";
    }
    @GetMapping(path = "/plus")
    public String plus(@RequestParam( name = "a", required = false) Integer a,
                       @RequestParam( name = "b",required = false) Integer b) {
        if (a == null || b == null) {
            return "you must need to enter the numbers";
        }
        String end = a +" + "+ b + " = "+ calculator.plus(a,b);
        return end;
    }
    @GetMapping(path = "/minus")
    public String minus(@RequestParam( name = "a", required = false) Integer a,
                        @RequestParam( name = "b",required = false) Integer b) {
        if (a == null || b == null) {
            return "you must need to enter the numbers";
        }
        String end = a +" + "+ b + " = "+ calculator.minus(a,b);
        return end;
    }
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam( name = "a", required = false) Integer a,
                           @RequestParam( name = "b",required = false) Integer b) {
        if (a == null || b == null) {
            return "you must need to enter the numbers";
        }
        String end = a +" + "+ b +  " = "+ calculator.multiply(a,b);
        return end;
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam( name = "a", required = false) Integer a,
                         @RequestParam( name = "b",required = false) Integer b) {
        if (a == null || b == null) {
            return "you must need to enter the numbers";
        }
        String end = a +" + "+ b + " = "+ calculator.divide(a,b);
        return end;
    }


}
