import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String[] num = br.readLine().split(" ");
        br.close();
        boolean isPrime =true;
        int cnt = 0;
        for(int i=0;i<num.length;i++){
            if(Integer.parseInt(num[i])==2) cnt++;
            if(Integer.parseInt(num[i])<2) continue;
            if(Integer.parseInt(num[i])%2==0) continue;
            for(int j=3;j<Integer.parseInt(num[i]);j+=2){
                if(Integer.parseInt(num[i])%j==0) isPrime=false;
            }
            if(isPrime) cnt++;
            isPrime = true;
        }
        System.out.println(cnt);
    }
}