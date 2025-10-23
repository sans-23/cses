package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class NumberSpiral {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception {
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            String[] line = br.readLine().split(" ");
            long row = Integer.parseInt(line[0]);
            long col = Integer.parseInt(line[1]);

            long ans = helper(row, col);

            // for(int p=1; p<=5; p++){
            //     for(int j=1; j<=5; j++){
            //         out.print(helper(p, j) + " ");
            //     }
            //     out.println();
            // }

            out.println(ans);
        }
        out.flush();
    }

    private static long helper(long row, long col){
        if(row>col){
            if(row%2==0){
                return row*row - col +1;
            }else{
                return (row-1)*(row-1) + col;
            }
        }else{
            if(col%2!=0){
                return col*col - row +1;
            }else{
                return (col-1)*(col-1) + row;
            }
        }
    }
    
}
