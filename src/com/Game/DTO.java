package com.Game;

public class DTO {

	
	private int num;
	private int exp;
	private String job;
	private int gold;
	private String dungeon;
	private String monster;
	private int upgrade;
	
	
	public DTO(int num, int exp, String job, int gold, String dungeon, String monster, int upgrade) {
		super();
		this.num = num;
		this.exp = exp;
		this.job = job;
		this.gold = gold;
		this.dungeon = dungeon;
		this.monster = monster;
		this.upgrade = upgrade;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getGold() {
		return gold;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public String getDungeon() {
		return dungeon;
	}


	public void setDungeon(String dungeon) {
		this.dungeon = dungeon;
	}


	public String getMonster() {
		return monster;
	}


	public void setMonster(String monster) {
		this.monster = monster;
	}


	public int getUpgrade() {
		return upgrade;
	}


	public void setUpgrade(int upgrade) {
		this.upgrade = upgrade;
	}
	
	public DTO() {}
	public String getInformation() {
		return "MemberDTO [ "+
				" num = " + num +
				", exp=" + exp +
				", gold=" + gold +
				", dungeon=" + dungeon +
				", monster= " + monster +
				", job = " + job +
				", upgrade = " + upgrade +
				"]";
	
}
}
