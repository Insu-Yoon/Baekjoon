import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num;
        for(int i=0;i<n;i++){
            num = Integer.parseInt(br.readLine());
            stack(num);
        }
        br.close();
        System.out.println(list.stream().reduce(0,Integer::sum));
    }
    public static void stack(int num){
        if(num!=0) {
            list.add(num); 
            return;
        }
        if(list.size()>0) list.remove(list.size()-1);
    }
}
