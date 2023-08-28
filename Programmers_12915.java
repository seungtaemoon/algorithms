// 프로그래머스 12915번 문제 - 문자열 내 마음대로 정렬하기
// 상태: 솔루션 개선 필요

import java.util.Arrays;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // 1. 정수 n과 문자열 strings 받기
        // 2. n번째 문자를 기준으로 오름차순 정렬
        // 3. 인덱스 1의 문자열이 같다면, 사전순으로 앞선 문자열이 앞에온다.
        String[] strings = {"abce", "abcd", "cdx"};
//        String[] strings = {"car", "bed", "sun"};
        int n = 2;
        String temp = "";
//        String[] answer = new String[strings.length];
        Arrays.sort(strings);
        for(int i = 0; i < strings.length; i++){
            for(int j = i+1; j < strings.length; j++){
                if(strings[j].charAt(n) < strings[i].charAt(n)){
//                    if( strings[j].charAt(1) == strings[i].charAt(1)){
////                        Arrays.sort(strings);
////                        break;
//                        if(strings[j].charAt(0) < strings[i].charAt(0)) {
//                            temp = strings[i];
//                            strings[i] = strings[j];
//                            strings[j] = temp;
//                        }
//                    }
//                    else{
                        temp = strings[i];
                        strings[i] = strings[j];
                        strings[j] = temp;
//                    }
                }
            }
        }
        for(String mem: strings){
            System.out.println(mem);
        }
    }
}
