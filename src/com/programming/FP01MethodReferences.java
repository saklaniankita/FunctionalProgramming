package com.programming;

import javax.sound.midi.SysexMessage;
import java.util.List;
import java.util.function.Supplier;

public class FP01MethodReferences {
    public static void main(String[] args) {
        List<String> courses = List.of("AWS", "Azure", "Google Cloud",
                "Spring", "Spring Boot", "Docker", "AI", "Cyber Security");

        //The Usual Way
        courses.stream().map(x -> x.toUpperCase()).forEach(System.out::println);

        //Using method Reference with instance method(toUpperCase) of any class(String)
        //Using method Reference with static method of any class
        courses.stream().map(String::toUpperCase).forEach(FP01MethodReferences::print);

        //The Usual Way
        Supplier<String> supp = () -> new String();

        //Constructor Reference can be used to create new objects
        Supplier<String> supp1 = String::new;
        System.out.println(supp1.get());
    }

    private static void print(String str){
        System.out.println(str);
    }
}
