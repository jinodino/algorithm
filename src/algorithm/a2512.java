package algorithm;

import java.io.*;
import java.util.StringTokenizer;

public class a2512 {
    static public void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > max) max = arr[i];
        }

        int m = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(parametricSearch(m, max, arr)));
        bw.flush();
        bw.close();

    }

    static public int parametricSearch(int budget, int max, int[] arr) {
        int low = 1;
        int high = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int basket = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > mid) {
                    basket += mid;
                } else {
                    basket += arr[i];
                }
            }
//            System.out.println(low + " : " + high + " : " + mid);
//            System.out.println(basket);

            if (budget >= basket) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }
}
