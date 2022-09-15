public class Main{
    public static void main(String[] args) {
        //Todo: 1~10000중에 i = d(n)인 숫자 제외할 것
        for(int i = 1;i<=10000;i++) {
            boolean member = true;
            for(int n=0;n<=10000;n++) {
                if (i == d(n)) {
                    member = false;
                    break;
                }
            }
            if(member) {
                System.out.println(i);
            }
        }
    }
    public static int d(int n){
        int dn=n;
        while(n>0){
            dn+= n%10;
            n /= 10;
        }
        return dn;
    }
}