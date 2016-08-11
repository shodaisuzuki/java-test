public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がnull");
		}
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前が短い");
		}

		this.name = name;
		System.out.println("魔法の杖の名前を" + this.name + "にしました");
	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("増幅率が×");
			}
		this.power = power;
	}
}