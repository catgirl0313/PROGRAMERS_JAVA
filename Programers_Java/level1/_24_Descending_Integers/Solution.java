package com.example.programers_java.Programers_Java.level1._24_Descending_Integers;

import java.util.Arrays;

/**
 * 정수 내림차순으로 배치하기
 * 문제 설명
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 * 입출력 예
 * n	return
 * 118372	873211
 */
public class Solution {

    public long solution(long n) {
        String answer = "";

        String[] num = String.valueOf(n).split(""); //split으로 잘라서 문자열로
//        String str = Long.toString(n);
        System.out.println(Arrays.toString(num));
        Arrays.sort(num); // 정렬(기본 오름차순)
        for(int i = num.length -1; i>=0; i--){ //내림차순 정렬
            answer += num[i];
        }

        return Long.parseLong(answer);  // Long으로 변환


    }

    public static void main(String[] args){
        Solution c = new Solution();
        long n = 118372;

        long answer = c.solution(n);
        System.out.println(answer);

    }
}
