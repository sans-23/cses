package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class DigitQueries {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception {
        int q = Integer.parseInt(br.readLine());
        for(int p=0; p<q; p++){
            long n = Long.parseLong(br.readLine());
            int i = 1;
            while(true){
                long totalNumbers = 9 * (long)Math.pow(10, i-1);
                long digitOccupied = i * totalNumbers;
                if(n > digitOccupied){
                    n -= digitOccupied;
                    i++;
                } else {
                    // we shall get solution here
                    // n=24 -> n=15 123456789-[10111213141516[1]718192021]
                    // 15/i -> ceil(15/2) -> 8th 2 digit number ka 15%2

                    long index = n - 1;
                    long number = (long)Math.pow(10, i-1) + (index / i);
                    int digitIndex = (int)(index % i);
                    String numberStr = Long.toString(number);
                    out.println(numberStr.charAt(digitIndex));
                    break;
                }
            }
        }
        out.flush();
    }
}
