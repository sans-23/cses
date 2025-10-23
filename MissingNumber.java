package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// You are given all numbers between 1,2,\ldots,n except one. Your task is to find the missing number.

public class MissingNumber {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(bf.readLine());
        long ans = n;

        String[] line = bf.readLine().split(" ");
        for(int i=0; i<n-1; i++){
            ans += (i+1) - Integer.parseInt(line[i]);
        }

        out.println(ans);

        out.flush();
    }
}
