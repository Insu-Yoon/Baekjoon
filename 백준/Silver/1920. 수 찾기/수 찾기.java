import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        br.close();
        for(int i=0;i<m;i++) bw.write(binarySearch(Integer.parseInt(st.nextToken()),arr)+"\n");
        bw.close();
    }
    public static int binarySearch(Integer num, int[] arr){
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            if(num==arr[mid]) return 1;
            else if(num>arr[mid]) low = mid+1;
            else if(num<arr[mid]) high = mid-1;
        }
        return 0;
    }
}