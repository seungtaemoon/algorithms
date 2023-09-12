// 프로그래머스 132267번 문제 - 콜라 문제
// 상태: 미해결

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        Integer res[] = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(res, Collections.reverseOrder());
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < res.length; i++){
            if (res.length % m < m){
                if (i < m){
                    arr.add(res[i]);
                    System.out.println(arr.get(i));
                }
                else{
                    break;
                }
            }
            else{
                
            }
        }
        return arr;
    }
}
