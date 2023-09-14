package a_230531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class a2751 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 정렬 시간복잡도 개념을 알아야함
//		https://velog.io/@kimjy199/%EB%B0%B1%EC%A4%80-2751%EB%B2%88.-%EC%88%98-%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0-2-Java
//		https://chb2005.tistory.com/75
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list);
		
		for(Integer c : list) {
			sb.append(c).append("\n");
		}
		
		System.out.println(sb);
	}
}
