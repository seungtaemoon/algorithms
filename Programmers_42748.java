// 프로그래머스 42748번 문제 - K번째수
// 상태: 문제 해결

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // 1. 마지막 결과 저장을 위한 배열 선언
        int[] finalArr = new int[commands.length];
        // 2. commands 배열의 크기 만큼 for문으로 순회
        for(int i = 0; i < commands.length; i++){
            // 3. 정렬된 배열을 저장할 가변길이의 배열 선언
            ArrayList<Integer> res = new ArrayList<>();
            // 4. commands 배열에 주어진 array배열의 첫 길이 부터 끝까지 순회하는 중첩반복문 활용
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++){
                // 5. 위 범위내에서 해당하는 array 배열값을 res에 저장
                res.add(array[j]);
            }
            // 6. res 배열 정렬
            Collections.sort(res);
            // 7. 정렬된 값에서 k번째 값을 찾아 최종 배열에 저장
            finalArr[i] = res.get(commands[i][2] - 1);
        }
        // 8. 최종 배열값 리턴
        return finalArr;
    }
}
