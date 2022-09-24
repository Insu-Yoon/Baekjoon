import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        while(num%2==0){
            num /= 2;
            System.out.println(2);
        }
        for(int i=3;i<num;i+=2){
            while(num%i==0){
                num /= i;
                System.out.println(i);
            }
        }
        if(num != 1) System.out.println(num);
    }
}