package com.qa.main;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Heylow");
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int res;
        switch (args[2]){
            case "add":
                res = num1+num2;
                System.out.println(num1 +" + " + num2 + " = " + res);
                break;
            case "del":
                res = num1-num2;
                System.out.println(num1 +" - " + num2 + " = " + res);
                break;
            case "mul":
                res = num1*num2;
                System.out.println(num1 +" * " + num2 + " = " + res);
                break;
            case "div":
                res = num1/num2;
                System.out.println(num1 +" / " + num2 + " = " + res);
                break;
            default:
                System.out.println("enter operation type");
                break;
        }



    }
}
