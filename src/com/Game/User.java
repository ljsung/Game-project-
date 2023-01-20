package com.Game;

import java.util.Scanner;

public class User extends DTO {
	
	int level = 1;
	
	Scanner sc = new Scanner(System.in);
	public User () {
		setHp(20);
		setAtk(20);
		setExp(0);
	}
	public void Player() {
		
		if(getExp() >= 50){
			level++;
		}
		System.out.println("레벨 : " + level);
		System.out.println("경험치 : " + getExp());
		System.out.println("공격력 : " + getAtk());
		System.out.println("체력 : " + getHp());

	}

	public void Attack(Monster monster) {
		
		System.out.println( "플레이어가" + monster.getName() + "를 공격했습니다");
		monster.setHp(monster.getHp()-getAtk());
		System.out.println( "player : " + getHp() );
		
		
		if(monster.getHp() <= 0 ) {
			setExp(monster.getExp());
			System.out.println("플레이어가" + monster.getName() + "를 잡아서 " + getExp()+ "EXP를 얻었습니다.");
			
			
		}
	}

}
