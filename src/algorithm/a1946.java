package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class a1946 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		// test 갯수
		int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
        	// 인원 수
        	int n = sc.nextInt();
        	int [] arr = new int[n+1];

        	for (int j = 0; j < n ; j++) {
        		// 서류, 면접 등수
        		int s = sc.nextInt();
        		int m = sc.nextInt();
        		arr[s] = m; 
        	}

        	int index = arr[1]; 
        	int count = 1;
        	for (int c = 2; c <= n ; c++) {
        		if(index > arr[c]) {
        			index = arr[c];
        			count++;
        		}
        	}
        	
        	sb.append(count);
            sb.append("\n");
        }
        
    	System.out.println(sb.toString());
	}
}
