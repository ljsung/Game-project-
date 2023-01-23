/* 캐릭터 키우기.
 * 구현해야할것, 캐릭터 3개 (창술사,전사,궁수),캐릭터 정보보기, (캐릭터 정보)경험치 양,(캐릭터 정보) 골드 , 던전,(던전)몬스터,제련소,
 * 몬스터를 사냥해서 일정 경험치와 골드를 얻는다 일정 골드를 모아서 제련소에서 강화를한다.(확률로)
 * 일정 경험치를 먹었을때 레벨업 레벨업을 하면 스킬 포인트를 얻고 스킬을 찍는다.
 *  */
package com.Game;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		User player = new User();
		Dungeon dungeon = new Dungeon();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("======메뉴화면======");
			System.out.println("게임이 시작되었습니다.");
			System.out.println("1.캐릭터 정보보기 ");
			System.out.println("2.던전입장 ");
			System.out.println("6. 게임 종료 ");

			int a = sc.nextInt();
			if(player.getHp() <= 0 ) {
				player.setHp(20);
			}
			switch (a) {

			case 1:
				player.Player();
				break;
			case 2:
				dungeon.dungeon(player);
				break;
			case 6:
				System.out.println("게임을 종료합니다");
				return;

			default:
				System.out.println("캐릭터가 할수 없는 행동입니다.");
				break;

			}

		}
	}

}
