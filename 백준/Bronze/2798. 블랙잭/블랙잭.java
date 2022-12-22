import java.util.*;
import java.io.*;

public class Main {
    static int result = 0, cN = 0, tot = 0, card[];
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer init = new StringTokenizer(br.readLine());
        cN = Integer.parseInt(init.nextToken());
        tot = Integer.parseInt(init.nextToken());
        card = new int[cN];
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(cN-- > 0)
            card[cN] = Integer.parseInt(st.nextToken());
        blackJack(0, 0, 0);
        System.out.println(result);
    }
    static void blackJack(int idx, int cnt, int sum) {
        if(sum <= tot) {
            if (cnt == 3)
                result = Math.max(result, sum);
            else
                for(int i=idx; i<card.length; i++)
                    blackJack(i+1, cnt+1, sum+card[i]);
        }
    }
}