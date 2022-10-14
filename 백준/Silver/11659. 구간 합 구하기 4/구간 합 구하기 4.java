import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        //누적합 0 처리하기 편하려면 +1
        int[] partSum = new int[n+1];
        
        st = new StringTokenizer(br.readLine());
        partSum[0] = 0;
        for(int i=1;i<n+1;i++){
            partSum[i] = partSum[i-1] + Integer.parseInt(st.nextToken());
        }
        
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            bw.write(partSum[k]-partSum[j-1]+"\n");
        }
        br.close();
        bw.close();
    }
}