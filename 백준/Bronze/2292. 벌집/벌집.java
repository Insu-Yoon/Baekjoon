import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Todo: 1, 7, 19, 37, 61이 각 반경의 마지막 수 -> +6, +12, +18, +24 -> n번만에 갈 수 있는 수의 최대값은 6n씩 늘어난다.
        //n=1 -> 7 = 1+6n, n=2 ->19 = 1+9n, n=3 -> 37 = 1+12n;
        //n에따른 최대수 = 1+3n(n+1) , 최소는 2+3n(n-1) -> n일 때 3n^2 - 3n + 2 부터 3n^2 + 3n + 1
        //x가 들어왔다 -> n값 찾기 = if(3n^2-3n+2 <x && x<3n^2+3n+1) return n ->
        Scanner input = new Scanner(System.in);
        long x = input.nextLong();
        int n=0;
        while (true){
            if(x==1) {
                System.out.println(1);
                break;
            }
            else if(min(n)<=x&&x<=max(n)) {
                System.out.println(n+1);//첫 칸 포함
                break;
            }
            n++;
        }
    }
    static long min(int n){
        long min = 3*n*(n-1)+2; // 0 -> 2, 1-> 2, 2-> 8, 3-> 20
        return min;
    }
    static long max(int n){     // 0 ->2, 1-> 7, 2-> 19
        long max = 3*n*(n+1)+1;
        return max;
    }
}
