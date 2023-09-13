// 프로그래머스 132267번 문제 - 콜라 문제
// 상태: 해결(참조: https://isshosng.tistory.com/174?category=1033272)

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        for(int i = score.length; i >= m; i -= m){
            answer += m * score[i - m];
        }
        return answer;
    }
}
