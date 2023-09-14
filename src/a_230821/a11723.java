package a_230821;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a11723 {

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int n = Integer.parseInt(br.readLine());
    	int t = 0;
        
        for (int i = 1 ; i <= n ; i++) {
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String a = st.nextToken();
        	
        	if (a.equals("add")) {
        		int b = Integer.parseInt(st.nextToken());
        		t |= (1 << b);
        	} else if (a.equals("remove")) {
        		int b = Integer.parseInt(st.nextToken());
        		t &= ~(1 << b);
        	} else if (a.equals("check")) {
        		int b = Integer.parseInt(st.nextToken());
    			if ((t & (1 << b)) == (1 << b)) sb.append(1).append("\n");
    			else sb.append(0).append("\n");
        	} else if (a.equals("toggle")) {
        		int b = Integer.parseInt(st.nextToken());
    			if ((t & (1 << b)) == (1 << b)) t &= ~(1 << b);
    			else t |= (1 << b);
        	} else if (a.equals("all")) {
        		t = (1 << 21) - 1;
        	} else if (a.equals("empty")) {
        		t = 0;
        	}
        }
        
        System.out.println(sb);
    }
}
