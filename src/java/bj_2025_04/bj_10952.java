package java.bj_2025_04;

import java.util.Scanner;

public class bj_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) break;
            System.out.println(a + b);
        }
    }
}
