package com.bridgelabz.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Java Program to sort a given arraylist
public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(50);
        arrayList.add(66);
        arrayList.add(40);
        arrayList.add(12);
        System.out.println("Initial arraylist: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("After sorting arraylist in ascending order: " + arrayList);
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("After sorting arraylist in descending order: " + arrayList);
    }
}
