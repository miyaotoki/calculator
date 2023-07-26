package com.huzaimi.calculator.controller;

import com.huzaimi.calculator.model.Calculator;
import com.huzaimi.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
@CrossOrigin
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("/calculate")
    public Calculator calculate(@RequestBody Calculator calculator){
        return calculatorService.calculate(calculator);
    }

}
