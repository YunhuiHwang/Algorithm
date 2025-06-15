package java.bj_2025_06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] positions = new int[26];

        for (int i = 0; i < 26; i++) {
            positions[i] = -1;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int idx = c - 'a';

            if (positions[idx] == -1) {
                positions[idx] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(positions[i] + " ");
        }
    }
}
