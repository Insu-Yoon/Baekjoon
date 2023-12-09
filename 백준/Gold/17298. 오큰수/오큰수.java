import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        //input
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int[] arr = new int[first];
        for(int i=0; i<first; i++){
            arr[i] = scanner.nextInt();
        }
        
        Stack<Integer> st = new Stack<>();
       
        // 'first' 횟수만큼 반복하며, peek값과 현재값을 비교하여
        // 크다 -> 배열 arr에서 pop() index의 값을 현재값으로 치환
        for(int i=0; i<first; i++){
            //스택이 비지않음&&peek값보다 arr[i]값이 큰동안
            //스택 pop해서 나온 인덱스 -> arr[pop()] = arr[i]
            while(!st.isEmpty() && arr[st.peek()]< arr[i]){
                arr[st.pop()] = arr[i];
            }
            //둘 중 한가지라도 만족하지 않으면 이번 인덱스를 st에 push
            st.push(i);
        }
        
        //위 반복이 끝나고도 스택에 남아있다 -> 오큰수가 없다 = -1
        while(!st.isEmpty()) arr[st.pop()] = -1;      

        //output
        StringBuilder sb = new StringBuilder();
        for(Integer i : arr) sb.append(i).append(' ');
        System.out.println(sb);
    }
}