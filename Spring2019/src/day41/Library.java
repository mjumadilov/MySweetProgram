package day41;


public class Library {

	public static void main(String[] args) {

		Book book1 = new Book();
		
		book1.setTitle("Grit");
		
	//	book1.setAuhtor ("Mike Smith");
	//	book1.pages = 321;
	
		System.out.println(book1.getTitle());
		
		book1.setAuthor("Aitmatov");
		System.out.println(book1.getAuthor());
		
		book1.setPages(26);
		System.out.println(book1.getPages());
	}

}
