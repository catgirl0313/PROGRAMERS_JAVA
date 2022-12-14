package com.example.programers_java.Programers_Java.level1._17_Basic_String;

/**
 * 문자열 다루기 기본
 * 문제 설명
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수,
 * solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고
 * "1234"라면 True를 리턴하면 됩니다.
 *
 * 제한 사항
 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 * s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
 * 입출력 예
 * s	return
 * "a234"	false
 * "1234"	true
 */
public class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6) {

            try {
                Integer.parseInt(s);
                answer = true;
            } catch (NumberFormatException e) {
                answer = false;
            }
        }

        return answer;
    }


    public static void main(String[] args){
        String s = "a234";

        Solution c = new Solution();
        boolean answer = c.solution(s);
        System.out.println("결과는?:" + answer);

    }
}

//    public boolean solution(String s) {
//        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
//        return false;
////    }
//      String.matches()로 특정 패턴의 문자열을 포함하는지 확인 가능
//      문자열에 정규표현식이 일치하는지를 boolean으로 리턴.
//
