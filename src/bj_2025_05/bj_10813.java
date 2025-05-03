package bj_2025_04;

import java.util.Scanner;

public class bj_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] baskets = new int[n + 1];
        for (int i = 1; i <= n; i++) baskets[i] = i;

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt(), j = sc.nextInt();
            int temp = baskets[i];
            baskets[i] = baskets[j];
            baskets[j] = temp;
        }

        for (int i = 1; i <= n; i++) System.out.print(baskets[i] + " ");
    }
}
