package bj_2025_04;
import java.util.Scanner;

public class bj_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] submitted = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int num = sc.nextInt();
            submitted[num] = true;
        }
        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) System.out.println(i);
        }
    }
}
