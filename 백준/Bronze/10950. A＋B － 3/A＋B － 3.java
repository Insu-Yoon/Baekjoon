import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        for(int j=0;j<i;j++){
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println(a+b);
        }
    }
}