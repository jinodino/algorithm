package a_230608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a10816 {
	static int N, M;
	static StringTokenizer st;
	static StringBuffer sb;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuffer();
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
		
		Arrays.sort(arr);

		M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int target = Integer.parseInt(st.nextToken());
			int a = binarySearchUp(target);
			int b = binarySearchDown(target);
			sb.append(a - b + " ");
		}
		
		System.out.println(sb);
	}
	
	static public int binarySearchUp(int target)
	{
		int start = 0;
        int end = arr.length;
        while (start < end) {
            int mid = (start + end) / 2;
 
            if (target < arr[mid]) {
                end = mid; // 하한선을 내려줘서 target 왼쪽 값들 중
                // target을 초과하는 값들 중 가장 작은 값/인덱스 찾아주기
            } else {
                start = mid + 1;
            }
        }
        return end;
	}
	
	static public int binarySearchDown(int target)
	{
		int start = 0;
        int end = arr.length;
        
        while (start < end) {
            int mid = (start + end) / 2;
            if (target <= arr[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
 
        }
        return end;
	}
}
