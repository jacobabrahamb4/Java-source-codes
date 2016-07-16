import java.util.EnumSet;

public class Test {

	public static void main(String[] args) {
		for (Book book : Book.values()) {
			System.out.println(book.toString());
		}

		for (Book book : EnumSet.range(Book.JHTP, Book.CHTP)) {
			System.out.println(book.toString());
		}
	}

}
