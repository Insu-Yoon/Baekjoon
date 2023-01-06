import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class Main{
    public static void main(String[] arg){
        Queue<Integer> queue = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            queue.add(i);
        }
        while(queue.size()>1){
            queue.poll();
            queue.add(queue.poll());
        }
        System.out.println(queue.poll());
    }
}