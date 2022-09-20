import java.util.Scanner;
//Todo : 높이 H 너비 W. H방향으로 먼저 다 채워지고 W++; N번째손님 => 층은 N%H 호수는 (int)N/H +1
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        for(int i=0;i<cases;i++) {
            int h = input.nextInt();
            int w = input.nextInt();
            int n = input.nextInt();
            room_number(n, h);
        }
    }

    static int floor(int n, int h){
        if(n%h==0) return h;
        return n%h;
    }
    static int number(int n, int h){
        if (n%h==0) return (int)(n/h);
        return (int)(n/h+1);
    }
    static void room_number(int n, int h) {
        if(number(n,h)<10) System.out.println(floor(n,h)+"0"+number(n,h));
        else System.out.println(floor(n,h)+""+number(n,h));
    }
}