package day5;

class Solution5 {
    int answer;
    public int solution(int n) {
        answer = 0;
        dfs(0,0,n);
        return answer;
    }
    public void dfs(int open, int close, int n) {
        if(open > n || close > n || close > open)
            return;
        if(open == n && close == n) {
            answer++;
            return;
        }
        dfs(open+1, close, n);
        dfs(open, close+1, n);
    }
}