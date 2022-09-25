import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean run = true;
        int cnt;
        while(run){
            cnt=0;
            int n = Integer.parseInt(br.readLine());
            if (n==0) run = false;
            else {
                boolean[] isPrime = new boolean[2 * n + 1];
                Arrays.fill(isPrime, true);
                for (int i = 2; i <= n; i++) {
                    for (int j = 2; i * j <= 2 * n; j++) {
                        isPrime[i * j] = false;
                    }
                }
                for (int i = n + 1; i <= 2 * n; i++) {
                    if (isPrime[i]) cnt++;
                }
                System.out.println(cnt);
            }
        }
        br.close();
    }
}