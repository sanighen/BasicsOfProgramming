package main;

import library.Book;
import library.Box;
import library.Journal;

public class Application {

	public static void main(String[] args) {

		Box firstBox = new Box();
		Box secondBox = new Box();

		Book book = new Book(500, "War and peace", "Tolstoi", 1867);
//		Journal journal = new Journal(5000, "Java for beginners", "Education");

		firstBox.setContent(new Book(500, "War and peace", "Tolstoi", 1867));
		secondBox.setContent(new Journal(5000, "Java for beginners", "Education"));
		
		firstBox.getContent().setName("This is a book");
		secondBox.getContent().setName("This is a journal");

		System.out.println(firstBox);
		System.out.println(secondBox);

		/*
		 *  Ответить на вопрос,
		 * если у нас скажем свойство title в классе книги (Book) - приватное, и у нас 2
		 * объекта данного класса ( Book oneBook, anotherBook ) - то может ли oneBook
		 * достучатся напрямую до anotherBook.title - ? Аргументируйте!
		 */

		Book oneBook = new Book();
		Book anotherBook = new Book();

		anotherBook.setTitle("qwerty");
		oneBook.setTitle(anotherBook.getTitle());

		/*
		 * oneBook не сможет напрямую достучаться до anotherBook.title у нас же свойства
		 * приватные, сеттеры и геттеры не позволят напрямую что-либо изменить В моём
		 * примере кода я только смог значение title в oneBook задать из значения title
		 * в anotherBook
		 */

		// ------------------------------------------------------------
		/*
		 * Возможно ли "положить" одну и ту же книгу в обе коробки? Если после 10.4-го
		 * пункта изменить title книги из первой коробки, изменится и титул книги во
		 * второй? Если да - почему?
		 */

		firstBox.setContent(book);
		secondBox.setContent(book);

		((Book) firstBox.getContent()).setTitle("f");

		/*
		 * Одну и ту же книгу возможно положить в обе коробки но при изменении книги из
		 * одной коробки произойдут изменения и во второй коробке. Я считаю это
		 * происходит потому что ссылка на book одна и все изменения в book, даже если
		 * она находится в определенной коробке, будут происходить везде
		 */

	}

}