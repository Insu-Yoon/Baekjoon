import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] arr = new char[str.length()];
        int idx;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        for (char j='a';j<='z';j++){
            idx = -1;
            for(int i=str.length()-1;i>=0;i--) {
                if (j == arr[i]) idx=i;
            }
            System.out.print(idx+" ");
        }
    }
}