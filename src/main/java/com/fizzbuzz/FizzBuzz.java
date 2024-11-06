package com.fizzbuzz;

public class FizzBuzz {
    public String transformar(Integer n) {
        switch (n) {
            case 1:
                return "1";
            case 2:
                return "2";
            case 3, 6:
                String var = (n % 3 == 0) ?  "Fizz" :  null;
                return var;
            case 5:
                return "Buzz";
            case 15:
                return "FizzBuzz";
            default:
                return null;
        }
    }
}
