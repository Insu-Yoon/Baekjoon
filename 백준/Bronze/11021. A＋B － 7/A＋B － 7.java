import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] arg) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        
        for(int i=1;i<=n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ans = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());           
            sb.append("Case #").append(i).append(": ").append(ans).append("\n");
        }
        System.out.print(sb);
    }
}