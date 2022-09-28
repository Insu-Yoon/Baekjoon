import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//github에 백준허브로 연동해서 올리기
public class Main {
        static boolean[] visit;
        static int coms;
        static int[][] edge;
        static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //컴퓨터 수 입력
        coms = Integer.parseInt(br.readLine());
        //간선 수 입력
        int edgeNumber = Integer.parseInt(br.readLine());
        //인접 행렬을 담을 배열 생성
        edge = new int[coms+1][coms+1];
        //방문 배열 생성
        visit = new boolean[coms+1];
        //인접 행렬 생성
        for(int i=0;i<edgeNumber;i++) {
            String[] temp = br.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            edge[a][b] = 1;
            edge[b][a] = 1;
        }
        br.close();
        System.out.println(dfs(1));
    }
    //dfs로 탐색
    public static int dfs(int com){
        visit[com] = true;
        for(int i=1;i<=coms;i++) {
            if (!visit[i] &&edge[com][i]==1){
                count++;
                dfs(i);
            }
        }
        return count;
    }
}