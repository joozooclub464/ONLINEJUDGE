#잘라서 배열로 저장하기
class Solution {
    public String[] solution(String my_str, int n) {
        int size = (int)Math.ceil((double)my_str.length()/n);
        String[] answer = new String[size];
        for(int i=0; i<answer.length; i++) {
            int start = i*n;
            int end = Math.min(start+n, my_str.length());
            answer[i] = my_str.substring(start, end);   
        } 
        return answer;
    }
}
