import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int len = tangerine.length;
       
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.get(tangerine[i])==null) map.put(tangerine[i],1);
            else map.put(tangerine[i],map.get(tangerine[i])+1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (Integer value : map.values()) {
            list.add(value);
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        int sum = 0;        
        int index = 0;
        while(sum<k){
            sum+=list.get(index);
            index++;
            answer++;
        }
        
        return answer;
    }
}