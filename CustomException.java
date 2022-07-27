package com.bridgelabz.practice;
// demonstrate custom exception

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Age : ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Invalid age to vote ");
            } else {
                System.out.println("Valid age to vote");
            }
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String s) {
        super(s);
    }
}