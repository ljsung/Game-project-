package com.Game;

public class DTO {

	
	private int Exp;
	private int Atk;
	private int Hp;
	
	public DTO() {}

	
	public int getExp() {
		return Exp;
	}
	public int getAtk() {
		return Atk;
	}

	
	public int getHp() {
		return Hp;
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	public void setAtk(int atk) {
		Atk = atk;
	}

	public void setHp(int hp) {
		Hp = hp;
	}
	public String getInformation() {
		return "DTO [ "
				+ "Exp = " + Exp +
				", Atk =" + Atk +
				", Hp =" + Hp +
				"]";
	
	}



	
		
	}
	