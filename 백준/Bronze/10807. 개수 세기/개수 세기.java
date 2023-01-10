import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) arr[i] = st.nextToken();
        int count = 0;
        String v = br.readLine();
        br.close();
        for(int i=0;i<N;i++){
            if(arr[i].equals(v)) count++;
        }
        System.out.print(count);
    }
}