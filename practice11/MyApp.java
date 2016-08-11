public class MyApp {
	public static void main(String[] args) {
		Y[] words = new Y[2];

		words[0] = new A();
		words[1] = new B();

		for (Y w : words ) {
			w.b();
		}
	}
}