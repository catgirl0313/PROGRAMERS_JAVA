package com.example.programers_java.Programers_Java.level1._01_Print_Star;

import java.util.Scanner;
/**
 *  직사각형 별찍기
 *      이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
 *      별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.
 *
 *  제한 조건
 *     - n과 m은 각각 1000 이하인 자연수입니다.
 *///

public class Solution {
    public static void main(String[] args) {
        System.out.println("값을 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0;i<b;i++) {
            for(int j=0;j<a;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
// 결과
//> Task :classes
//        5
//        3
//
//        > Task :Solution.main()
//        *****
//        *****
//        *****
