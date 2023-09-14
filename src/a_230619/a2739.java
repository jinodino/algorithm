package a_230619;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2739 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 1 ; i < 10 ; i ++) {
        	sb.append(N + " * " + i + " = " + N * i).append("\n");
        }
        
        System.out.println(sb);
    }
}
