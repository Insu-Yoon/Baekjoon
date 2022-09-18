import java.util.*;
//Todo: str을 한글자씩 끊어서 set에 저장, size로 종류 수 저장, for문 돌려서 charAt==itr.next() 비교하고 카운팅, 제일크면 char result에 저장(같으면 '?',크면해당글자)
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        HashSet<Character> set = new HashSet<>();
        str = str.toUpperCase();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        int cnt;
        int max=0;
        char result='0';
        Iterator<Character> itr = set.iterator();
        while(itr.hasNext()){
            cnt=0;
            char c  = itr.next();
            for(int j=0;j<str.length();j++){
                if(c ==str.charAt(j)) cnt++;
            }
            if(cnt==max) result = '?';
            if(cnt>max) {result = c; max=cnt;}
        }
        System.out.println(result);
    }
}