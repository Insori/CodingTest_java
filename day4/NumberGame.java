package day4;

import java.util.*;

class Solution4 {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int index = B.length-1;

        for(int i = A.length-1; i>=0; i--) {
            if(A[i] < B[index]) {
                answer++;
                index--;
            }
        }
        return answer;

        //방법 2
//         Arrays.sort(B);

//         for(int i=0; i<A.length; i++) {
//             for(int j=0; j<B.length; j++) {
//                 if(A[i] < B[j]) {
//                     answer++;
//                     B[j] = 0;
//                     break;
//                 }
//             }
//         }
    }
}