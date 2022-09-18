import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int group=0;
        for(int i=0;i<num;i++){
            String str = input.next();
            char[] chars = new char[str.length()];
            for(int j=0;j<str.length();j++){
                chars[j]=str.charAt(j);
            }
            boolean once;
            boolean check;
            boolean result = false;
            for(int j=0;j<str.length();j++){
                once = false;
                check = false;
                for(int k=0;k<str.length();k++) {
                    if (chars[j]==chars[k]) once = true;
                    if (once) {
                        if (chars[j] != chars[k]) check =true;
                    }
                    if(check){
                        if(chars[j]==chars[k]) once = false;
                    }
                    if(check&&!once) result=true;
                }
            }
           if(result) group-=1;
           group+=1;
        }
        System.out.println(group);
    }
}
