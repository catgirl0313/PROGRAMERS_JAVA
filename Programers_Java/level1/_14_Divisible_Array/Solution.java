package com.example.programers_java.Programers_Java.level1._14_Divisible_Array;

import java.util.Arrays;

/**
 * 나누어 떨어지는 숫자 배열
 * 문제 설명
 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
 * divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
 *
 * 제한사항
 * arr은 자연수를 담은 배열입니다.
 * 정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
 * divisor는 자연수입니다.
 * array는 길이 1 이상인 배열입니다.
 * 입출력 예
 * arr	divisor	return
 * [5, 9, 7, 10]	5	[5, 10]
 * [2, 36, 1, 3]	1	[1, 2, 3, 36]
 * [3,2,6]	10	[-1]
 * 입출력 예 설명
 */
public class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        //나눠떨어지는 숫자 개수
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }

        //배열 크기 선언
        int[] answer = new int[count];
        //없으면 -1 retrun
        if(count == 0){
            return answer = new int[]{-1};
        }


        //배열 크기만큼 반복하여 배열 세팅
        int a = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%divisor==0){
                answer[a]=arr[i];
                a++;
            }
        }
        System.out.println("5로 나어지는 숫자 최종 배열");
        System.out.println(Arrays.toString(answer));

        //오름차순 정렬
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length - 1 - i; j++) {
                if (answer[j] > answer[j + 1]) {
                    int tem = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = tem;
                }
            }
        }
        System.out.println("오름차순 정렬하기");
        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public static void main(String[] args){
        int[] arr = {5, 9, 7, 10};
        int b = 5;
        Solution s = new Solution();
        int[] answer = s.solution(arr, b);
        System.out.println("최종 답:" + Arrays.toString(answer));

    }

}
