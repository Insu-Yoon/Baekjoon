import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        StringTokenizer st;
        String[] arr = new String[len];
        int sum;
        for(int i=0;i<len;i++){
            sum=0;
            arr[i] = input.next();
            st = new StringTokenizer(arr[i],"X");
            int tokens = st.countTokens();
            for(int j=0;j<tokens;j++){
                String token = st.nextToken();
                for(int k=1;k<=token.length();k++){
                    sum+=k;
                }
            }
            System.out.println(sum);
        }
    }
}