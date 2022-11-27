import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<2;j++) arr[i][j] = Integer.parseInt(st.nextToken());
        }
        
        for(int i=0;i<N;i++){
            int rank = 1;
            for(int j=0;j<N;j++){
                if(i==j) continue;
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]){
                    rank++;
                }
            }
            System.out.print(rank + " ");
        }
    }
}