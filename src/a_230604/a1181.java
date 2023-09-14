package a_230604;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class a1181 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<String> arrayList = new ArrayList<>();
		int arrIndex = 0;
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			if (!arrayList.contains(word)) {
				arrayList.add(word);
				arrIndex++;
			}
		}
		String arr[] = new String[arrIndex];
		int tempindex = 0;
		for (String word : arrayList) {
			arr[tempindex] = word;
			tempindex++;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int len = arr[i].length();
				int lenj = arr[j].length();
				if (len > lenj) {
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				} else if (len == lenj) {
					if (!compareWord(arr[i], arr[j])) {
						// 오른쪽이 더 빨리나옴
						String temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					} 
				}
			}
		}
		
		for(String str : arr) {
			sb.append(str).append("\n");
		}
		
		System.out.println(sb);
	}
	
	static public boolean compareWord(String a, String b)
	{
		int wordIndex = 0;
		while (true) {
			char aChar = a.charAt(wordIndex);
			char bChar = b.charAt(wordIndex);
			if (aChar > bChar) {
				// false는 오른쪽
				return false;
			} else if (aChar < bChar) {
				// true는 왼쪽
				return true;
			} 
			
			wordIndex++;
		}
	}
}
