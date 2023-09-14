package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a2864 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		String t1 = st.nextToken();
		String t2 = st.nextToken();
		String temp1 = t1;
		String temp2 = t2;
	
		temp1 = temp1.replace("5", "6");
		temp2 = temp2.replace("5", "6");

		int max = Integer.parseInt(temp1) + Integer.parseInt(temp2);
		
		temp1 = t1;
		temp2 = t2;
		
		temp1 = temp1.replace('6', '5');
		temp2 = temp2.replace('6', '5');
		
		int min = Integer.parseInt(temp1) + Integer.parseInt(temp2);
		
		System.out.println(min + " " + max);
		
	}

}
