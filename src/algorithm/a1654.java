package algorithm;

import java.io.*;
import java.util.*;

public class a1654 {
    static public void main (String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[k];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) max = arr[i];
        }

        bw.write(String.valueOf(parametricSearch(n, max, arr)));
        bw.flush();
        bw.close();
    }

    static public long parametricSearch(int cableCount, int max, int[] arr) {
        long low = 1;
        long high = max;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] / mid > 0) count += arr[i] / mid;
            }

            if (cableCount > count) high = mid - 1;
            else low = mid + 1;
        }

        return high;
    }
}
