import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();

        //logic
        int answer = 1;
        for(int i=1;i<=first;i++){
            answer *= 2;
        }

        //output
        System.out.println(answer);
    }
}