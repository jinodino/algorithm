package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class a27726 {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		int M1 = Integer.parseInt(st.nextToken()); 

		int M2 = Integer.parseInt(st.nextToken());

		int M3 = Integer.parseInt(st.nextToken());
		
		int [][] arr = new int[N-1][N];
		
		for (int i = 0; i < M1+M2+M3; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int index1 = Integer.parseInt(st1.nextToken());
			int index2 = Integer.parseInt(st1.nextToken());
			
			arr[index1-1][index2-1] += 1;
			
		}
	
		int count = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] < 3) { 
					arr[i][j] = 0;
				} else {
					count++;
				}
			}
		}
		
		System.out.println(count);

		for (int i = 0; i < N-1; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] >= 3) { 
					int a = i+1;
					int b = j+1;
					System.out.println(a + " " + b);
				} 
			}
		}
	
	}
}
