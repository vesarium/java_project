package com.company.lambda;

public class Lambda {

    interface FuncInterface {
        int operation(int a, int b);
    }

    private int operate(int a, int b, FuncInterface funcObj){
        return funcObj.operation(a, b);
    }

    public static void main(String[] args) {
        FuncInterface add = (a, b) -> a + b;
        FuncInterface del = (a, b) -> a - b;
        Lambda calc = new Lambda();
        System.out.println(calc.operate(1, 2, add));
        System.out.println(calc.operate(5, 4, del));

    }
}
