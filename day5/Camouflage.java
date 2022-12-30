package day5;

import java.util.*;

class Solution4 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();

        for(int i=0; i<clothes.length; i++) {
            if(hm.get(clothes[i][1]) == null) {
                hm.put(clothes[i][1], 1);
            } else {
                hm.put(clothes[i][1], hm.get(clothes[i][1])+1);
            }
        }
        //hm에 들어있는 옷의 종류 당 개수를 곱하면 옷 조합의 경우의 수를 구할 수 있다.
        for(String a : hm.keySet()) {
            int count = hm.get(a);
            answer = answer * (count + 1);
        }

        answer = answer -1;
        return answer;
    }
}