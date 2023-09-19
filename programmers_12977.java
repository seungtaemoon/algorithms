// 프로그래머스 42840번 문제 - 모의고사
// 상태: 미해결 (IntelliJ에서 구현 중)

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        // 1. 가능한 모든 경우를 찾아 주어진 숫자 중 3개의 수를 더한다.
        // 2. 그 경우 중에서 소수가 되는 경우를 찾는다.
        // 3. 그 경우의 수를 계산해 리턴한다.
        int count = 0;
        int sumReceived = summer(nums);

    }
    public static int summer(int[] nums){
        int sum = Arrays.stream(nums).sum();
        int sum2 = 0;
        for(int i = 0; i < nums.length; i++){
            sum2 = sum - nums[i];
            System.out.println(sum2);
        }
        return sum2;
    }

}
