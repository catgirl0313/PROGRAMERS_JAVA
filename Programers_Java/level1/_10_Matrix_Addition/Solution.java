package com.example.programers_java.Programers_Java.level1._10_Matrix_Addition;
/**
 * 행렬의 덧셈
 * 문제 설명
 * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
 * 입출력 예
 * arr1	arr2	return
 * [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
 * [[1],[2]]	[[3],[4]]	[[4],[6]]
 */

import java.util.Arrays;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        for(int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++) {
               arr1[i][j] += arr2[i][j]; // answer = arr1 + arr2 안됨. arr1에 arr2누적필요.
            }
        }
        answer = arr1;
        System.out.println(Arrays.deepToString(answer)); //2차원 배열 출력은 Array.deepToString();


        return answer; //answer 없애고 arr1로 return 해도 됨.
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] answer = s.solution(arr1, arr2);
    }


}




