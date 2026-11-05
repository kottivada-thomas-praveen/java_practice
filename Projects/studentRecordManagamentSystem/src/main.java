package Projects.studentRecordManagamentSystem.src;

import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args) throws InvalidMarksException {
        Scanner input = new Scanner(System.in);
        int size;
        System.out.println("Enter number of subjects : ");
        size = input.nextInt();
        
        int[] marks = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter subject "+(i+1)+" marks : ");
            marks[i] = input.nextInt();
        }

        student s1 = new student(101, "thomas", marks);
        student s2 = new student(102, "praveen", marks);

        studentService studentList = new studentService();
        studentList.addStudent(s1);
        studentList.addStudent(s2);

        studentList.displayDetails();

        // boolean is_running = true;
        // while (is_running) {
        // System.out.println("========================================");
        // System.out.println(" STUDENT MANAGEMENT SYSTEM ");
        // System.out.println("========================================");

        // System.out.println("1. Add Student");
        // System.out.println("2. Display All Students");
        // System.out.println("3. Search Student by ID");
        // System.out.println("4. Update Student");
        // System.out.println("5. Delete Student");
        // System.out.println("6. Find Student with Highest Marks");
        // System.out.println("7. Sort Students by Marks");
        // System.out.println("8. Display Pass/Fail Statistics");
        // System.out.println("9. Save Records");
        // System.out.println("10. Exit");

        // System.out.println("Enter your choice : ");
        // int choice = input.nextInt();

        // switch (choice) {
        // case 1:
        // studentList.addStudent(s2);
        // System.out.println("Student Added Successfully");
        // break;

        // case 2:
        // studentList.displayDetails();
        // break;

        // default:
        // break;
        // }
        // }

        input.close();

    }
}

/*
 * ========================================
 * STUDENT MANAGEMENT SYSTEM
 * ========================================
 * 
 * 1. Add Student
 * 2. Display All Students
 * 3. Search Student by ID
 * 4. Update Student
 * 5. Delete Student
 * 6. Find Student with Highest Marks
 * 7. Sort Students by Marks
 * 8. Display Pass/Fail Statistics
 * 9. Save Records
 * 10. Exit
 * 
 * Enter your choice:
 * 
 */