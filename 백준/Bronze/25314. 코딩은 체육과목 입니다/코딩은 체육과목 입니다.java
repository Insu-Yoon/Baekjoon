import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String answer = "int";
       
        while(number>0){
            answer = "long " + answer;
            number -= 4;
        }

        System.out.println(answer);
    }
}