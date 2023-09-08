// 프로그래머스 132267번 문제 - 콜라 문제
// 상태: 해결 (참조: https://yongku.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%BD%9C%EB%9D%BC-%EB%AC%B8%EC%A0%9C-%EC%9E%90%EB%B0%94JAVA)

class Solution {
    public int solution(int a, int b, int n) {
        // 1. 합계를 계산하여 저장할 변수 선언
        int sum = 0;
        // 2. a보다 크면 연산을 수행
        while(n >= a){
                // 3. n*b/a 만큼의 연산을 반복하여 결과를 합산
                sum += (n * b)/a;
                // 4. 다음 n값은 n/a의 나머지를 더한 값
                n = (n * b)/a + n%a;
            }
        // 5. 결과값 반환
        return sum;
    }
}
