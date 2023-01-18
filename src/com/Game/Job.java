package com.Game;

import java.util.Scanner;

public class Job extends DTO{



	Scanner sc = new Scanner(System.in);

	public void lance() {
		int a =	getAtk()+5;
		int d = getDef()+5;
		int h = getHp()+5;
		System.out.println("경험치 : " + getExp());
		System.out.println("공격력 : " +a);
		System.out.println("방어력 : " + d);
		System.out.println("체력 : " + h);

	}

	public void worior() {
		int a =	getAtk()-5;
		int d = getDef()+5;
		int h = getHp()+10;
		System.out.println("전사가 선택되었습니다.");
		System.out.println("경험치 : " + getExp());
		System.out.println("공격력 : " +a);
		System.out.println("방어력 : " + d);
		System.out.println("체력 : " + h);


	}
	public void archer() {
		int a =	getAtk()-10;
		int d = getDef();
		int h = getHp();
		System.out.println("궁수가 선택되었습니다.");
		System.out.println("경험치 : " + getExp());
		System.out.println("공격력 : " +a);
		System.out.println("방어력 : " + d);
		System.out.println("체력 : " + h);
	}
	public void dungeon() {
		System.out.println("던전에 입장했습니다.");
		System.out.println("잡을 몬스터를 선택해 주세요.");
		System.out.println("1.늑대 "+"\n2.오크");

	}
		public void monster() {


			int a = getAtk()-18;
			int b = getAtk()-15;
			int m = sc.nextInt();
			int h = getHp() + 80; 
			int w = getHp() + 30;
			switch(m) {

			case 1 :
				System.out.println("늑대가 등장했습니다.");
				System.out.println("체력 : " + w );
				System.out.println("공격력 : " + a );	
				System.out.println(w + - getAtk());
				break;

			case 2 :  
				System.out.println("오크가 등장했습니다.");
				System.out.println("체력 : " + h);
				System.out.println("공격력 : " + b );
				break;


			}
		}








	}




