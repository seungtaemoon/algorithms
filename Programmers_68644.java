// 프로그래머스 68644번 문제 - 두 개 뽑아서 더하기
// 상태: 문제 해결

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        // 1. 서로 다른 인덱스에 있는 두 수를 뽑는다.
        // 2. 두 수를 더해 배열에 넣는다.
        // 3. 반복해서 가능한 모든 콤비를 찾는다.
        HashSet<Integer> answer = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                answer.add(numbers[i] + numbers[j]);
            }
        }
        int[] res = new int[answer.size()];
        int i = 0;
        for(int ele: answer){
            res[i++] = ele;
        }
        Arrays.sort(res);
        return res;
    }
}
