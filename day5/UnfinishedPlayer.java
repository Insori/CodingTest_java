package day5;

import java.util.*;

class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for(String p : participant) {
            hm.put(p, hm.getOrDefault(p, 0)+1);
        }
        for(String c : completion) {
            hm.put(c, hm.get(c)-1);
        }
        for(String key : hm.keySet()) {
            if(hm.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;

        //Hash 안 쓰는 방법
//         Arrays.sort(participant);
//         Arrays.sort(completion);
//         for(int i=0; i<completion.length; i++) {
//             if(participant[i].equals(completion[i])) {
//                 continue;
//             } else {
//                 return participant[i];
//             }
//         }
//         return participant[participant.length-1];
    }
}