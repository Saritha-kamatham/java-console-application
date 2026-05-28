package com.internship.task;

import java.util.Scanner;

// Simple Student Management System using Java Fundamentals

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        // Variables to store student details
        int studentId = 0;
        String studentName = "";
        double studentMarks = 0;

        // Loop to display menu continuously
        do {

            System.out.println("\n===== Student Management System =====");

            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Check Result");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            // Switch statement for menu options
            switch (choice) {

                // Add Student Details
                case 1:

                    System.out.print("Enter Student ID : ");
                    studentId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name : ");
                    studentName = sc.nextLine();

                    System.out.print("Enter Student Marks : ");
                    studentMarks = sc.nextDouble();

                    System.out.println("Student Details Added Successfully");

                    break;

                // Display Student Details
                case 2:

                    System.out.println("\n----- Student Details -----");

                    System.out.println("Student ID : " + studentId);
                    System.out.println("Student Name : " + studentName);
                    System.out.println("Student Marks : " + studentMarks);

                    break;

                // Check Pass or Fail
                case 3:

                    System.out.println("\n----- Result -----");

                    if (studentMarks >= 35) {
                        System.out.println(studentName + " has Passed");
                    } else {
                        System.out.println(studentName + " has Failed");
                    }

                    // Grade Calculation
                    if (studentMarks >= 90) {
                        System.out.println("Grade : A");
                    } else if (studentMarks >= 75) {
                        System.out.println("Grade : B");
                    } else if (studentMarks >= 50) {
                        System.out.println("Grade : C");
                    } else {
                        System.out.println("Grade : Fail");
                    }

                    break;

                // Exit Program
                case 4:

                    System.out.println("Exiting Program...");
                    break;

                // Invalid Choice
                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}