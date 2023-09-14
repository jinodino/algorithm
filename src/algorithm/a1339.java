package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class a1339 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			String alp = br.readLine();
			arr[i] = alp;
			int len = alp.length();
			for (int j = 0; j < alp.length(); j++) {
				String alpIndex = alp.substring(j, j+1);
				int alpPow = (int) (Math.pow(10, len) / 10);
				if (!map.containsKey(alpIndex)) {
					map.put(alpIndex, alpPow);
				} else if (map.containsKey(alpIndex) && alpPow > map.get(alpIndex)) {
					map.put(alpIndex, alpPow);
				}
				len--;
			}
		}
		
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());

		// 비교함수 Comparator를 사용하여 내림 차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
			{
				// 내림 차순으로 정렬
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
		
		// 결과 출력
		int p = 9;
		int temp = 0;
		for(Entry<String, Integer> entry : list_entries) {
			map.put(entry.getKey(), p);
			if (temp != entry.getValue()) {
				p--;
			}
			temp = entry.getValue();
		}

		int sum = 0;
		for (int i = 0; i < n; i++) {
			int len = arr[i].length();
			String line = "";
			for (int j = 0; j < len; j++) {
				String alpIndex = arr[i].substring(j, j+1);
				if (map.get(alpIndex) != null) {
					line += map.get(alpIndex);
				}
			}
			sum += Integer.parseInt(line);
		}
		System.out.println(sum);
	}

}
