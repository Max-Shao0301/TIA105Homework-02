package workext.homework02;

public class SwordMan extends Hero {
	

	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
	}
	
	@Override
	public void attack() {
		System.out.println(getName() + " 使用旋風斬");
	}

	@Override
	public void defend() {
		System.out.println(getName() + " 使用格擋");
	}

	@Override
	public void move() {
		System.out.println(getName() + " 慢行");
	}

	public void bigTrick() {
		System.out.println(getName() + " 投擲壓制");
	}
}
