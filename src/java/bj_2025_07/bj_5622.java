package java.bj_2025_07;

import java.util.Scanner;

public class bj_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'A' && ch <= 'C') {
                total += 3;
            } else if (ch >= 'D' && ch <= 'F') {
                total += 4;
            } else if (ch >= 'G' && ch <= 'I') {
                total += 5;
            } else if (ch >= 'J' && ch <= 'L') {
                total += 6;
            } else if (ch >= 'M' && ch <= 'O') {
                total += 7;
            } else if (ch >= 'P' && ch <= 'S') {
                total += 8;
            } else if (ch >= 'T' && ch <= 'V') {
                total += 9;
            } else if (ch >= 'W' && ch <= 'Z') {
                total += 10;
            }
        }

        System.out.println(total);
        sc.close();
    }
}
