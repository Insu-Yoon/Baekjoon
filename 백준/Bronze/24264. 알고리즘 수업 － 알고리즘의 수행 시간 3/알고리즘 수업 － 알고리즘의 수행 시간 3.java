import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextInt();

        //logic
        long answer1 = first * first;
        int answer2 = 2;

        //output
        System.out.println(answer1);
        System.out.println(answer2);
    }
}