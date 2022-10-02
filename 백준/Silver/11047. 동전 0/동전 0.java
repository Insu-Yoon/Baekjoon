import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] pocket = new int[n];
        for(int i=0; i<n; i++){
            pocket[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        bw.write(String.valueOf(minCoin(pocket,k)));
        bw.close();
    }
    public static int minCoin(int[] pocket, int k){
        int cnt = 0;
        int temp;
        for(int i=pocket.length-1;i>=0;i--){
            temp = k/pocket[i];
            k-= temp*pocket[i];
            cnt += temp;
        }
        return cnt;
    }
}