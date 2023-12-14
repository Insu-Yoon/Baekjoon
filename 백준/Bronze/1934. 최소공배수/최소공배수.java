import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0; i<t; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(lcm(a,b));
        }
    }
    static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
    static int gcd(int a, int b){
        int r = Math.max(a,b)%Math.min(a,b);
        if(r==0) return Math.min(a,b);
        return gcd(Math.min(a,b),r);
    }
}