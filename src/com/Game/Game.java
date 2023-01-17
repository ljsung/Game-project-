package com.Game;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		

	
	/* 캐릭터 키우기.
	 * 구현해야할것, 캐릭터 3개 (전사,법사,궁수),캐릭터 정보보기, (캐릭터 정보)경험치 양,(캐릭터 정보) 골드 , 던전,(던전)몬스터,제련소,
	 * 몬스터를 사냥해서 일정 경험치와 골드를 얻는다 일정 골드를 모아서 제련소에서 강화를한다.(확률로)
	 * 일정 경험치를 먹었을때 레벨업 레벨업을 하면 스킬 포인트를 얻고 스킬을 찍는다.
	 *  */
	
	Scanner sc = new Scanner(System.in);
	System.out.println("★캐릭터 키우기★");

	while(true) {
		System.out.println("======메뉴화면======");
		System.out.println("0.캐릭터 선택하기 ");
		System.out.println("1.캐릭터 정보보기 ");
		System.out.println("2.던전 ");
		System.out.println("3. 제련소 ");
		System.out.println("5. 메뉴 선택 ");
		System.out.println("9. 게임 종료");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		switch(a) {
			case 0 :
				System.out.println("캐릭터를 선택해주세요");
				
		switch(a) {
			case 1 :
				System.out.println("1.전사");
			case 2 :
				System.out.println("2.궁수");
			case 3 :
				System.out.println("3.마법사");
		}
			case 1 : 
				
			break;
			case 2 : 
			break;
			case 3 :
				
				return;
			case 5 :
				
			case 9 :
			default : 
				
				break;

}
	}
	}
}
