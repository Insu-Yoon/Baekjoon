import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Todo: 1~N 중에 각 자리수가 등차수열인 수의 갯수 구하기 = i%10 - (i/10)%10 == (i/10)%10 - (i/100)%10 이런식. 두자리수는 그냥 한수인가? 그렇다. 한자리수도 그냥 등차로 치는 듯 하다
        //Todo: N의 최대값이 1000이며, 1000은 한수가 아니므로 세자리수까지 확인하는걸로 ㄱ
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cnt = 0;
        for(int i =1; i<=n;i++){
            if(check(i)) cnt++;
        }
        System.out.println(cnt);
    }
    static boolean check(int i){
        int num1 = i%10;
        int num2 = (i/10)%10;
        int num3 = (i/100)%10;
        int num4 = (i/1000)%10;
        boolean checked=false;

        if(i<100) checked = true;
        if(i>=100&&i<1000) {
            return (num1 - num2 == num2 - num3);
        }
        if(i==1000){
            return (num1-num2==num2-num3)&&(num2-num3==num3-num4);
        }

        return checked;
    }
}