import java.io.*;

public class Main {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int count = hanoi(num, 1, 2, 3);
        bw.write(count +"\n");
        bw.write(String.valueOf(sb));
        br.close();
        bw.close();
    }

    public static int hanoi(int n, int from, int temp, int to) {
        cnt++;
        if(n == 1) {
            sb.append(from + " " + to + "\n");
            return cnt;
        }
        cnt = hanoi(n - 1, from, to, temp);
        sb.append(from + " " + to + "\n");
        cnt = hanoi(n - 1, temp, from, to);
        return cnt;
    }
}
