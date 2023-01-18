package com.Game;

import java.util.Scanner;

public class game2 extends Job{
	

		
	public void choice() {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("★캐릭터 키우기★");
		System.out.println("직업을 선택해 주세요");
		System.out.println("1.창술사\n2.전사\n3.궁수");

		int a = sc.nextInt();
	
		switch(a) {

		case 1 :
			System.out.println("창술사 선택.");
			break;
		case 2 :
			System.out.println("전사 선택.");
			break;
		case 3 : 
			System.out.println("궁수 선택.");
			break;
			
		default :
			break;
		}
	}
	
}


