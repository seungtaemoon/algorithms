// 프로그래머스 12915번 문제 - 문자열 내 마음대로 정렬하기
// 상태: 문제 해결 (참조: https://velog.io/@hi_potato/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%82%B4-%EB%A7%88%EC%9D%8C%EB%8C%80%EB%A1%9C-%EC%A0%95%EB%A0%AC%ED%95%98%EA%B8%B0-JAVA)

import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        // 1. 주어진 배열에 대해 n자리의 글자 순서로 정렬
        // 인덱스 1의 문자가 같으면, 사전순으로 앞선 것이 먼저 온다.

        // 1. 결과를 저장할 배열을 선언한다.
        String[] answer = new String[strings.length];
        String[] res = new String[strings.length];

        // 2. 배열을 순회 하면서 각 단어 앞에 n 번째 글자를 더한 값을 새로운 배열에 넣는다.
        for(int i = 0; i < strings.length; i++){
            answer[i] = strings[i].charAt(n) + strings[i];
        }
        // 3. 배열을 정렬한다(알파벳 순)
        Arrays.sort(answer);

        // 4. 배열을 순회하면서 맨 앞 n번째 글자를 뺀 단어를 새로운 배열에 넣는다.
        for(int i = 0; i < strings.length; i++){
            res[i] = answer[i].substring(1);
            System.out.println(res[i]);
        }
        // 5. 최종 배열을 반환한다. 
        return res;
    }
}
