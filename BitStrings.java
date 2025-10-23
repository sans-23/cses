package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BitStrings {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    private static long MOD = 1000000007;

    private static long pow(long n){
        if(n==1) return 2;
        long a = BitStrings.pow(n/2);
        if(n%2==0)
        return (a*a)%MOD;
        return (2*a*a)%MOD;
    }

    public static void main(String args[]) throws Exception{
        long n = Integer.parseInt(br.readLine());

        out.println(pow(n));
        out.flush();
    }
}
