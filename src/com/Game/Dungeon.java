package com.Game;

import java.util.Scanner;

public class Dungeon {
	
	Scanner sc = new Scanner(System.in);
	
	public void dungeon(User player) {
		Monster monster = null;
		System.out.println("던전에 입장했습니다.");
		System.out.println("잡을 몬스터를 선택해 주세요.");
		System.out.println("1.늑대 "+"\n2.오크");

		int d = sc.nextInt();
		while(true) {
	
		if(monster == null || monster.getHp() <= 0) {
			
			switch(d) {
			case 1 :
				monster = new wolf();
				break;
			case 2 :
				monster = new ork();
				break;
		}
		
		}
		
			System.out.println("1.공격한다.\n2.도망친다.");
			int b= sc.nextInt();
			switch(b) {
			
			case 1 :	
			player.Attack(monster);
			if(monster.getHp() <= 0) {
				System.out.println(monster.getName()+"가 사망했습니다.");	
			player.setExp(player.getExp()+monster.getExp());
			System.out.println("플레이어가" + monster.getName() + "를 잡아서 " + monster.getExp()+ "EXP를 얻었습니다.");
				break;
				
				
			}
			monster.mAttack(player);
			
			break;
			case 2 :
				player.setHp(20+(player.level-1)*2);
				return;
			}

			
		}
			
			
		}
}
