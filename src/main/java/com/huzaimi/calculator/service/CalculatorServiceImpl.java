package com.huzaimi.calculator.service;

import com.huzaimi.calculator.model.Calculator;
import com.huzaimi.calculator.repository.CalculatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    //@Autowired
   // private CalculatorRepository calculatorRepository;

    @Override
    public Calculator calculate(Calculator calculator) {

        double converterValue = 1.09361; //meter to yard
        //convert all to meter
        double from = calculator.getFrom();
        double to = calculator.getTo();
        double distance = 0;
        if(calculator.getFromUnit().equals("yard")){
            from = calculator.getFrom() * converterValue;
        }


        if(calculator.getToUnit().equals("yard")){
            to = calculator.getTo() * converterValue;
        }
        distance = to - from;

        switch(calculator.getResultUnit()) {
            case "yard":
                distance = distance / converterValue;
                break;
            case "meter":
                distance = distance;
                break;
            default:
                distance = distance;
        }
        calculator.setDistance(distance);
        calculator.setResult(distance+" "+calculator.getResultUnit());

        return calculator;
    }
}
