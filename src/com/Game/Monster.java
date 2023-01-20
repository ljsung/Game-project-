package com.Game;

import java.util.Scanner;

public class Monster extends DTO{
	private String name;


	public Monster () {



	}
	public void mAttack (User player) {
		System.out.println(name + "가 플레이어를 공격합니다.");
		player.setHp(player.getHp()-getAtk());
		System.out.println(getName()+" : " + getHp() );

		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}








}




