package ru.appline;

public class Calculator {
    double res;

    public double calculatorResult(double num1, double num2, String operation) {
        if(operation.equals("+")){
            res = num1 + num2;
        }
        else if(operation.equals("-")){
            res = num1 - num2;
        }
        else if(operation.equals("/")){
            res = num1/num2;
        }
        else if (operation.equals("*")) {
            res = num1*num2;
        }
        else System.out.println("Operation type is incorrect!");
        return res;
    }
}
