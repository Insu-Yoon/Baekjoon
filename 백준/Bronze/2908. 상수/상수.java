import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(reverse(num1)>reverse(num2)) System.out.println(reverse(num1));
        else System.out.println(reverse(num2));
    }
    public static int reverse(int i){
        int num1 = i%10;
        int num2 = i/10%10;
        int num3 = i/100%10;
        int result = 100*num1 + 10*num2 + num3;
        return result;
    }
}
