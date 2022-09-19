import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//Todo:낮에 a미터 오르고 밤에 b미터 미끄러지면 v까지가려면 얼마나 걸릴까?(정상에 도달하면 안미끄러짐)
// v/(a-b) = result 하지만 정상 도달하면 안미끄러진다? v-b/(a-b)
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        if (a >= v) System.out.println(1);else {
            int n = (v - b) / (a - b); // 만약 (v-b)/(a-b)하고 나머지가 남으면 하루더걸린다.
            if (((v - b) % (a - b)) != 0) n++;
            System.out.println(n);
        }
    }
}