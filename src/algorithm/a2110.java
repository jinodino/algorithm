package algorithm;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a2110 {
    static public void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        bw.write(String.valueOf(binarySearch(c, arr)));

        bw.flush();
        bw.close();

    }

    static public int binarySearch(int c, int[] arr) {
        int low = 0;
        int high = arr[arr.length - 1];

        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 1;
            int pivot = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= pivot + mid) {
                    count += 1;
                    pivot = arr[i];
                }
            }

            if (c > count) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }

        return ans;
    }
}
