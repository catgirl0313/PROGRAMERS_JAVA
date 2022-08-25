package com.example.programers_java.Programers_Java.level1._02_Even_Odd;
// 짝수와 홀수
// 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수(메소드),
// solution을 완성해주세요.

// 1. 정수 num을 받는 파라미터가 있어야 함.
// 2. return 타입은 String.
// 3. 메소드 이름은 solution.

// num : 3, return : "Odd"
// num : 4, return : "Even"
public class Solution {
    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
//
//        if(num%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//        return "";
    }
//다른 방법
//    return num % 2 == 0 ? "Even" : "Odd";

    public static void main(String[] args) {
        Solution s = new Solution();
        String answer = s.solution(3);
        System.out.println(answer);

    }
}
