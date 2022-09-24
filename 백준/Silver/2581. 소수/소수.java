import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        boolean isPrime =true;
        for(int i=m;i<=n;i++){
            if(i==2) list.add(i);
            if(i<2) continue;
            if(i%2==0) continue;
            for(int j=3;j<i;j+=2){
                if(i%j==0) isPrime=false;
            }
            if(isPrime) list.add(i);
            isPrime = true;
        }
        int sum = list.stream().reduce(Integer::sum).orElse(-1);
        int min = list.stream().reduce(Integer::min).orElse(-1);
        System.out.println(sum);
        if(sum!=-1) System.out.println(min);
    }
}