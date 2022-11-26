import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        Arrays.sort(arr);
        int result = arr[0]*arr[N-1];
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(result+"");
        bw.close();
    }
}