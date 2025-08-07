package java.bj_2025_08;

import java.util.Scanner;

public class bj_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            boolean[] visited = new boolean[26];
            boolean isGroup = true;
            char prev = 0;

            for (int j = 0; j < word.length(); j++) {
                char now = word.charAt(j);

                if (now != prev) {
                    if (visited[now - 'a']) {
                        isGroup = false;
                        break;
                    }
                    visited[now - 'a'] = true;
                }

                prev = now;
            }

            if (isGroup) {
                count++;
            }
        }

        System.out.println(count);
    }
}