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
		this.Exp = exp;
	}
	public void setAtk(int atk) {
		this.Atk = atk;
	}

	public void setHp(int hp) {
		this.Hp = hp;
	}
	public String getInformation() {
		return "DTO [ "
				+ "Exp = " + Exp +
				", Atk =" + Atk +
				", Hp =" + Hp +
				"]";
	
	}



	
		
	}
	