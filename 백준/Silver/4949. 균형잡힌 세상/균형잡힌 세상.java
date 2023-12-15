import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String temp;
        while(true){
            temp = scanner.nextLine();
            if(temp.equals(".")) break;
            sb.append(temp);
        }

        //logic
        String[] split = sb.toString().split("\\.");
        Stack<Character> st = new Stack<>();
        for(String str:split){
            boolean check = true;
            for(int i=0;i<str.length();i++){
                switch (str.charAt(i)){
                    case '(':
                    case '[':
                        st.push(str.charAt(i));
                        break;
                    case ')':
                        if(st.isEmpty()||st.peek()!='(') {
                            check = false;
                            break;
                        }
                        else st.pop();
                        break;
                    case ']':
                        if(st.isEmpty()||st.peek()!='[') {
                            check = false;
                            break;
                        }
                        else st.pop();
                        break;
                    default:
                        break;
                }
            }
            if(st.isEmpty()&&check) System.out.println("yes");
            else System.out.println("no");
            st.clear();
        }
    }
}