/* 캐릭터 키우기.
 * 구현해야할것, 캐릭터 3개 (창술사,전사,궁수),캐릭터 정보보기, (캐릭터 정보)경험치 양,(캐릭터 정보) 골드 , 던전,(던전)몬스터,제련소,
 * 몬스터를 사냥해서 일정 경험치와 골드를 얻는다 일정 골드를 모아서 제련소에서 강화를한다.(확률로)
 * 일정 경험치를 먹었을때 레벨업 레벨업을 하면 스킬 포인트를 얻고 스킬을 찍는다.
 *  */
package com.Game;

import java.util.Scanner;

public class Game extends game2{

	public static void main(String[] args) {
		game2 game2=new game2();
			
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("======메뉴화면======");
			System.out.println("1.캐릭터 선택하기");
			System.out.println("2.캐릭터 정보보기 ");
			System.out.println("3.던전 ");
			System.out.println("4. 제련소 ");
			System.out.println("6. 메뉴 선택 ");
		
		
		int a =sc.nextInt();
		switch(a) {
		
		case 1:
			game2.choice();
			break;
		case 2:
			game2.lance();
			break;
		case 3:
			game2.dungeon();
			break;
			
		
		}
		


		}
	}






}







