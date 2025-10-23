package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IncreasingArray {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");

        long ans = 0;
        int prev = Integer.parseInt(line[0]);

        for(int i=1; i<n; i++){
            int curr = Integer.parseInt(line[i]);
            if(prev>curr){
                ans += (prev-curr);
            }else{
                prev = curr;
            }
        }

        out.println(ans);

        out.flush();
    }
}
