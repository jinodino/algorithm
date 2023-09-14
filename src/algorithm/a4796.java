package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class a4796 {
	
	static BufferedReader br;
	static BufferedWriter bw;
	static int P, L, V, ans, index;
	static String str;
	static String[] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		index = 1;
		ans = 0;
		arr = new String[3];
		str = br.readLine();
		while(!str.equals("0 0 0")) {
			arr = str.split(" ");
			// L:0 P:1 V:2
			L = Integer.parseInt(arr[0]);
			P = Integer.parseInt(arr[1]);
			V = Integer.parseInt(arr[2]);
			
			ans = ((V / P) * L) + Math.min((V % P), L);
			bw.write("Case " + index + ": " + ans + "\n");
			
			str = br.readLine();
			index++;
		}
		bw.flush();
		bw.close();
	}
}
