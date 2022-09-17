import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        ArrayList<Integer> arl=new ArrayList<>();
        for(int i=0;i<amount;i++){
            int num = input.nextInt();
            arl.add(num);
        }
        System.out.println(Collections.min(arl) +" " +Collections.max(arl));
    }
}
