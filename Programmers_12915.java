// 프로그래머스 12915번 문제 - 문자열 내 마음대로 정렬하기
// 상태: 솔루션 개선 필요

import java.util.Arrays;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Solution {
    public String[] solution(String[] strings, int n) {
        // 1. 정수 n과 문자열 strings 받기
        // 2. n번째 문자를 기준으로 오름차순 정렬
        // 3. 인덱스 1의 문자열이 같다면, 사전순으로 앞선 문자열이 앞에온다.
        String temp = "";
        char[] characters = new char[strings.length];
        for(int i = 0; i < strings.length; i++){
            characters[i] = strings[i].charAt(n);
        }
        Arrays.sort(characters);
        for(char mem: characters){
            System.out.println(mem);
        }
        for(int i = 0; i < strings.length; i++){
            if(characters[i] == strings[i].charAt(n)){
                for(int j = 0; j < strings.length; j++){
                    if (strings[i].charAt(1) == strings[j].charAt(1)){
                        Arrays.sort(strings);
                        break;
                    }
                    else if (strings[i].charAt(1) > strings[j].charAt(1)){
                        temp = strings[j];
                        strings[j] = strings[i];
                        strings[i] = temp;
                    }
                }
            }
        }
        return strings;
    }
}
