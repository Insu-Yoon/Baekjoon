import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        br.close();
        int m = Integer.parseInt(temp[0]);
        int n = Integer.parseInt(temp[1]);
        boolean[] arr = new boolean[n+1]; //0~n까지
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        for(int i=2;i<=n/2;i++){ 
            for(int j=2;i*j<=n;j++){
                arr[i*j] = false;
            }
        }
        for(int i=m;i<=n;i++) if(arr[i]) System.out.println(i);
    }
}