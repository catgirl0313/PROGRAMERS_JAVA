package com.example.programers_java.Programers_Java.level1._11_Spaced_Numbers;

import java.util.Arrays;

/**
 * x만큼 간격이 있는 n개의 숫자
 * 문제 설명
 * 함수 solution은 정수 x와 자연수 n을 입력 받아,
 * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 -10000000 이상, 10000000 이하인 정수입니다.
 * n은 1000 이하인 자연수입니다.
 * 입출력 예
 * x	n	answer
 * 2	5	[2,4,6,8,10]
 * 4	3	[4,8,12]
 * -4	2	[-4, -8]
 */
public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        //{}; <-선언만할 것이 아니라, long[n] 배열 크기를 꼭 정해줘야 index out of bounds exception 안뜸

        for(int i = 0; i < answer.length; i++){
            answer[i] = (long) x * (i+1); // 타입 (long) 변환 하지 않으면 프로그래머스 기준 테스트 2개 실패함
        }

        System.out.println(Arrays.toString(answer)); //배열 출력
        return answer;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        Solution s = new Solution();
        long[] answer = s.solution(x, n);
    }

}

//        answer[0] = x;
//        for(int i = 1; i < n; i++){
//            answer[i] = x * (i+1); //
//        }
