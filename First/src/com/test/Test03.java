package com.test;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1부터 7사이의 정수 하나를 입력하세요: ");
		int num = sc.nextInt();

//		String[] color = {"red", "orange", "yellow", "green", "blue", "navy", "purple"};

		
		if (num == 1) {
			System.out.println(num + "=>" + "red");
		} else if (num == 2) {
			System.out.println(num + "=>" + "orange");
		} else if (num == 3) {
			System.out.println(num + "=>" + "yellow");
		} else if (num == 4) {
			System.out.println(num + "=>" + "green");
		} else if (num == 5) {
			System.out.println(num + "=>" + "blue");
		} else if (num == 6) {
			System.out.println(num + "=>" + "navy");
		} else if (num == 7) {
			System.out.println(num + "=>" + "purple");
		} else {
			System.out.println("1부터 7사이의 정수가 아닙니다.");
		}

		// recommand
		String color;
		if (num == 1) {
			color = "red";
		} else if (num == 2) {
			color = "orange";
		} else if (num == 3) {
			color = "yellow";
		} else if (num == 4) {
			color = "green";
		} else if (num == 5) {
			color = "blue";
		} else if (num == 6) {
			color = "navy";
		} else if (num == 7) {
			color = "purple";
		} else {
			color = "1부터 7사이의 정수가 아닙니다.";
		}

		System.out.println(num + "=>" + color);
	}

}