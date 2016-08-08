public class MyApp {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("【数字あてゲーム】");
		System.out.println("１～9の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int n :numbers) {
			if(n == input) {
				System.out.println("正解");
			} else {
				System.out.println("残念");
				break;				
			}
		}
	}
}