import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> que = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            String command = br.readLine();
            if(command.contains("push")) {
                que.add(Integer.parseInt(command.split(" ")[1]));
            } else if(command.equals("pop")) {
                if(!que.isEmpty()) {
                    sb.append(que.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if(command.equals("size")) {
                sb.append(que.size()).append("\n");
            } else if(command.equals("empty")) {
                if(que.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if(command.equals("front")) {
                Integer item = que.peek();
                if(item == null) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(item).append("\n");
                }
            } else if(command.equals("back")) {
                Integer item = que.peekLast();
                if(item == null) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(item).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}