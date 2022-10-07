import java.io.*;

public class Main {
    static int recursionCount=1;
    static int dpCount=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(fib(num)+" ");
        bw.write(fibonacci(num)+"");
        bw.close();
    }
    public static int fib(int num){
        if(num==1||num==2) return recursionCount;
        return fib(num-1)+fib(num-2);
    }

    public static int fibonacci(int num){
        int[] fib = new int[num+1];
        fib[1] = 1;
        fib[2] = 1;
        for(int i=3;i<=num;i++){
            fib[i] = fib[i-1] + fib[i-2];
            dpCount++;
        }
        return dpCount;
    }
}