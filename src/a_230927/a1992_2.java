package a_230927;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1992_2 {
	
	static int n;
	
	public static Integer[][] arr;
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        arr = new Integer[n][2];
        for (int i = 0 ; i < n ;i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	String target1 = st.nextToken();
        	String target2 = st.nextToken();
        	String target3 = st.nextToken();
        	
        	int targetIndex = target1.charAt(0) - 65;
        	arr[targetIndex][0] = target2.equals(".") ? -1 : target2.charAt(0) - 65;
        	arr[targetIndex][1] = target3.equals(".") ? -1 : target3.charAt(0) - 65;
        }
        
        first(0);
        System.out.println();
        
        second(0);
        System.out.println();
        
        third (0);
    }

	
	public static void first (int t) 
	{
		if (t == -1) {
			return;
		}
		
		System.out.print((char) (t + 65));
		
		first(arr[t][0]);
		
		first(arr[t][1]);
	}
	
	public static void second (int t) 
	{
		if (t == -1) {
			return;
		}
		
		second(arr[t][0]);
		
		System.out.print((char) (t + 65));
		
		second(arr[t][1]);
	}

	public static void third (int t) 
	{
		if (t == -1) {
			return;
		}
		
		third(arr[t][0]);
		
		third(arr[t][1]);
		
		System.out.print((char) (t + 65));
	}
}
