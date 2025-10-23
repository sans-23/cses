package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TwoSet {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception{
        long n = Integer.parseInt(br.readLine());

        long sum = 0;

        if(n%2==0){
            sum = (n/2)*(n+1);
        }else{
            sum = ((n+1)/2)*n;
        }

        if(sum%2==0){
            out.println("YES");
            List<Long> first = new ArrayList<>();
            List<Long> second = new ArrayList<>();
            sum/=2;

            long i = n;

            while(i>0){
                if(sum-i>=0){
                    sum-=i;
                    first.add(i);
                }else{
                    second.add(i);
                }
                i--;
            }

            out.println(first.size());
            for(long j: first){
                out.print(j + " ");
            }   

            out.println();

            out.println(second.size());
            for(long j: second){
                out.print(j + " ");
            }

        }else{
            out.println("NO");
        }

        out.flush();
    }
}
