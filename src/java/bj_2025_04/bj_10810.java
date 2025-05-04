package java.bj_2025_04;

import java.util.Scanner;

public class bj_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] basket = new int[n];

        for (int t = 0; t < m; t++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int idx = i - 1; idx <= j - 1; idx++) {
                basket[idx] = k;
            }
        }
        for (int ball : basket) {
            System.out.print(ball + " ");
        }
    }
}