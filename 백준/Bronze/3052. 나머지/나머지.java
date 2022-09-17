import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 1;
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt()%42;
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}