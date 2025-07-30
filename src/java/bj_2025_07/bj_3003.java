package java.bj_2025_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] correct = {1, 1, 2, 2, 2, 8};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < correct.length; i++) {
            int have = Integer.parseInt(st.nextToken());
            sb.append(correct[i] - have);
            if (i < correct.length - 1) sb.append(' ');
        }

        System.out.println(sb);
    }
}
