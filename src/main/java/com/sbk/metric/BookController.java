package com.sbk.metric;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

	@Operation(summary = "Get a book by its id")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Found the book",
					content = { @Content(mediaType = "application/json", schema = @Schema(implementation = Book.class)) }),
			@ApiResponse(responseCode = "400", description = "Invalid id supplied",
					content = @Content),
			@ApiResponse(responseCode = "404", description = "Book not found",
					content = @Content) })
	@GetMapping("/{id}")
	public Book findById(@PathVariable long id) {
		return new Book(1L, "Hello world", "Sudhakar");
	}

	@GetMapping("/")
	public Collection<Book> findBooks() {
		return this.getBooks();
	}

	List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.add(new Book(1L, "Hello world!", "Sudhakar"));
		books.add(new Book(2L, "Management Guru!", "SBK"));
		return books;
	}

	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Book updateBook(
			@PathVariable("id") final String id, @RequestBody final Book book) {
		return book;
	}
}
