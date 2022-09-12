package com.company;

import java.util.Scanner;

public class Student {
    private final String firstName;
    private final String surname;
    private int schoolYear;
    private String studentId;
    private static int id = 1000;
    private static double costOfCourse = 600;
    private String courses = "";
    private double tuitionBalance = 0;


    public Student(){
//Prompt user to enter name ,surname and grade year
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name:");
        this.firstName = sc.nextLine();

        System.out.print("Enter Student Surname:");
        this.surname = sc.nextLine();


        System.out.println("Enter Student School year:\n1:First year \n2:Second year \n3:Third year \n4:Fourth year");
        this.schoolYear = sc.nextInt();

        while(1!=0){
            if(schoolYear== 1||schoolYear==2||schoolYear==3||schoolYear==4){

                break;
            }
            else{
                System.out.println("Please enter a value between 1 and 4");
                this.schoolYear = sc.nextInt();
            }

        }

        generateID();


    }
    // Generate Student ID
    private void generateID(){
        //increment student id each time a new student is added
        id++;

        /*this statement adds the student year and id value together
         to create the student id the string in between causes the
          value to be returned as a string*/

        this.studentId = schoolYear +""+ id;

    }
    //Enroll in courses
    public void enroll(){
        //Get inside a loop,until user hits Q
         do {
             System.out.print("Enter a course to enroll,Press Q to Quit:");
             Scanner sc = new Scanner(System.in);
             String course = sc.nextLine();
             if (!course.equals("Q")) {
                 courses = courses + "\n  " + course;
                 tuitionBalance = tuitionBalance + costOfCourse;
             }
             else {
                 break;
             }
         }
         while (1!=0);
    }
    // View Balance
    public void viewBalance(){
        System.out.println("Your Fees balance is:"+ tuitionBalance);
    }
    //Pay Tuition
    public void tuitionPayment(){
        viewBalance();
        System.out.print("Enter your payment $");
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        tuitionBalance = (tuitionBalance * -1) + payment;
        System.out.println("Thank you for your payment of:$"+payment);
        viewBalance();
    }

    @Override
    public String toString() {
        return  "*************************************************"+
                "\nSTUDENT DETAILS"+
                "\nName:"+firstName+" "+surname +
                "\nSchool Year:"+ schoolYear+
                "\nStudent ID:" + studentId+
                "\nCourses Enrolled In:"+courses+
                "\nBalance:$"+tuitionBalance+
                "\n";
    }
}
