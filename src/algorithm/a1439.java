package algorithm;

import java.util.Scanner;

public class a1439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		
		String[] arr = new String [n.length()];
		
		int od = 0;
		int zd = 0;
		String temp = "";

		for (int i = 0; i < n.length(); i++) {
			arr[i] = n.substring(i, i+1);
			if (!temp.equals(arr[i])) {
				if (arr[i].equals("1")) {
					od++;
				} else {				
					zd++;
				}
			}
			temp = arr[i];
		}
		
		System.out.println(Math.min(od, zd));
	}

}
