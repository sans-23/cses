package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TwoKnight {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception{
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++){
            long p = i*i;
            long total = p*(p-1)/2;
            long attacking = (i-1)*(i-2)*4;

            out.println(total-attacking);
        }

        out.flush();
    }
}
