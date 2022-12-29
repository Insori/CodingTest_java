package day4;

import java.util.*;

class Solution3 {
    public long solution(int n, int[] times) {
        long answer = 0;
        Arrays.sort(times);
        long start = 1;
        long end = (long)times[times.length-1]*n;
        while(start <= end) {
            long sum = 0;
            long mid = (start+end)/2;
            for(int time : times) {
                sum += mid/time; //심사관이 주어진 시간을 기준으로 했을 때 심사할 수 있는 사람 수
            }
            if(sum >= n) {
                end = mid-1;
                answer = mid;
            } else {
                start = mid+1;
            }
        }

        return answer;
    }
}