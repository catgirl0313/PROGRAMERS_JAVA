package com.example.programers_java.Programers_Java.level1._26_Remove_Smallest;

import java.util.Arrays;

/**
 * 제일 작은 수 제거하기
 * 문제 설명
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 *
 * 제한 조건
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 * 입출력 예
 * arr	return
 * [4,3,2,1]	[4,3,2]
 * [10]	[-1]
 */
public class Solution {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int j =0;
        Arrays.sort(arr);

        if(arr.length <= 1){
            return new int[]{-1};
        }else{
            for(int i = arr.length -1; i>0; i--){ //내림차순 정렬
                answer[j] = arr[i];
                j++;
            }return answer;
        }
    }
    //-------------작동은 하나, 너무 느려서 테스트 통과가 안됨----------------
    //프로그래머스... 문제의도가 다른 듯함. 2341 입력시 234가 나와야하는데, 정렬 후 마지막 제외시키면 432가 나오므로..?

    public static void main(String[] args) {
        Solution c = new Solution();
        int[] arr = {4, 3, 2, 1};

        int[] answer = c.solution(arr);
        System.out.println(Arrays.toString(answer));

    }
}