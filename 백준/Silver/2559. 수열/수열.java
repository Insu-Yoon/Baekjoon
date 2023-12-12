import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] temp = new int[n];
        //배열에 온도 입력
        for(int i=0; i<n; i++) temp[i] = scanner.nextInt();

        //logic
        int answer = maxLogic(temp, n, k);

        //output
        System.out.println(answer);
    }
    static int maxLogic(int[] temp, int n, int k){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<=n-k; i++){
            sum = 0;
            for(int j=i; j<i+k; j++){
                sum += temp[j];
            }
            if(sum>max) max = sum;
        }
        return max;
    }
}