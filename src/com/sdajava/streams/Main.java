package com.sdajava.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> words =
                Arrays.asList("hej", "cześć", "hello", "ab"); //Inny format zapisu bez np. add.

        words.stream().forEach(s -> System.out.println("Słowo: " + s) );

        System.out.println("====================");
        System.out.println("Przykład 2");

        // tu nie musimy definiować typu zmiennej. Mozesz tez wyrzucic stream()

        words.forEach(System.out::println); //drugi sposób wywołania


        System.out.println("====================");
        System.out.println("Przykład 3");


        // idziemy dalej, dopiszemy po wykrzykniku do każdego słowa w kolekcji

        List<String> modWords = words.stream()
                                    .map(s -> s + "!")
                                    .collect(Collectors.toList());
        modWords.forEach(System.out::println);

        // words.stream().forEach(s -> s.replace(s -> s + "!"));

        System.out.println("====================");
        System.out.println("Przykład 4");

        List<String> replaceWords = words.stream()
                                        .map(s -> s.replace("e", "stodola"))
                                        .collect(Collectors.toList());

        replaceWords.forEach(System.out::println);

        System.out.println("====================");
        System.out.println("Przykład 5");

        List<String> upperCaseWords = words.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        upperCaseWords.forEach(System.out::println);

        System.out.println("====================");
        System.out.println("Przykład 6");

        List<String> shortWords = words.stream()
                                        .filter(s -> s.length() <4)
                                        .collect(Collectors.toList());
        shortWords.forEach(System.out::println);

        System.out.println("====================");
        System.out.println("Przykład 7");

        List<String> wordsWithC = words.stream()
                                    .filter(s -> s.contains("c"))
                                    .collect(Collectors.toList());
        wordsWithC.forEach(System.out::println);

        System.out.println("====================");
        System.out.println("Przykład 8");

        List<String> evenLengthWords = words.stream()
                                            .filter(s -> s.length()%2 == 0)
                                            .collect(Collectors.toList());
        evenLengthWords.forEach(System.out::println);



    }

}
