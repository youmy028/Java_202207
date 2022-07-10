package com.it.java.ssg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		Scanner sc = new Scanner(System.in);
		int lastArticleId = 0; 
		while (true) {
			System.out.println("명령어를 입력하세요)");
			String command = sc.nextLine();
			command = command.trim();
			if (command.length() == 0) {
				continue;
			}

			if (command.equals("exit")) {
				break;
			}
			if (command.equals("article write")) {
				int id = lastArticleId+1;
				lastArticleId = id;
				System.out.printf("제목: ");
				String 제목 = sc.nextLine();
				System.out.printf("내용: ");
				String 내용 = sc.nextLine();
				System.out.printf("%d번째글이 생성되었습니다.\n", id);
			} else if (command.equals("article list")) {
				System.out.println("게시글이 없습니다.");
			} else {
				System.out.printf("%s존재하지 않는 명령어입니다.\n", command);
			}
		}
		sc.close();
		System.out.println("== 프로그램 끝 ==");

	}
}