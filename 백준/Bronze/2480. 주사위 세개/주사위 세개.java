import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int result;
        if(i==j&&j==k){
            result = 10000 + 1000*i;
        }else if(i==j||j==k||k==i){
            if(j==k){
                result = 1000 + 100*j;
            }else{
                result = 1000 + 100*i;
            }
        }else{
            int[] arr = {i,j,k};
            IntStream is = Arrays.stream(arr);
            OptionalInt oi = is.max();
            int l = oi.getAsInt();
            result = 100 * l;
        }
        System.out.println(result);
    }
}