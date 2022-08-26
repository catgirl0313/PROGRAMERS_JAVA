package com.example.programers_java.Programers_Java.level1._03_Get_Middle_String;


/**
 * 가운데 글자 가져오기
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 *
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 */

public class Solution {

    public String solution(String s) {
//        String answer = "";
        if(s.length() % 2 ==0){
            return s.substring(s.length()/2-1, s.length()/2+1);
        }else{

            return s.substring(s.length()/2, s.length()/2+1);
        }

    }


    public static void main(String[] args) {
        Solution c = new Solution();
        String answer = c.solution("asdfg");
        System.out.println(answer);


    }
}

//
//
//return s.substring((s.length()-1) / 2, s.length()/2 + 1);
