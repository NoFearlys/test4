package com.lesson2.test4.services;

public class CalcOperation {
    public static double calculate(double firstNumber, double secondNumber, String operation){
        switch (operation){
            //Сложение
            case ("addition"):
                return addition(firstNumber, secondNumber);
            //Вычитание
            case ("subtraction"):
                return subtraction(firstNumber, secondNumber);
            //Умножение
            case ("multiplication"):
                return multiplication(firstNumber, secondNumber);
            //Деление
            case ("division"):
                return division(firstNumber, secondNumber);
            default:
                return 0;
        }
    }
    private static double addition(double a, double b){
        return a+b;
    }
    private static double subtraction(double a, double b){
        return a-b;
    }
    private static double multiplication(double a, double b){
        return a*b;

    }
    private static double division(double a, double b){
        if(b!=0) return a/b;
        else throw new ArithmeticException("На ноль делить нельзя");
    }


}
