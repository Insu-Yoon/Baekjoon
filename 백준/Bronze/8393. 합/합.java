import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int sum=0;
        for(int j=1;j<=i;j++){
            sum+=j;
        }
        System.out.println(sum);
    }
}