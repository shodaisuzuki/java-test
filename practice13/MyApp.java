import java.io.IOException;

public class MyApp {
	public static void main(String[] args) throws IOException {
		// try {
		// 	String s = null;
		// 	System.out.println(s.length() );
		// } catch (NullPointerException e) {
		// 	System.out.println("NullPointerException例外をcatchしました");
		// 	System.out.println("--スタックトレース(ここから)--");
		// 	e.printStackTrace();
		// 	System.out.println("--スタックトレース(ここまで)--");
		// }

		// try {
		// 	int i = Integer.parseInt("三");
		// } catch (NumberFormatException e) {
		// 	System.out.println("例外NumberFormatExceptionをcatchしました");
		// }

		System.out.println("プログラムが起動しました");
		throw new IOException();
	}
}