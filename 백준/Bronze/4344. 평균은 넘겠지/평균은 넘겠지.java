import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        int cnt;
        double sum;
        double over_average;
        for(int i=0;i<cases;i++){
            cnt = input.nextInt();
            int[] arr = new int[cnt];
            sum = 0;
            over_average = 0;
            for(int j=0;j<cnt;j++){
                arr[j]= input.nextInt();
                sum += arr[j];
            }
            for(int j=0;j<cnt;j++){
                if(arr[j]>sum/cnt){
                    over_average++;
                }
            }
            System.out.printf("%.3f%% %n",over_average/cnt*100);
        }
    }
}