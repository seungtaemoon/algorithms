// 프로그래머스 42840번 문제 - 모의고사
// 상태: 미해결(참조: https://sas-study.tistory.com/240)

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answer) {
                int[] patternOne = {1, 2, 3, 4, 5};
        int[] patternTwo = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] patternThree = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];
        for(int i = 0; i < answer.length; i++){
            if( answer[i] == patternOne[i% patternOne.length) {
                count[0]++;
            }
            if( answer[i] == patternTwo[i% patternTwo.length]) {
                count[1]++;
            }
            if( answer[i] == patternThree[i% patternThree.length]) {
                count[2]++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        if (count[0] == max){
            arr.add(1);
        }
        if (count[1] == max){
            arr.add(2);
        }
        if (count[2] == max){
            arr.add(3);
        }
        int[] finalArr = new int[arr.size()];
        for(int j = 0; j < arr.size(); j++){
            finalArr[j] = arr.get(j);
        }
        return finalArr;
    }
}
