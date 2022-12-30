package day5;

import java.util.*;

class Solution2 {
    public int solution(int[] nums) {
        int answer = 0;
        int num = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        if(num >= set.size()) {
            answer = set.size();
        } else {
            answer = num;
        }

        return answer;

        //HashSet 안 쓰는 방법
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        for(int i=0; i<nums.length; i++) {
//            if(!arrayList.contains(nums[i])) {
//                arrayList.add(nums[i]);
//                answer++;
//            }
//        }
//        int max = nums.length/2;
//        if(max < answer) {
//            return max;
//        } else {
//            return answer;
//        }
    }
}
