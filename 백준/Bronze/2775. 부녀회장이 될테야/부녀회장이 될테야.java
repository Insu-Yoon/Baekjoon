import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //https://www.acmicpc.net/problem/2775
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        for(int i=0;i<cases;i++){ //0층의 j호에는 j명이 산다.
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(headCount(k,n));
        }
        br.close();
    }
    static public int headCount(int k,int n){
        if(k==0) return n;
        if(n==1) return 1;
        return headCount(k-1,n)+headCount(k,n-1);
    }
}