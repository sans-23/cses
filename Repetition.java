package cses;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Repetition {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{
        String s = br.readLine();
        int mx = 1;
        int curr = 1;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curr+=1;
            }else{
                mx = Math.max(mx, curr);
                curr = 1;
            }
        }

        mx = Math.max(mx, curr);

        out.print(mx);
        out.flush();
    }
}