import java.io.*;
import java.util.Stack;
public class Main{
    public static void main(String arg[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            System.out.println(isVPS(br.readLine()));
        }
        br.close();
    }
    public static String isVPS(String str){
        if(str.length()%2!=0) return "NO";
        if(str.charAt(0)==')') return "NO";
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(') stack.push(1);
            else if(stack.size()==0) return "NO";
            else stack.pop();
        }
        if(stack.size()==0) return "YES";
        return "NO";
    }
}