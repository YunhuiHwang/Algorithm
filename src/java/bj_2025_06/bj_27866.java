package java.bj_2025_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_27866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int n = Integer.parseInt(br.readLine())-1;

        br.close();

        System.out.println(st.charAt(n));


    }
}
