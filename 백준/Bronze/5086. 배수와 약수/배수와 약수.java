import java.io.*;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            if(i==0&&j==0) break;
            bw.write(answer(i,j)+"\n");
        }
        br.close();
        bw.close();
    }

    public static String answer(int i, int j){
        String[] fmn = {"factor", "multiple", "neither"};
        if(j%i==0) return fmn[0];
        if(i%j==0) return fmn[1];
        else return fmn[2];
    }
}