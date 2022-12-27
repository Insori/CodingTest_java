package day2;

class Solution2 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int position = 1;
        int i = 0;

        while(position <= n) {
            if(i < stations.length && stations[i]-w <= position) {
                position = stations[i] + w + 1;
                i++;
            } else {
                //기지국을 설치해보는 코드
                answer += 1;
                position += w + w + 1;
            }
        }
        return answer;
    }
}