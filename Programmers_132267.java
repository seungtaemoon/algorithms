// 프로그래머스 132267번 문제 - 콜라 문제
// 상태: 해결 (참조: https://yongku.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%BD%9C%EB%9D%BC-%EB%AC%B8%EC%A0%9C-%EC%9E%90%EB%B0%94JAVA)

class Solution {
    public int solution(int a, int b, int n) {
        int sum = 0;
        while(true){
            //1. 가지고 있는 빈 병 수가 a개 보다 미만이면 return한다.
            if(n < a){
                break;
            }

            // 2. 가지고 있는 빈 병 수가 a개 보다 크면 시작
            sum += (n/a) * b;
            int remain = n % a;

            n = (n/a) * b + remain;
        }
        return sum;
    }
}
