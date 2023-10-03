package a_231002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a9251 {
	
	static String n, m;
	
	public static Integer[][] dp;
	public static char[] str1;
	public static char[] str2;
	
	public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = br.readLine();
        m = br.readLine();

        dp = new Integer[n.length()][m.length()];
        str1 = n.toCharArray();
        str2 = m.toCharArray();
        
        System.out.println(LCS(str1.length - 1, str2.length - 1));
    }
	
	static int LCS(int x, int y)
	{
		if (x < 0 || y < 0) return 0;
		
		// 빈 공간일 시
		if (dp[x][y] == null) {
			dp[x][y] = 0;
			
			// 값이 같을 시 (대각선 + 1)
			if (str1[x] == str2[y]) {
				dp[x][y] = LCS(x - 1, y - 1) + 1;
			} else {
				// 값이 다를 시 좌 또는 위의 값 중에 큰 값 넣기
				dp[x][y] = Math.max(LCS(x - 1, y), LCS(x , y - 1));
			}
		}
		
		return dp[x][y];
	}

	
}
