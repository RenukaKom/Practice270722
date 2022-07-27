package com.bridgelabz.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java program to compare two arrayList
public class CompareArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        System.out.println("first array list: " + arrayList);
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(2,4,5,30,10));
        System.out.println("second array list: " + arrayList2);
        if(arrayList.equals(arrayList2)){
            System.out.println("ArrayList are equal");
        }else{
            System.out.println("ArrayList are not equal");
        }
    }
}
