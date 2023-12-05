import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextInt();

        //logic n-1 * (n-i) = n^2 -(1+i)n + i 
        //-> for i ~ n-1 / for i+1 ~ n
        //-> 1 : 2 to n / 2 : 3 to n / n-1 : n to n
        //-> n-1 / n-2 / n-3 / n-4 / ... 1        
        //-> n(n-1)/2
        long answer = first*(first - 1)/2;

        //output
        System.out.println(answer);
        System.out.println(2);
    }
}