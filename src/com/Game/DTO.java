package com.Game;

public class DTO {

	
	private int Exp=0;
	private int Atk=20;
	private int Def=20;
	private int Hp=20;

	
	public DTO(int exp, int atk, int def, int hp) {
		super();
		this.Exp = exp;
		this.Atk = atk;
		this.Def = def;
		this.Hp = hp;
	}
	public int getExp() {
		return Exp;
	}
	public int getAtk() {
		return Atk;
	}
	public int getDef() {
		return Def;
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
	public void setDef(int def) {
		Def = def;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public DTO() {}
	public String getInformation() {
		return "DTO [ "
				+ "Exp = " + Exp +
				", Atk =" + Atk +
				", Def =" + Def +
				", Hp =" + Hp +
				"]";
	
	}



	
		
	}
	