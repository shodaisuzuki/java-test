public class MyApp {

	public static void introduceOneself(){
		String name = "bob";
		int age = 20;
		float height = 180;
		char sex = '男';

		System.out.println("名前は"+name+"年齢は"+age+"身長は"+height+"性別は"+sex);
	}

	public static void email(String title, String address, String text) {
		System.out.println(address+ "にメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}

	public static void email(String address, String text) {
		System.out.println(address+ "にメールを送信しました");
		System.out.println("本文:"+text);
	}

	public static double calcTriangleArea(double bottom, double height) {
		double t_ans = (bottom * height)/2 ;
		return t_ans;
	}

	public static double calcCircleArea(double radius) {
		double ans = radius * radius * 3.14;
		return ans;
	}

	public static void main(String[] args) {
		System.out.println("円の半径を入力して");
		System.out.println("例:6.0");

		double area = new java.util.Scanner(System.in).nextDouble();
		double ans = calcCircleArea(area);
		System.out.println("円の面積は"+ ans);

		System.out.println("三角形の底辺を入力して");
		System.out.println("例:6.0");
		double bottom_area = new java.util.Scanner(System.in).nextDouble();

		System.out.println("三角形の高さを入力して");
		System.out.println("例:6.0");
		double height_area = new java.util.Scanner(System.in).nextDouble();

		double t_ans = calcTriangleArea(bottom_area, height_area);
		System.out.println("三角形の面積は"+ t_ans);
	}
}