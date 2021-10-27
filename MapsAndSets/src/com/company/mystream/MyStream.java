package com.company.mystream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class MyStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Michael","Dean","James","Chris");

        List<String> result = names.stream()
                .filter(x -> x != "James")
                .map(x -> "Hello " + x)
                .collect(Collectors.toList());
        names.stream().filter(x -> x == "James").forEach(x -> result.add(x));

        result.forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3,4,7,8,12);
        int numResult = numbers.stream()
                .reduce((a, b) -> a*b)
                .get();
        System.out.println(numResult);

        // ODD and EVEN numbers filter
        List<Integer> evenNumbers = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Odd numbers are: ");
        oddNumbers.forEach(System.out::print);
        System.out.println("");
        System.out.println("--------");
        System.out.println("Even numbers are: ");
        evenNumbers.forEach(System.out::print);
        System.out.println("");
        System.out.println("--------");

        // Summ of all numbers
        int sumResult = numbers.stream()
                .reduce((a,b)-> a + b)
                .get();
        System.out.println("Summ is: " + sumResult);

        //MIN and MAX numbers
        System.out.println("Minimum number in List: " + numbers.stream().min((num1, num2)->num1.compareTo(num2)).get());
        System.out.println("Maximum number in List: " + numbers.stream().max((num1, num2)->num1.compareTo(num2)).get());

        int minNumSquare = numbers.stream().map(a -> a*a).filter(a -> a % 2 != 0).min((num1, num2)->num1.compareTo(num2)).get();
        System.out.println(minNumSquare);



    }
}
