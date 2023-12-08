import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        //logic
        //모든 경우의 수를 queue에 때려넣고 시간을 비교하여 최단시간 출력
        //예외 : n > k 인 경우, 순간이동이 안되므로 단순히 n-k가 최단시간
        if(n>k) {
            System.out.println(n-k);
            return;
        }
        int max = 100000;
        boolean[] visited = new boolean[max+1];

        bfs(n, k, visited, max);

        System.out.println(min);
    }

    static void bfs(int n, int k, boolean[] visited, int max){
        Queue<TimeCheck> queue = new LinkedList<>();
        queue.offer(new TimeCheck(n, 0));
        while(!queue.isEmpty()){
            //queue에서 하나씩 꺼내면서 탐색한 지점 표시
            TimeCheck timeCheck = queue.poll();
            visited[timeCheck.x] = true;

            // n = k면 이전 min값과 비교하여 최소값으로 교체
            if(timeCheck.x == k) min = Math.min(min, timeCheck.time);
            // 중복이 아닌 각 경우의 수를 queue에 넣고 다음 반복 실행
            if(timeCheck.x*2 <= max && !visited[timeCheck.x * 2]) queue.offer(new TimeCheck(timeCheck.x *2, timeCheck.time ));
            if(timeCheck.x+1 <= max && !visited[timeCheck.x+1]) queue.offer(new TimeCheck(timeCheck.x+1, timeCheck.time+1));
            if(timeCheck.x-1 >= 0 && !visited[timeCheck.x-1]) queue.offer(new TimeCheck(timeCheck.x-1, timeCheck.time+1));
        }
    }

    static class TimeCheck{
        //x = 현재 위치, time은 여기까지 오는데 걸린 시간
        int x;
        int time;

        public TimeCheck(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }
}
