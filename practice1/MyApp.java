public class MyApp {

	public static void main(String[] args) {
		System.out.println("1:seach 2:sign 3:delete 4:chage");
		int input = new java.util.Scanner(System.in).nextInt ();
		int selected = input;
		switch (selected) {
			case 1:
				System.out.println("seach do");
				break;
			case 2:
				System.out.println("sign do");
				break;
			case 3:
				System.out.println("delete do");
				break;
			case 4:
				System.out.println("change do");
				break;
		}
	}

}