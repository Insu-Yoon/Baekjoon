import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String> set = new HashSet<>();
 
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
 
        int cnt = 0;
        
        for(int i=0; i<M; i++) {
            String s = br.readLine();
            if(set.size()==0) break;
            if(set.contains(s)) {
                cnt++;
                //set.remove(s);
            }
        }
        br.close();
        System.out.println(cnt);
    }
}
