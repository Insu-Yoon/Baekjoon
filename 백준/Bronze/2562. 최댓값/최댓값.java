import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner input = new Scanner(System.in);
        int max=0;
        int maxindex=0;
        for(int i=0;i<9;i++){
            arr[i]=input.nextInt();
            if(i==0) max = arr[i]; else {
                if (arr[i] > max) {
                    max = arr[i];
                    maxindex = i;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxindex+1);
    }
}