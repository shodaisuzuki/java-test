public class MyApp {
	public static void main(String[] args) {

		Helo first = new Helo();
		first.setName("first helo");
		first.setHp(50);

		PoisonMatango p = new PoisonMatango('A');
		p.attack(first);
		p.attack(first);
		p.attack(first);
	}
}