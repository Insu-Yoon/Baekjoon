class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] powerArray = new int[number+1];
        boolean[] endCheck = new boolean[number+1];
        for(int i=1;i<=number;i++){
            for(int j=1;j<=number/i;j++){
                if(endCheck[i*j]) continue;
                powerArray[i*j]++;
                if(powerArray[i*j]>limit){
                    powerArray[i*j] = power;
                    endCheck[i*j] = true;
                }
            }
        }
        for(int i=1;i<=number;i++) answer += powerArray[i];
        return answer;
    }
}