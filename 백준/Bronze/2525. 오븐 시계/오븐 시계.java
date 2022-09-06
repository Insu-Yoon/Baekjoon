import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int l;
        l = (int)(j+k)/60;
        i = i +l;
        j = (j+k)%60;
        if(i>=24){
            i-=24;
        }
        System.out.printf("%d %d",i,j);
    }
}