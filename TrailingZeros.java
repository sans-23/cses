package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TrailingZeros {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception{
        long n = Integer.parseInt(br.readLine());
        long cnt = 0;
        long m5 = 5;
        for(int i=1; i<13; i++){
            cnt += n/m5;
            m5*=5;
        }
        out.println(cnt);
        out.flush();
    }
    
}
