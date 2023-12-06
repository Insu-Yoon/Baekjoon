import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();

        //logic
        int answer = first * (first-1);

        //output
        System.out.println(answer);
    }
}