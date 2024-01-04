// Jose Guzman
// September 24, 2023
// Description: if, else if, else example
// File Name: Selection.java
// To Compile: javac Selection.java
// To Run: java Selection

import java.util.Scanner;

public class IfElseIfChain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the numerical grade: ");
        int numericalGrade = input.nextInt();
        char letterGrade;

        if (numericalGrade >= 90) {
            letterGrade = 'A';
        } else if (numericalGrade >= 80) {
            letterGrade = 'B';
        } else if (numericalGrade >= 70) {
            letterGrade = 'C';
        } else if (numericalGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.println("Letter Grade: " + letterGrade);

        input.close();
    }
}
/*
Enter the numerical grade: 90
Letter Grade: A

Enter the numerical grade: 80
Letter Grade: B

Enter the numerical grade: 70
Letter Grade: C

Enter the numerical grade: 60
Letter Grade: D

Enter the numerical grade: 50
Letter Grade: F
*/