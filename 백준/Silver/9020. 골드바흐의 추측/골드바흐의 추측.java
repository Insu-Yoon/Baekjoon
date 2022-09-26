import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//2. 소수 배열 만들어놓고 이진 탐색처럼 해보기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(br.readLine());
        for (int i = 0; i < cases; i++) {
            int inputNum = Integer.parseInt(br.readLine());
            ArrayList<Integer> prime = primeArray(inputNum);
            findSum(inputNum, prime);
        }
        br.close();
    }

    public static ArrayList<Integer> primeArray(int inputNum) {//입력 숫자보다 작거나같은 소수 찾기
        ArrayList<Integer> list = new ArrayList<>();
        boolean isPrime = true;
        for (int i = 2; i <= inputNum; i++) {
            if (i == 2) list.add(i);
            if (i % 2 == 0) continue;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) isPrime = false;
            }
            if (isPrime) list.add(i);
            isPrime = true;
        }
        return list;
    }

    public static void findSum(int inputNum, ArrayList<Integer> prime) {//입력숫자와 해당 숫자이하의 소수로 답 구하기
        String result = "";
        int temp = -1;
        //4,5,6,7,8
        //input이 4면 outofbound(4면 소수가 2,3  -> 아래 for문 에러남)
        for (int i = 0;i < prime.size(); i++) { //중간에서부터 내려가면서 탐색, 3번이상 찾으면 break; //시간줄이려고 한건데 패스
            int pair1 = prime.get(i);
            int pair2 = binarySearch(inputNum - prime.get(i), 0, prime.size() - 1, prime);
            if (pair1 + pair2 == inputNum) {
                if (temp < 0) {
                    temp = Math.abs(pair1 - pair2);
                    if (pair1 <= pair2) result += pair1 + " " + pair2;
                    else result += pair2 + " " + pair1;
                }
                if (temp > Math.abs(pair1 - pair2)) {
                    temp = Math.abs(pair1 - pair2);
                    result = "";
                    if (pair1 <= pair2) result += pair1 + " " + pair2;
                    else result += pair2 + " " + pair1;
                }
            }
        }
        System.out.println(result);
    }

    public static int binarySearch(int answer, int low, int high, ArrayList<Integer> prime) {
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (answer == prime.get(mid)) {
                return prime.get(mid);
            } else if (answer < prime.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; //실패시 -1
    }
}