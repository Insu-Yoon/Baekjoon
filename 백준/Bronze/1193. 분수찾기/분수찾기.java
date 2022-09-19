import java.util.Scanner;

//Todo: n번째 그룹은 n개의 요소를 가진다. n번째그룹까지의 총 갯수 = 1~n까지의 합// 초항은 1, 공차는 1인 등차수열 = (n(n+1))/2 개, n-1까지 합 = (n-1)n/2
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int n = 1;
        while (true) {
            if ((cnt_pre(n) < x) && (x <= cnt_present(n))) {
                break;
            }
            n++;
        }
        //if문 만족하고 나온 n => x가 n번째 그룹에 있다. => x-cnt_pre(n)-1 == n번째 그룹의 idx
        System.out.println(xth_value(n, x));
    }

    static int cnt_pre(int n) {//이전 그룹까지의 갯수
        return (n - 1) * n / 2;
    }

    static int cnt_present(int n) {
        return n * (n + 1) / 2;
    }

    static String xth_value(int n, int x) {
        int first = 1;
        int last = n;
        int idx = x - cnt_pre(n) - 1;
        first += idx;
        last -= idx;
        if (n % 2 == 0) return (first + "/" + last);
        else return (last + "/" + first);
    }
}