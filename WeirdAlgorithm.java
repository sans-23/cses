package cses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class WeirdAlgorithm {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    // Reads a line and splits by the given regex, default is space
    static String[] nextLineSplit(String regex) throws IOException {
        return br.readLine().trim().split(regex);
    }

    static String[] nextLineSplit() throws IOException {
        return br.readLine().trim().split("\\s+");
    }

    // Example: parse line of integer inputs
    static int[] nextIntArray() throws IOException {
        String[] tokens = nextLineSplit();
        int[] res = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) res[i] = Integer.parseInt(tokens[i]);
        return res;
    }

    // Fast input of single line integer
    static int nextInt() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    // Fast input of single line long
    static long nextLong() throws IOException {
        return Long.parseLong(br.readLine().trim());
    }

    public static void main(String[] args) throws Exception{
        Long n = nextLong();
        out.print(n+" ");

        while(n!=1){
            if(n%2==0){
                n/=2;
            }else{
                n = n*3 +1;
            }
            out.print(n+" ");
        }

        out.flush();
    }
}
