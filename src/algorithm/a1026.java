package algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a1026 {
    static public void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        int[] b = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += a[i] * b[n - 1 - i];
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();

    }
}
