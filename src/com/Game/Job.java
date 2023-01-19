package com.Game;

import java.util.Scanner;

public class Job extends DTO{



	Scanner sc = new Scanner(System.in);


	
	
	public void getattack() {

	}
	public void lance() {
		int la = getAtk()+5;
		int ld = getDef()+5;
		int lh = getHp()+5;
		System.out.println("경험치 : " + getExp());
		System.out.println("공격력 : " +la);
		System.out.println("방어력 : " + d);
		System.out.println("체력 : " + h);

	}

	public void worior() {
		int wa =	getAtk()-5;
		int wd = getDef()+5;
		int wh = getHp()+10;
		System.out.println("전사가 선택되었습니다.");
		System.out.println("경험치 : " + getExp());
		System.out.println("공격력 : " +wa);
		System.out.println("방어력 : " + wd);
		System.out.println("체력 : " + wh);
	}
	
		


	

	public void archer() {
		int aa =	getAtk()-10;
		int ad = getDef();
		int ah = getHp();
		System.out.println("궁수가 선택되었습니다.");
		System.out.println("경험치 : " + getExp());
		System.out.println("공격력 : " +aa);
		System.out.println("방어력 : " + ad);
		System.out.println("체력 : " + ah);
	}
	public void attack() {
	
		if((getHp()+30)  - (getAtk()+5)>0) {
		
			
		}
	}
	
	
		public void dungeon() {
		System.out.println("던전에 입장했습니다.");
		System.out.println("잡을 몬스터를 선택해 주세요.");
		System.out.println("1.늑대 "+"\n2.오크");

		int d = sc.nextInt();
		while(true) {
			System.out.println("1.공격한다.\n2.도망");
		

			break;
		}
		}
	
		public void monster() {


			int a = getAtk()-18;
			int b = getAtk()-15;
			int m = sc.nextInt();
			int oh = getHp() + 80; 
			int wh = getHp() + 30;
			switch(m) {

			case 1 :
				System.out.println("늑대가 등장했습니다.");
				System.out.println("체력 : " + wh );
				System.out.println("공격력 : " + a );	
				System.out.println(wh + - getAtk());
				break;

			case 2 :  
				System.out.println("오크가 등장했습니다.");
				System.out.println("체력 : " + oh);
				System.out.println("공격력 : " + b );
				break;


			}
		}








	}




