package com.it.java.ssg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		Scanner sc = new Scanner(System.in);
		System.out.println("명령어를 입력하세요)");
		String command = sc.next();
		System.out.println("입력된 명령어 :" + command);
		int num = sc.nextInt();
		System.out.println("입력된 명령어 :" + num);
		sc.close();
		System.out.println("== 프로그램 끝 ==");

	}
}
