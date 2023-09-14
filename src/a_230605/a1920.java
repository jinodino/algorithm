package a_230605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < M; i++) {
			int target = Integer.parseInt(st.nextToken());
			
			if (binarySearch(arr, target, 0, N - 1)) {
				sb.append(1).append("\n");
			} else {
				sb.append(0).append("\n");
			}
		}
		
		System.out.println(sb);
		
	}
	
	static public boolean binarySearch(int[] arr, int target, int low, int high)
	{
		int mid;
		if(low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == target) return true;
			else if (arr[mid] > target) {
				return binarySearch(arr, target, low, mid - 1);
			} else if (arr[mid] < target) {
				return binarySearch(arr, target, mid + 1, high);
			}
		}
		
		return false;
	}
}
