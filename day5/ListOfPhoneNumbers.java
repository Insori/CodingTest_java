package day5;

import java.util.*;

class Solution3 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Map<String, Integer> hm = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++)
            hm.put(phone_book[i], i);

        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book[i].length(); j++)
                if(hm.containsKey(phone_book[i].substring(0,j)))
                    return false;
        }
        return true;

        //다른 방법
        // Arrays.sort(phone_book);
        // for(int i=0; i<phone_book.length-1; i++) {
        //     if(phone_book[i+1].startsWith(phone_book[i]))
        //         answer = false;
        // }
        // return answer;
    }
}