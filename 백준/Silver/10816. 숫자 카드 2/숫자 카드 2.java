import java.io.*;
import java.util.*;
	
public class Main {
	static StringTokenizer st;
	static int n;
	static int m;
	static HashMap<Integer, Integer> map;
	
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	n = Integer.parseInt(br.readLine());
    	map = new HashMap<>();
    	StringBuffer sb = new StringBuffer();
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < n; i++) {
    		int num = Integer.parseInt(st.nextToken());
    		
    		if(!map.containsKey(num)) {
    			map.put(num, 1);
    		}
    		else {
    			map.put(num, map.get(num) + 1);
    		}
    	}
    	
     	m = Integer.parseInt(br.readLine());    		
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < m; i++) {
    		int num = Integer.parseInt(st.nextToken());
    		
    		if(map.containsKey(num)) {
    			sb.append(map.get(num) + " ");
    		}
    		else {
    			sb.append(0 + " ");
    		}
    	}

    	System.out.println(sb.toString());
    }       
}