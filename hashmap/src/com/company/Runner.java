package com.company;


import com.company.morse.Morse;
import com.company.optionals.User;

public class Runner {

    public static void main(String[] args) {

//        Morse morse = new Morse();
//        morse.fillHash();
//
//        morse.printText(("No water on Mars").toLowerCase());
//        System.out.println("Translation is: ");
//        System.out.print("Stream : ");
//        morse.printMorseStream(".--- .- ...- .- / .. ... / -.- --- --- .-.. / --- -.-");
//        System.out.print("No Stream : ");
//        morse.printMorseNoStream(".... . .-.. .-.. --- / .-- --- .-. .-.. -..");

        User user1 = new User(1,"First","Last",null,null);
        User user2 = new User(1,"","Last",null,"55 655 556");

        System.out.println(user1.getFname());
        System.out.println(user2.getFname());

        System.out.println(user2.getPhone());

        System.out.println(user1.getPhone());
        System.out.println(user1.getEmail());


    }
}
