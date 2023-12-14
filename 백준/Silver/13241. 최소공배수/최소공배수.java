import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        System.out.println(a*b/lcd(a,b));
    }
    static long lcd(long a, long b){
        if(Math.max(a,b)%Math.min(a,b)==0) return Math.min(a,b);
        return lcd(Math.min(a,b),Math.max(a,b)%Math.min(a,b));
    }
}