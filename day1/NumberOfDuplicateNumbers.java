package day1;

class Solution5 {
    public int solution(int[] array, int n) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(n == array[i]) count++;
        }
        answer = count;
        return answer;
    }
}