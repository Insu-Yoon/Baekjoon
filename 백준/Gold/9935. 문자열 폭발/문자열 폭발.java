import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        int length = second.length();
        
        Stack<Character> st = new Stack<>();
        //logic
        for(int i=0; i<first.length(); i++){
            st.push(first.charAt(i));
            if(st.size()>= length){
                boolean check = true;
                for(int j=0; j<length; j++){
                    if(st.get(st.size()-length+j) != second.charAt(j)){
                        check = false;
                        break;
                    }
                }
                if(check){
                    for(int j=0; j<length; j++){
                        st.pop();
                    }
                }
            }
        }

        //output
        StringBuilder sb = new StringBuilder();
        for(Character c : st) sb.append(c);
        System.out.println(sb.length()==0? "FRULA" : sb.toString());
    }
}