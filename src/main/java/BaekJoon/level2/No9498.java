package BaekJoon.level2;

import java.util.Scanner;

public class No9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char grade;
        if (num >= 90) grade = 'A';
        else if (num >= 80) grade = 'B';
        else if (num >= 70) grade = 'C';
        else if (num >= 60) grade = 'D';
        else grade = 'F';

        System.out.println(grade);
    }
}
