package day4;

import java.util.*;

class Solution2 {
    public int solution(int[] budgets, int M) {
        int answer = 0;
        int min=0;
        int max = 0;

        Arrays.sort(budgets);

        for(int a : budgets) {
            if(a > max) max = a;
        }

        while(min <= max) {
            int mid = (min+max)/2;
            int sum = 0;
            for(int b : budgets) {
                if(b > mid) sum += mid;
                else sum += b;
            }
            if(sum <= M) {
                min = mid+1;
                answer = mid;
            }
            else
                max = mid-1;
        }

        return answer;
    }
}