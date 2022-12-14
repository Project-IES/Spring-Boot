package com.ashokit.rest;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import com.ashokit.binidings.Book;

@RestController
public class BookRestController {

	@GetMapping(value = "/book/{isbn}", produces = "application/json")
	public Book getBookInfo(@PathVariable("isbn") String isbn) {
		// logic
		Book b = new Book(isbn, "Spring", 300.00, "Rod Johnson");
		//create the link and add this link to my Book object
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(BookRestController.class).getAllBooks())
				.withRel("All-Books");
		b.add(link);
		return b;
	}

	@GetMapping(value="/books", produces="application/json")
	public List<Book> getAllBooks() {
		Book b1 = new Book("ISBN001", "Spring", 300.00, "Rod Johnson");
		Book b2 = new Book("ISBN002", "Spring Boot", 400.00, "Rod Johnson");
		Book b3 = new Book("ISBN003", "Spring Cloud", 200.00, "Rod Johnson");

		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);

		return books;
	}
}
