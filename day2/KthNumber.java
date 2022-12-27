package day2;

import java.util.*;

class Solution4 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int k = commands[i][2]-1;
            System.out.print(start);

            int[] tmp = Arrays.copyOfRange(array, start, end);
            Arrays.sort(tmp);
            answer[i]=tmp[k];
        }
        return answer;
    }
}