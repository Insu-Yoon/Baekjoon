import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        str = str.toLowerCase();
        int result=0;
        for (int i=0;i<str.length();i++){
            switch (str.charAt(i)){
                case 'a':
                case 'b':
                case 'c':
                    result+=3;
                    break;
                case 'd':
                case 'e':
                case 'f':
                    result+=4;
                    break;
                case 'h':
                case 'g':
                case 'i':
                    result+=5;
                    break;
                case 'j':
                case 'k':
                case 'l':
                    result+=6;
                    break;
                case 'm':
                case 'n':
                case 'o':
                    result+=7;
                    break;
                case 'p':
                case 'q':
                case 'r':
                case 's':
                    result+=8;
                    break;
                case 't':
                case 'u':
                case 'v':
                    result+=9;
                    break;
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    result+=10;
                    break;
                default:
                    result+=11;
                    break;
            }
        }
        System.out.println(result);
    }
}
