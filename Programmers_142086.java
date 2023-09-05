// 프로그래머스 142086번 문제 - 가장 가까운 같은 글자
// 상태: 문제 해결

class Solution {
    public int[] solution(String s) {
        // 1. 문자열을 문자로 분리
        String[] chars = s.split("");
        // 2. 답을 저장할 새로운 배열 생성
        int[] answer = new int[chars.length];
        // 3. 중첩 반복문을 통해 분리된 문자 배열 순회
        for(int i = 0; i < chars.length; i++){
            for(int j = i+1; j < chars.length; j++){
                // 4. 두 개의 문자를 비교해 같을 경우 두 값의 위치값 차이를 저장
                if(chars[i].equals(chars[j])){
                    answer[j] = j - i;
                }
            }
            // 5. 만약 배열에 값이 없는 경우 -1로 저장
            if ( answer[i] == 0){
                answer[i] = -1;
            }
        }
        // 6. 결과값 리턴
        return answer;
    }
}
