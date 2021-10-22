package com.company;

public class Arrays {

    public static void myArray(int[] arr1, int[] arr2) {
        multiple2(arr1);
        squared(arr1, arr2);
    }

    public static void multiple2(int[] arr) {
        System.out.println("Hi, I am multiplied array");
        for (int num:arr) {
            System.out.print(num*2 + " ");
        }
        System.out.println();

    }

    public static void squared(int[] arr1, int[] arr2) {
        System.out.println("Hi, I am squared array");
        for (int i = 0; i < arr1.length; i++) {
            int resNum = (int)Math.pow(arr1[i], 2);
            System.out.print(resNum + " ");
            arr2[i] = resNum;
        }
        System.out.println();
        System.out.println("Hi, I am squared array copied to Array2");
        for (int num: arr2)
            System.out.print(num + " ");
        }
    }

