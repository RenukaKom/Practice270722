package com.bridgelabz.practice;
// Java program to remove third element from arrayList
import java.util.ArrayList;
import java.util.List;

public class ThirdElement {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(12);
        System.out.println("Initial arraylist: " + arrayList);
        arrayList.remove(2);
        System.out.println("After removing third element: " + arrayList);
    }
}
