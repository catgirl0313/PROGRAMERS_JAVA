package com.example.programers_java.Programers_Java.level1._09_Hide_PhoneNumber;

/**
 * 핸드폰 번호 가리기
 * 문제 설명
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * phone_number는 길이 4 이상, 20이하인 문자열입니다.
 * 입출력 예
 * phone_number	return
 * "01033334444"	"*******4444"
 * "027778888"	"*****8888"
 */
public class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for(int i = 0; i < phone_number.length()-4; i++){
            answer= answer + "*";
        }
        System.out.println(answer);
        phone_number = phone_number.substring(phone_number.length()-4);
//        phone_number = phone_number.substring(7); //자리수 안 맞으면 달라질 수 있으므로 뒤에서 자르기.
        System.out.println(phone_number);
        answer = answer + phone_number;
        System.out.println(answer);
//        answer = phone_number;
//
//        [0]~[-4] * 로 리턴, [-4] ~ [-1]은
        return answer;
    }


    public static void main(String[] args){
        Solution s = new Solution();
        String phone_number = "01033334444";
        String answer = s.solution(phone_number);

    }
}
