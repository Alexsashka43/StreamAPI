package ru.l.insegnante43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Course SQL = new Course("SQL");
        Course python = new Course("Python");
        Course java = new Course("Java");
        Course smth = new Course("Something");
        Course kotlin = new Course("Kotlin");

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Vasya", new ArrayList<Course>(Arrays.asList(SQL, python))),
                new Student("Ivan", new ArrayList<Course>(Arrays.asList(java, smth, kotlin,SQL))),
                new Student("Dima", new ArrayList<Course>(Arrays.asList(python))),
                new Student("Lena", new ArrayList<Course>(Arrays.asList(SQL, kotlin, java)))
        ));

        List<Course> unicCourse = students.stream()
                        .map(student -> student.getAllCourses().toArray(student.getAllCourses())
                .distinct()
                                .collect(Collectors.toList());

        System.out.println(unicCourse);
    }
}

