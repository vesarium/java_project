package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Maps {

    public static void main(String[] args) {

    }
    public HashMap<Character, String> myHashText =  new HashMap<Character, String>();
    public HashMap<String, String> myHashMorse =  new HashMap<String, String>();

    public void fillHash(){
       myHashText.put('a', ".-");
       myHashText.put('b', "-...");
       myHashText.put('c', "-.-");
       myHashText.put('d', "-..");
       myHashText.put('e', ".");
       myHashText.put('f', "..-.");
       myHashText.put('g', "--.");
       myHashText.put('h', "....");
       myHashText.put('i', "..");
       myHashText.put('j', ".---");
       myHashText.put('k', "-.");
       myHashText.put('l', ".-..");
       myHashText.put('m', "--");
       myHashText.put('n', "-.");
       myHashText.put('o', "---");
       myHashText.put('p', ".--.");
       myHashText.put('q', "--.-");
       myHashText.put('r', ".-.");
       myHashText.put('s', "...");
       myHashText.put('t', "-");
       myHashText.put('u', "..-");
       myHashText.put('v', "...-");
       myHashText.put('w', ".--");
       myHashText.put('x', "-..-");
       myHashText.put('y', "-.--");
       myHashText.put('z', "--..");
       myHashText.put('1', ".----");
       myHashText.put('2', "..---");
       myHashText.put('3', "...--");
       myHashText.put('4', "....-");
       myHashText.put('5', ".....");
       myHashText.put('6', "-....");
       myHashText.put('7', "--...");
       myHashText.put('8', "---..");
       myHashText.put('9', "----.");
       myHashText.put('0', "-----");

        myHashMorse.put(".-", "a");
        myHashMorse.put("-...", "b");
        myHashMorse.put("-.-", "c");
        myHashMorse.put("-..", "d");
        myHashMorse.put(".", "e");
        myHashMorse.put("..-.", "f");
        myHashMorse.put("--.", "g");
        myHashMorse.put("....", "h");
        myHashMorse.put("..", "i");
        myHashMorse.put(".---", "j");
        myHashMorse.put("-.", "k");
        myHashMorse.put(".-..", "l");
        myHashMorse.put("--", "m");
        myHashMorse.put("-.", "n");
        myHashMorse.put("---", "o");
        myHashMorse.put(".--.", "p");
        myHashMorse.put("--.-", "q");
        myHashMorse.put(".-.", "r");
        myHashMorse.put("...", "s");
        myHashMorse.put("-", "t");
        myHashMorse.put("..-", "u");
        myHashMorse.put("...-", "v");
        myHashMorse.put(".--", "w");
        myHashMorse.put("-..-", "x");
        myHashMorse.put("-.--", "y");
        myHashMorse.put("--..", "z");
        myHashMorse.put(".----", "1");
        myHashMorse.put("..---", "2");
        myHashMorse.put("...--", "3");
        myHashMorse.put("....-", "4");
        myHashMorse.put(".....", "5");
        myHashMorse.put("-....", "6");
        myHashMorse.put("--...", "7");
        myHashMorse.put("---..", "8");
        myHashMorse.put("----.", "9");
        myHashMorse.put("-----", "10");
        myHashMorse.put("/", " ");

    }
    public void printMorseStream(String str) {
        List<String> myList = Arrays.stream(str.split(" "))
                .map(n -> myHashMorse.get(n))
                .collect(Collectors.toList());
        System.out.println("Translation is: ");
        myList.forEach(System.out::print);
        System.out.println("");
    }

    public void printMorseNoStream(String str){

        String res = new String();
        String[] myArr = str.split(" ");
        for (int i = 0; i < myArr.length; i++) {
            //System.out.println(myArr[i]);
            res += myHashMorse.get(myArr[i]);
        }
        System.out.println(res);

    }

    public void printText(String str) {
        for (char ch: str.toCharArray()
        ) {
            if(ch == ' '){
                System.out.println("/");
            }else if(ch == '.'){
                System.out.println("dot here");
            }else if(ch == ','){
                System.out.println("comma here");
            }else {
                if(myHashText.get(ch)!=null){
                    System.out.println(myHashText.get(ch));
                }
            }
        }
    }

}
