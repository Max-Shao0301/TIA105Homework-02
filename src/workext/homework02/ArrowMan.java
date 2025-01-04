package workext.homework02;

public class ArrowMan extends Hero {


	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
	}

	@Override
	public void attack() {
		System.out.println(getName() + " 使用箭羽");
	}

	@Override
	public void defend() {
		System.out.println(getName() + " 放煙霧");
	}

	@Override
	public void move() {
		System.out.println(getName() + " 急速衝刺");
	}

}
