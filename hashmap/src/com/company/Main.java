package com.company;


public class Main {

    public static void main(String[] args) {
        Maps maps = new Maps();
        maps.fillHash();

        maps.printText("java is null");
        maps.printMorseStream(".--- .- ...- .- / .. ... / -.- --- --- .-.. / --- -.-");
        maps.printMorseNoStream(".--- .- ...- .- / .. ... / -.- --- --- .-.. / --- -.-");

	// write your code here
    }
}
