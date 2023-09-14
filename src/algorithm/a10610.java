package algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class a10610 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		int[] arr = new int[n.length()];
		int sum = 0;
		
		for (int i = 0; i < n.length(); i++) {
			arr[i] = Integer.parseInt(n.substring(i, i+1)); 
			sum += arr[i];
		}

		Arrays.sort(arr);

		if (sum % 3 == 0 && n.contains("0")) {
			for (int i = n.length() - 1; i >= 0; i--) {
				System.out.print(arr[i]);
			}
		} else {
			System.out.println(-1);
		}
	}
}
