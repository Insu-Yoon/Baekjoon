import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            int a = s.nextInt();
            int b = s.nextInt();
            sum+=a*b;
        }
        String r = x==sum?"Yes":"No";
        System.out.println(r);
    }
}