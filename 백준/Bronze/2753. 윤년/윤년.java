import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        if(i%100==0){
            if(i%400==0) {
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }else if(i%4==0){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}