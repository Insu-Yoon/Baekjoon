import java.io.*;

public class Main {
    static int[] numarray;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        numarray = new int[n];
        makeNumArray(n);
        bw.write(String.valueOf(findNum(n)));
        br.close();
        bw.close();
    }
    public static void makeNumArray(int n){
        int num = 666;
        int idx = 0;
        while(idx<n){
            String snum = num+"";
            if(snum.contains("666")){
                numarray[idx] = Integer.parseInt(snum);
                idx++;
            }
            num++;
        }
    }
    public static int findNum(int idx){
        return numarray[idx-1];
    }
}