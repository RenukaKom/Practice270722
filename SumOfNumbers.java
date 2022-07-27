package com.bridgelabz.practice;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

// sum of first n numbers using stream
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n number: ");
        int num = sc.nextInt();

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= num; i++){
            integerList.add(i);
        }
        Integer sum = integerList.stream().reduce(0,(a,b) -> a + b);
        System.out.println(sum);

    }
}

