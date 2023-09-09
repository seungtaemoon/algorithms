// 프로그래머스 12901번 문제 - 2016년
// 상태: 해결 

import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        // 1. LocalDate 라이브러리 활용하여 현재 시간값 얻기
        LocalDate myObj = LocalDate.of(2016, a, b);
        // 2. 시간 값을 문자열로 변환
        String date = String.valueOf(myObj);
        // 3. 변환된 문자열 시간 값을 활용해 LocalDate.getDayofWeek()메서드 이용하여 날짜값 얻기
        DayOfWeek dayName = LocalDate.parse(date).getDayOfWeek();
        // 4. 날짜값을 문자열로 변환
        String day = String.valueOf(dayName);
        // 5. 문자열 값의 첫 3문자열만 반환
        return day.substring(0, 3);
    }
}
