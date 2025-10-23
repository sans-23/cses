package cses;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class StringReorder {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String args[]) throws Exception{
        String s = br.readLine();

        int[] hash = new int[26];
        int cnt = s.length();

        for(char c : s.toCharArray()){
            hash[c-'A']++;
        }

        StringBuilder sb = new StringBuilder();
        char prev = '\0';

        while(cnt>0){
            // get best candidate for this pos 

            for(int i=0; i<26; i++){
                if((char)('A'+i)!=prev && hash[i]>0){
                    hash[i]--;
                    sb.append((char)('A'+i));
                    prev = (char)('A'+i);
                    break;
                }
            }
            cnt--;
        }
        if(sb.length()!=s.length()){
            out.println("-1");
        }
        
        out.println(sb.toString());
        out.flush();
    }
}
