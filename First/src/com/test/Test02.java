package com.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// 식1
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("첫번째 정수 입력: ");
//		int num1 = sc.nextInt();
//
//		System.out.print("두번째 정수 입력: ");
//		int num2 = sc.nextInt();
//
//		int sum = 0;
//
//		if (num1 > num2) {
//			// num2부터; num2가 num1보다 작거나같은수가될때까지; num2를 1씩 증가를 반복
//			for (int i = num2; i <= num1; i++) {
//				sum += i;
//			}
//		} else {
//			// num1부터; num1이 num2보다 작거나같은수가될때까지; num1을 1씩 증가를 반복
//			for (int i = num1; i <= num2; i++) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);

		// 식2
		Scanner sc = new Scanner(System.in);

		int sum = 0, max = 0, min = 0;

		System.out.print("숫자1: ");
		int num1 = sc.nextInt();

		System.out.print("숫자2: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}

		for (int i = min; i <= max; i++) {
			System.out.println(i);
			sum += i;
		}

		System.out.print("숫자1 + ... + 숫자2" + " = " + sum);

	}
}
