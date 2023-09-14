package algorithm;

import java.util.Scanner;

public class a16953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		int count = 1;
		
		while(s != e) {
			String sTarget = Integer.toString(e);
			char targetEnd = sTarget.charAt(sTarget.length() - 1);
			
			if(targetEnd == '1' && e != 1) {
				e = Integer.parseInt(sTarget.substring(0, sTarget.length() - 1));
			} else if (e % 2 == 0) {
				e /= 2;
			} else {
				count = -1;
				break;
			}
			count++;
		}
		
		System.out.println(count);
	}
}
