public class MyApp {

	public static void main(String[] args) {
		
		System.out.println("integer　hit game");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i <5; i++){
			System.out.println("input for 0~9 integer");
			int num = new java.util.Scanner (System.in).nextInt();
			if (ans == num){
				System.out.println("success");
				break;
			} else{
				System.out.println("dont much");
			}
		}
		System.out.println("finish");
	}

}