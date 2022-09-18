import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lines = input.nextInt();
        for(int i=0;i<lines;i++){
            int repeat = input.nextInt();
            String str = input.next();
            int len = str.length();
            for(int j=0;j<len;j++) {
                String s = String.valueOf(str.charAt(j));
                System.out.print(s.repeat(repeat));
            }
            System.out.println();
        }
    }
}
