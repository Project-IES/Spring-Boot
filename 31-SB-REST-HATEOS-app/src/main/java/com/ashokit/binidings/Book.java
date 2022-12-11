package com.ashokit.binidings;

import org.springframework.hateoas.RepresentationModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
//Base class for DTOs to collect links from Controller class ---> RepresentationModel
public class Book extends RepresentationModel<Book> {

	private String isbn;
	private String name;
	private Double price;
	private String author;

}
