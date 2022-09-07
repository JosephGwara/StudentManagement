package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students to enroll:");
        int numOfStudents = sc.nextInt();
        //an array of student objects
        Student[] students = new Student[numOfStudents];

        //looping through the registration process for the specified number of students
        for(int n = 0;n < numOfStudents;n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].tuitionPayment();
        }
        //printing all the registered students information
        for(int n = 0;n < numOfStudents;n++){
            System.out.println(students[n].toString());

        }


    }
}
