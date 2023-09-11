// 프로그래머스 132267번 문제 - 콜라 문제
// 상태: 미해결

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        // 1. 배열을 정렬
        Arrays.sort(score);
        // 2. 새로운 배열을 생성할 가변형 배열 선언
        ArrayList<Integer> arr = new ArrayList<>();
        // 3. 기존 배열을 순회
        for(int i = score.length-1; i > 0; i--){
            // 4. 배열의 크기가 m-1보다 큰 한 순회 계속하면서 score배열의 가장 끝 부분부터 가변형 배열에 추가
            if (i >= m-1){
                arr.add(score[i]);
                // 5. 배열의 출력
                System.out.println(score[i]);
            }
            // 6. 배열의 크기가 m-1보다 작은 경우 반복문 탈출
            else{
                break;
            }
        }
        // 7. 배열의 최소 값과 배열의 크기를 곱하기
        int res = Collections.min(arr) * arr.size();
        return res;
    }
}
