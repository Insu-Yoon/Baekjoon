import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score){
        int answer = 0;
        Arrays.sort(score);
        
        int index = score.length-1;
        while(true){
            if(index<=0||index-m+1<0) break;
            answer += score[index-m+1] * m;
            index -= m;
        }
        return answer;
    }
}