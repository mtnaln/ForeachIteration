package com.metin.foreach.iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> students = new ArrayList<String>();
        students.add("Yusuf");
        students.add("Metin");
        students.add("Dilek");
        students.add("Mehmet");
        students.add("Ahmet");

        // You can define and initialize arraylist like this
        List<String> student2 = Arrays.asList("Yusuf", "Metin", "Dilek", "Mehmet", "Ahmet");

        System.out.println("-----For-----");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("-----For 2-----");
        for (String studentName : students) {
            System.out.println(studentName);
        }

        System.out.println("-----Iterator-----");
        Iterator<String> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            String student = studentIterator.next();
            System.out.println(student);
        }

        System.out.println("-----Foreach-----");
        // students.forEach(Consumer<? super E> action);
        students.forEach(s -> System.out.println(s));
        System.out.println("-----------");
        students.forEach(System.out::println);
    }
}
