package com.example.programers_java.Programers_Java.level1._06_Add_Missing_numbers;

/**
 * 없는 숫자 더하기
 * 문제 설명
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ numbers의 길이 ≤ 9
 * 0 ≤ numbers의 모든 원소 ≤ 9
 * numbers의 모든 원소는 서로 다릅니다.
 */
public class Solution {

    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        int totalSum = 0;
        for (int k = 0; k < 10; k++) {
            totalSum += k;
        }
        System.out.println(totalSum);

        answer = totalSum - sum;
        System.out.println(answer);

        return answer;
    }


    public static void main(String[] args) {
//        System.out.println("값을 입력해주세요");
//        Scanner scanner = new Scanner(System.in);
//        String numbers = scanner.nextLine();//int a = sc.nextInt();
//        scanner.close();
        Solution s = new Solution();
        int[] numbers = {1, 2, 3, 4, 5, 7, 8};
        int answer = s.solution(numbers);

    }

}

//탐나는 답안?
//class Solution {
//    public int solution(int[] numbers) {
//        int sum = 45;
//        for (int i : numbers) {
//            sum -= i;
//        }
//        return sum;
//    }
//}
