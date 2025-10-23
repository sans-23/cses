package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CoinPiles {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception{
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String[] ab = br.readLine().split(" ");
            long a = Integer.parseInt(ab[0]);
            long b = Integer.parseInt(ab[1]);

            if((a+b)%3!=0){
                out.println("NO");
            }else{
                if(a<b){
                    long tmp = a;
                    a = b;
                    b = tmp;
                }

                if(2*b<a){
                    out.println("NO");
                }else{
                    out.println("YES");
                }
            }
        }

        out.flush();
    }
}
