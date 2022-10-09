class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] RCJA = new int[4];
        for(int i=0;i<survey.length;i++){
            switch(survey[i]){
                case "RT": RCJA[0] += (choices[i]-4);
                    break;
                case "CF": RCJA[1] += (choices[i]-4);
                    break;
                case "JM": RCJA[2] += (choices[i]-4);
                    break;
                case "AN": RCJA[3] += (choices[i]-4);
                    break;
                case "TR": RCJA[0] -= (choices[i]-4);
                    break;
                case "FC": RCJA[1] -= (choices[i]-4);
                    break;
                case "MJ": RCJA[2] -= (choices[i]-4);
                    break;
                case "NA": RCJA[3] -= (choices[i]-4);
                    break;
                default:
                    break;
            }
        }
        char[] pos = new char[]{'T','F','M','N'};
        char[] els = new char[]{'R','C','J','A'};
        for(int i=0;i<RCJA.length;i++){
            if(RCJA[i]>0) answer+=pos[i];
            else answer+=els[i];
        }
        return answer;
    }
}