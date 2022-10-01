import java.io.*;
    
public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(num));
    }
    public static int fibonacci(int num) {
        if(num == 0) return 0;
        if(num <= 2) return 1;
        return fibonacci(num-1) + fibonacci(num-2);
    }
}