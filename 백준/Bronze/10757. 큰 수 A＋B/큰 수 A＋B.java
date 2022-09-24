import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //todo 0 < A,B < 10^10000 일 때 A+B 구하기
        Scanner input = new Scanner(System.in);
        BigInteger A = input.nextBigInteger();
        BigInteger B = input.nextBigInteger();
        System.out.println(A.add(B).toString());
    }
}