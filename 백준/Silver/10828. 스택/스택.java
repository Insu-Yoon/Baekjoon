import java.io.*;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String temp="";
        for(int i=0;i<n;i++){
            temp = br.readLine();
            if(temp.contains("push")) {
                int num = Integer.parseInt(temp.split(" ")[1]);
                list.add(num);
            }
            else {
                switch (temp) {
                    case "top" :
                        if(list.size()>0) bw.write(list.get(list.size() - 1)+"\n");
                        else bw.write("-1\n");
                    break;
                    case "pop" :
                        if(list.size()>0) bw.write(list.remove(list.size()-1)+"\n");
                        else bw.write("-1\n");
                        break;
                    case "size" : bw.write(list.size()+"\n");
                        break;
                    default:
                        if(list.size()==0) bw.write("1\n");
                        else bw.write("0\n");
                        break;
                }
            }
        }
        br.close();
        bw.close();
    }
}

