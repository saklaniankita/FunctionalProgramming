package com.programming;

import java.sql.SQLSyntaxErrorException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingMethodClass {
    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 96, 45),
                new Course("Spring Boot", "Framework", 97, 50),
                new Course("AWS", "Cloud Service", 94, 50),
                new Course("Google Cloud", "Cloud Service", 92, 234),
                new Course("Microservices", "Framework", 97, 45),
                new Course("Docket", "Tool", 91, 78),
                new Course("Python", "Language", 93, 28),
                new Course("Azure", "Cloud Service", 98, 88),
                new Course("C++", "Language", 91, 90)
        );

        //map category with all the courses that fall under it.
        System.out.println(courses.stream()
                                  .collect(Collectors.groupingBy(Course::getCategory)));

        //map category with no of courses that falls under it.
        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

        //map category with the course having maximum review score
        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory,
                        Collectors.maxBy(Comparator.comparingInt(Course::getReviewScore)))));

        //map category with just the names of courses
        System.out.println(courses.stream()
                .collect(Collectors.groupingBy(Course::getCategory,
                        Collectors.mapping(Course::getName, Collectors.toList()))));

    }
}
