package a_230810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a2630 {
	
	static int n, blue, white;
	static int[][] arr;

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        
        arr = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for (int j = 0 ; j < n ; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        division(0, 0, n);
     
        System.out.println(white);
        System.out.println(blue);
    }
	
	static public void division(int a, int b, int size)
	{
		if (size < 1) return;
		
		// 전체가 같은 색깔로 찼는가
		if (partitionCheck(a, b, size)) {
			if (arr[a][b] == 0) {
				white++;
			} else {
				blue++;
			}
			return;
		}
		// 안찼는가
		// 안찼으면 파티션 분리
		division(a, b, size / 2);
		division(a, b + size / 2, size / 2);
		division(a + size / 2, b, size / 2);
		division(a + size / 2, b + size / 2, size / 2);
	}
	
	static public boolean partitionCheck(int a, int b, int size)
	{
		int cnt = 0;
		int target = arr[a][b];
		// 전체가 가득 같은 색깔로 찼는가
		for (int i = a ; i < a + size ; i++) {
        	for (int j = b ; j < b + size ; j++) {
        		if(target == arr[i][j]) cnt++;
        	}
        }
		
		if (cnt != size * size) return false;
		
		return true;
	}
	
}
