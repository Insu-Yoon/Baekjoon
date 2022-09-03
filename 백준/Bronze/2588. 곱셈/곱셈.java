import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String j = sc.next();
        int j_1= j.charAt(0)-'0';
        int j_2= j.charAt(1)-'0';
        int j_3= j.charAt(2)-'0';
        System.out.println(i*j_3);
        System.out.println(i*j_2);
        System.out.println(i*j_1);
        System.out.println(100*i*j_1 + 10*i*j_2 + i*j_3);
    }
}