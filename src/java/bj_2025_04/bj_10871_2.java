package java.bj_2025_04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bj_10871_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int x = Integer.parseInt(firstLine[1]);

        String[] A = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(A[i]);
            if (num < x) {
                sb.append(num).append(" ");
            }
        }
        System.out.println(sb);
    }
}
