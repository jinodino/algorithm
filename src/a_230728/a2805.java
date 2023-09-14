package a_230728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a2805 {
	static int n, m, min, max;
	static int[] arr;

	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        min = max = 0;
        
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        System.out.println(binarySearch(0, arr[n]));
        

    }
	
	static public long binarySearch(long min, long max) 
	{
		long mid = 0;
		
		while (max >= min) {
			int sum = 0;
			for (int i = 0 ; i <= n; i++) {
				if (arr[i] >= mid) sum += (arr[i] - mid);
			}
			
			if (sum >= m) {
				// 평균을 높일 수 있어서
				min = mid + 1;
			} else {
				// 평균을 낮춰야해서
				max = mid - 1;
			}
			
			mid = (max + min) / 2;
		}
		
		return mid;
	}
}
