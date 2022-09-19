import java.util.Scanner;
//Todo: if((c-b)*x-a==0) return x => (c-b)x==a =>x==a/(c-b)
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double x;
        int result;
        if(c<=b) System.out.println(-1);
        else {
            x = a/(c-b);
            result = (int)x +1;
            System.out.println(result);
        }
    }
}