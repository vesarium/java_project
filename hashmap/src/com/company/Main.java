package com.company;


import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Morse morse = new Morse();
        morse.fillHash();

        morse.printText(("No water on Mars").toLowerCase());
        System.out.println("Translation is: ");
        System.out.print("Stream : ");
        morse.printMorseStream(".--- .- ...- .- / .. ... / -.- --- --- .-.. / --- -.-");
        System.out.print("No Stream : ");
        morse.printMorseNoStream(".... . .-.. .-.. --- / .-- --- .-. .-.. -..");

    }
}
