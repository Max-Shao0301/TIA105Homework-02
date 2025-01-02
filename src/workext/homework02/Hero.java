package workext.homework02;

public class Hero implements Action {
	
	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}


	@Override
	public void defend() {
		System.out.println(getName() + "做防禦動作");
	}

	@Override
	public void attack() {
		System.out.println(getName() + "攻擊");
	}

	public void move() {
		System.out.println(getName() + "跑步");
	}

	@Override
	public void drink() {
		System.out.println(getName() + "補水");
	}

	@Override
	public void goHome() {
		System.out.println(getName() + "回城");
	}
}
