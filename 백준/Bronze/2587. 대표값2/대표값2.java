import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+= arr[i];
        }
        int avg = sum/arr.length;
        br.close();
        Arrays.sort(arr);
        bw.write(avg+"\n");
        bw.write(arr[2]+"");
        bw.close();
    }
}