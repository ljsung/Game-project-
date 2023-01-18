package com.Game;

public class Job extends DTO{

	
	public Job () {
		setExp(0); 
		setGold(0);
		setJob1("창술사");
		setJob2("전사");
		setJob3("궁수");
		
	}
	


	public void lance() {
		System.out.println("창술사가 선택되었습니다.");
	}
	public void lanceInfo() {
		int Exp = 0;
		int gold = 0;
		int Atk = 15;
		int Def = 10;
		int Hp = 20;
		System.out.println("경험치는 : " + Exp);
		System.out.println("골드는 : " + gold);
		System.out.println("공격력은 : " + Atk);
		System.out.println("방어력은 : " + Def);
		System.out.println("체력은 : " + Hp);
	}
	
	public void worior() {
		System.out.println("전사가 선택되었습니다.");
	}
	public void woriorInfo() {
		int Exp1 = 0;
		int gold1 = 0;
		int Atk1 = 5;
		int Def1 = 15;
		int Hp1 = 25;
		System.out.println("경험치는 : " + Exp1);
		System.out.println("골드는 : " + gold1);
		System.out.println("공격력은 : " + Atk1);
		System.out.println("방어력은 : " + Def1);
		System.out.println("체력은 : " + Hp1);
	}
	
	public void archer() {
		System.out.println("궁수가 선택되었습니다.");
	}
	public void archerInfo() {
		int Exp2 = 0;
		int gold2 = 0;
		int Atk2 = 10;
		int Def2 = 7;
		int Hp2 = 15;
		System.out.println("경험치는 : " + Exp2);
		System.out.println("골드는 : " + gold2);
		System.out.println("공격력은 : " + Atk2);
		System.out.println("방어력은 : " + Def2);
		System.out.println("체력은 : " + Hp2);
	}
}


