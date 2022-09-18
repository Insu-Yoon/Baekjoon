import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cnt = input.nextInt();
        String str = input.next();
        int sum = 0;
        for(int i=0;i<cnt;i++){
            sum += (str.charAt(i))-'0';
        }
        System.out.println(sum);
    }
}