package day2;

import java.util.*;

class Solution1 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌 체육복을 가져온 학생이 도난당한 경우
        // = reserve 안에 있는 번호가 lost 안에 번호와 같을 수 있다
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    lost[i] = -1;
                }
            }
        }

        //체육복을 빌려주는 상황에서 코드 작성(도난당한 학생들에게)
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    lost[i] = -1;
                }
            }
        }
        return answer;
    }
}