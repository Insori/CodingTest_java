package day4;

import java.util.*;

//논문 편 수만큼 인용된 논문 횟수가 있으면 H-index, 없으면 1씩 감소하며 비교하며 최대값 구하기

class Solution1 {
    public int solution(int[] citations) {
        int answer = 0;

//         //오름차순 정렬
//         Arrays.sort(citations);

//         for(int i=0; i<citations.length; i++) { //논문의 횟수만큼
//             //가장 큰 h-index는 논문 편수 만큼일테니까 첫 번째에서 맞지 않았다면 1씩 줄여서 비교
//             int h = citations.length-i;
//             if(citations[i] >= h) {
//                 answer = h;
//                 break;
//             }
//         }

        //Math 활용
        Arrays.sort(citations);
        for(int i=0; i<citations.length; i++) {
            int small = Math.min(citations[i], citations.length-i);
            if(small >= answer)
                answer = Math.max(answer, small);
            else
                break;
        }

        return answer;
    }
}
