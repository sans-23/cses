package cses;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Permutation {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(br.readLine());

        if(n==1){
            out.println(1);
        }else if(n==2 || n==3){
            out.println("NO SOLUTION");
        }else{
            for(int i=2; i<=n; i+=2){
                out.print(i + " ");
            }
            for(int i=1; i<=n; i+=2){
                out.print(i + " ");
            }
        }

        out.flush();
    }
}
