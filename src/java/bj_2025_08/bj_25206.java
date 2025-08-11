package java.bj_2025_08;

import java.util.Scanner;

public class bj_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalScore = 0.0;
        double totalCredit = 0.0;

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();

            if (grade.equals("P")) continue;

            double gradePoint = 0.0;
            switch (grade) {
                case "A+": gradePoint = 4.5; break;
                case "A0": gradePoint = 4.0; break;
                case "B+": gradePoint = 3.5; break;
                case "B0": gradePoint = 3.0; break;
                case "C+": gradePoint = 2.5; break;
                case "C0": gradePoint = 2.0; break;
                case "D+": gradePoint = 1.5; break;
                case "D0": gradePoint = 1.0; break;
                case "F":  gradePoint = 0.0; break;
            }

            totalScore += credit * gradePoint;
            totalCredit += credit;
        }

        System.out.println(totalScore / totalCredit);
    }
}

