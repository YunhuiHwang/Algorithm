package java.bj_2025_08;

import java.util.Scanner;

public class bj_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : croatia) {
            input = input.replace(s, "!");
        }

        System.out.println(input.length());
    }
}