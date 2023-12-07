import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException {
        //input

        int num = scanner.nextInt();
        //int com = 0;

        Integer output;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<num; i++){
            //com = scanner.nextInt();
            output = switchingClass(stack, scanner.nextInt());
            if(output!=null) sb.append(output).append("\n");
        }
        System.out.println(sb);
    }

    static Integer switchingClass(Stack stack, int com){
        switch(com){
            case 1: stack.push(scanner.nextInt());
                break;
            case 2: if(stack.isEmpty()) return -1;
            else return (int) stack.pop();
            case 3: return stack.size();
            case 4: if(stack.isEmpty()) return 1;
            else return 0;
            case 5: if(stack.isEmpty()) return -1;
            else return (int) stack.peek();
            default:
                return null;
        }
        return null;
    }
}