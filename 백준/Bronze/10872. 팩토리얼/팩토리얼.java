import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(factorial(num));
    }
    public static int factorial(int num){  
        if(num==0) return 1;
        return num * factorial(num-1);
    }
}