import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static int[] arr;
    public static int n, m;
    
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        arr = new int[m];
        
        dfs(1,0);
        
    }
    
    public static void dfs(int index, int depth){
        //depth(값이 들어간 arr길이)가 m이되면 출력
        if(depth == m){
            for(int val:arr){
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i=index; i<=n; i++){
            arr[depth] = i;
            dfs(i+1, depth+1);
        }
    }
}