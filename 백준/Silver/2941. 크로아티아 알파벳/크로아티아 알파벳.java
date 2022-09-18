import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] chars = new char[str.length()];
        int cnt=0;
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        for(int i=0;i<str.length();i++){
            if(i<str.length()-2){
                if((chars[i]=='d')&&(chars[i+1]=='z')&&(chars[i+2]=='=')) cnt-=1;
            }
            if(i>str.length()-2){} else {
                if((chars[i]=='c'&&chars[i+1]=='=')||(chars[i]=='c'&&chars[i+1]=='-')||(chars[i]=='d'&&chars[i+1]=='-')||(chars[i]=='l'&&chars[i+1]=='j')||(chars[i]=='n'&&chars[i+1]=='j')||(chars[i]=='s'&&chars[i+1]=='=')||(chars[i]=='z'&&chars[i+1]=='=')) cnt-=1;
            }
            cnt+=1;
        }
        System.out.println(cnt);
    }
}