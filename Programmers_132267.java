// 프로그래머스 132267번 문제 - 콜라 문제
// 상태: 미해결

class Solution {
    public int solution(int a, int b, int n) {
        // 1. n  게의 병 내에서 a를 주면 b를 받을 수 있는 병의 수
        // 2. 20 / 2 = 10
        // 3. 10 / 2 = 5
        // 4. 5 / 2 = 2
        // 5. 2/ 2 = 1
        // n / 2 = n_new
        int nNew = 0;
        int sum = 0;
        while(n >= b){
            nNew = n/a;
            sum += nNew;
            n = nNew;
        }
        sum = sum + b;
        return sum;
    }
}
