import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int hasLength = Integer.parseInt(br.readLine());
        int[] has = new int[hasLength];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < hasLength; i++) {
            has[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(has);
        int compareLength = Integer.parseInt(br.readLine());
        String[] compare = br.readLine().split(" ");
        for (int i = 0; i < compareLength; i++) {
            int num = Integer.parseInt(compare[i]);
            if(binarySearch(num,has)) bw.write("1 ");
            else bw.write("0 ");
        }
        br.close();
        bw.close();
    }

    private static boolean binarySearch(int num, int[] has) {
        int leftIndex = 0;
        int rightIndex = has.length - 1;

        while(leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            int mid = has[midIndex];

            if(num < mid) rightIndex = midIndex - 1;
            else if(num > mid) leftIndex = midIndex + 1;
            else return true;
        }
        return false;
    }
}