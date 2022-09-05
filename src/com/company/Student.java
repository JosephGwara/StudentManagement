package com.company;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String surname;
    private int schoolYear;
    private String studentId;
    private static int id = 1000;
    private static int costOfCourse = 600;
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

        generateID();

        System.out.println(firstName+"\n"+surname+"\n"+schoolYear+"\n"+studentId);

    }
    // Generate Student ID
    private void generateID(){
        //increment student id each time a new student is added
        id++;

        /**this statement adds the student year and id value together
         *to create the student id the string in between causes the
         * value to be returned as a string*/

        this.studentId = schoolYear +""+ id;

    }



}
