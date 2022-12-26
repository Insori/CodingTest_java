package day1;

import java.util.*;

class Solution11 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);

        return numbers[numbers.length-1]*numbers[numbers.length-2];
    }
}