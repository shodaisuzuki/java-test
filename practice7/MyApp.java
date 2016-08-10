public class MyApp {
	public static void main(String[] args) {
		// Cleric c = new Cleric("first");
		// Cleric c = new Cleric("first", 10);
		Cleric c = new Cleric("first", 10, 5);
		System.out.println("名前:" + c.name);
		System.out.println("HP:" + c.hp);
		System.out.println("MP:" + c.mp);

		// c.name = "first";
		// c.hp = 5;
		// c.mp = 1;

		
		// c.play(5);
	}
}