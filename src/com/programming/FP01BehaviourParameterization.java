package com.programming;

import java.util.List;
import java.util.function.Predicate;

public class FP01BehaviourParameterization {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,3,2,4,7,22,11,7,8,9,10);

//        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
//        list.stream().filter(evenPredicate).forEach(System.out::println);
//
//        Predicate<Integer> oddPredicate = x -> x % 2 != 0;
//        list.stream().filter(oddPredicate).forEach(System.out::println);

        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        filterAndPrint(list, evenPredicate);

        Predicate<Integer> oddPredicate = x -> x % 2 != 0;
        filterAndPrint(list, oddPredicate);

        Predicate<Integer> multiplesOf3 = x -> x % 3 == 0;
        filterAndPrint(list, multiplesOf3);


    }

    private static void filterAndPrint (List<Integer> list, Predicate<Integer> predicate) {
        list.stream().filter(predicate).forEach(System.out::println);
    }


}
