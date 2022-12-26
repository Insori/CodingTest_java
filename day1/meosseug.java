package day1;

import java.util.Arrays;

class Solution6 {
    public int solution(int[] array, int height) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<array.length; i++) {
            if(height < array[i]) count++;
        }
        answer = count;
        return answer;
        //스트림 방식(필터 사용하기)
        //return (int)Arrays.stream(array).filter(i -> i > height).count();
    }
}
