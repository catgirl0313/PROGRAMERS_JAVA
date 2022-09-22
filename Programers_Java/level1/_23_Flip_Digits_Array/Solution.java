package com.example.programers_java.Programers_Java.level1._23_Flip_Digits_Array;

import java.util.Arrays;

/**
 * 자연수 뒤집어 배열로 만들기
 * 문제 설명
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 12345 	[5,4,3,2,1]
 */
public class Solution {
    public int[] solution(long n) {
        int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
//        long[] answer = new long[n];
        //{}; <-선언만할 것이 아니라, long[n] 배열 크기를 꼭 정해줘야 index out of bounds exception 안뜸


//        int length = (int)(Math.log10(n)+1);

        for(int i = 0; i < length ; i++){
            answer[i] += (n % 10);
            n/=10;
        }
        System.out.println(answer);

        return answer;
    }


    public static void main(String[] args){
        Solution c = new Solution();
        long n = 12345;

        int[] answer = c.solution(n);
        System.out.println(Arrays.toString(answer));

    }
}
