public class MyApp {
	public static void main(String[] args) {
		Book b = new Book("first", 100, "red", "1925");
		System.out.println("Book_Name:" + b.getName() );
		System.out.println("Book_Price:" + b.getPrice() );
		System.out.println("Book_Color:" + b.getColor() );
		System.out.println("Book_Isbn:" + b.getIsbn() );

		Computer c = new Computer("first", 100000, "silver", "xxx");
		System.out.println("Computer_Name:" + c.getName() );
		System.out.println("Computer_Price:" + c.getPrice() );
		System.out.println("Computer_Color:" + c.getColor() );
		System.out.println("Computer_MakerName:" + c.getMakerName() );
	}
}