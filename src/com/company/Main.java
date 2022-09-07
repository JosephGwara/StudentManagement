package com.company;

public class Main {

    public static void main(String[] args) {
	Student st = new Student();
    st.enroll();
    st.tuitionPayment();
    System.out.println(st.toString());
    }
}
