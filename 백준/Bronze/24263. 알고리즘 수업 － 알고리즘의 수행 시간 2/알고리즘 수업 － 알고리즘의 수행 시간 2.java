import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();

        //logic
        int answer1 = first;
        int answer2 = 1;
        
        //output
        System.out.println(answer1);
        System.out.println(answer2);
    }
}