// 프로그래머스 42840번 문제 - 모의고사
// 상태: 미해결

import java.util.*;

class Solution {
    public int[] solution(int[] answer) {
        ArrayList<Integer> res1 = new ArrayList<>();
        ArrayList<Integer> res2 = new ArrayList<>();
        ArrayList<Integer> res3 = new ArrayList<>();
        int i = 0;
        int[] count = {0, 0, 0};
        while(i <= answer.length){
            if(i+1 <= answer.length){
                res1.add(i + 1);
//                if(res1.get(i) == answer[i]){
//                    count[0]++;
//                }
            }
            if(i != 2 && i > 0){
                res2.add(2);
                res2.add(i);
//                if(res2.get(i) == answer[i]){
//                    count[1]++;
//                }
            }
            if(i == 0){
                res3.add(3);
                res3.add(3);
//                if(res3.get(i) == answer[i]){
//                    count[2]++;
//                }
            }
            if(i != 3 && i > 0){
                res3.add(i);
                res3.add(i);
//                if(res3.get(i) == answer[i]){
//                    count[2]++;
//                }
            }
            i++;
        }
        int j = 0;
        for(int ele: answer){
            if(ele == res1.get(j)){
                count[0]++;
            }
            if(ele == res2.get(j)){
                count[1]++;

            }
            if(ele == res3.get(j)){
                count[2]++;
            }
            j++;
        }
//        Arrays.stream(count).forEach(System.out::println);
        List<Integer> numbers = List.of(count[0], count[1], count[2]);
        int max = Collections.max(numbers);
        ArrayList<Integer> finalArr = new ArrayList<>();
        if (numbers.get(0) == max){
            finalArr.add(1);
        }
        if (numbers.get(1) == max){
            finalArr.add(2);
        }
        if (numbers.get(2) == max){
            finalArr.add(3);
        }
        int[] realFinal = finalArr.stream()
                .mapToInt(k -> k)
                .toArray();
        return realFinal;
    }
}
