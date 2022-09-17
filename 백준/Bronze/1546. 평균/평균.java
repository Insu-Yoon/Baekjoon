import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int subjects = input.nextInt();
        double[] arr = new double[subjects];
        int sum=0;
        for(int i=0;i<subjects;i++){
            arr[i]=input.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        double average = (sum/arr[subjects-1]*100)/subjects;
        System.out.println(average);
    }
}
