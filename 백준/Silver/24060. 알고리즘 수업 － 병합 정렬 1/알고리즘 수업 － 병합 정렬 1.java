import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int LIMIT = 0;
    static int COUNT = 0;
    static int RESULT = -1;
    static int[] ARR;
    static int[] TEMP_ARR;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        LIMIT = Integer.parseInt(st.nextToken());
        ARR = new int[number];
        TEMP_ARR = new int[number];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < number; i++) {
            ARR[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(0, ARR.length - 1);

        System.out.println(RESULT);
        br.close();
    }

    public static void mergeSort(int p, int r) {
        if (LIMIT < COUNT) {
            return;
        }

        if (p < r) {
            int q = Math.abs((p + r) / 2);

            mergeSort(p, q);
            mergeSort(q + 1, r);
            merge(p, q, r);
        }
    }

    public static void merge(int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        while (i <= q && j <= r) {
            if (ARR[i] <= ARR[j]) {
                TEMP_ARR[t++] = ARR[i++];
            } else {
                TEMP_ARR[t++] = ARR[j++];
            }
        }

        while (i <= q) {
            TEMP_ARR[t++] = ARR[i++];
        }

        while (j <= r) {
            TEMP_ARR[t++] = ARR[j++];
        }

        i = p;
        t = 0;
        while (i <= r) {
            COUNT++;
            if (COUNT == LIMIT) {
                RESULT = TEMP_ARR[t];

                break;
            }

            ARR[i++] = TEMP_ARR[t++];
        }
    }
}