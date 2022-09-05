package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String surname;
    public int schoolYear;
    public int studentId;
    private String courses;
    private String tuitionBalance;


    public Student(){
//Prompt user to enter name ,surname and grade year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        this.firstName = sc.nextLine();

        System.out.println("Enter Student Surname:");
        this.surname = sc.nextLine();

        System.out.println("Enter Student School year:\n1:First year \n2:Second year \n3:Third year \n4:Fourth year");
        this.schoolYear = sc.nextInt();

        System.out.println(firstName+"\n"+surname+"\n"+schoolYear);

    }
    // Generate Student ID



}
