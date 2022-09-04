import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if(m<45){
            m+=15;
            h-=1;
        }else{
            m-=45;
        }
        if(h<0){
            h=23;
        }
        System.out.printf("%d %d",h,m);
    }
}