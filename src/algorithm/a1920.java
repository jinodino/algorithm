package algorithm;

import java.io.*;
import java.util.*;

public class a1920 {
    static public void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            bw.write(binarySearch(Integer.parseInt(st.nextToken()), arr) + "\n");
        }

        bw.flush();
        bw.close();
    }

    static public int binarySearch(int target, int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return 1;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return 0;
    }
}
