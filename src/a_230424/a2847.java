package a_230424;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a2847 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int coin = 0; 
		while (n > 0) {
			// 5, 2
			if (n % 5 == 0) {
				coin += n / 5;
				break;
			}
			
			n -= 2;
			coin++;
		}
		
		if (n < 0) coin = -1;
		
		System.out.println(coin);
	}

}
