package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class GrayCode {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception{

        int n = Integer.parseInt(br.readLine());
        int total = 1 << n;
        for (int i = 0; i < total; i++) {
            int gray = i ^ (i >> 1);
            String s = Integer.toBinaryString(gray);
            while (s.length() < n) {
                s = "0" + s;
            }
            out.println(s);
        }

        out.flush();
    }
}
