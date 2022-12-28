package day3;

import java.util.*;

class Solution1 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];

        for(int i=0; i<numbers.length; i++) {
            str[i] = ""+numbers[i]; //큰 따옴표로 문자열 강제 변환
        }

        Arrays.sort(str, (s1, s2)->(s2+s1).compareTo(s1+s2));

        //^ 다른 방법 - 효율성 떨어짐
        // Arryas.sort(str, new Comparetor<String>() {
        //     public int compare(String s1, String s2) {
        //         return (s2+s1).compareTo(s1+s2);
        //     }
        // });

//         for(int i=0; i<numbers.length-1; i++) {
//             for(int j=i+1; j<numbers.length; j++) {
//                 String s1 = str[i];
//                 String s2 = str[j];

//                 if((s1 + s2).compareTo(s2+s1) < 0)  {   //어떤 수가 더 큰지 배교
//                     str[i] = str[j];
//                     str[j] = s1;
//                 }
//             }
//         }

        for(String s : str) {
            answer += s;
        }

        if(answer.charAt(0) == '0')
            return "0";

        return answer;
    }
}