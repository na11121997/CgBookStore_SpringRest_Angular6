package com.cg.bookstore.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;

    private double price;
    private int publishYear;
    private String publisher;
    private String title;
    private String summaryDetails;
    private double rating;
    private String image;
    
    public Book(int bookId, double price, int publishYear, String publisher, String title, String summaryDetails,
			double rating, String image, Author author, Category category) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.publishYear = publishYear;
		this.publisher = publisher;
		this.title = title;
		this.summaryDetails = summaryDetails;
		this.rating = rating;
		this.image = image;
		this.author = author;
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@ManyToOne
    @JsonBackReference("books_author")
    private Author author;
    
   // @ManyToOne
    //@JsonBackReference("order_books")
   // private Ordered order;
    
    @ManyToOne
    @JsonBackReference("category_books")
    private  Category category;

    private Book(){
    }

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummaryDetails() {
		return summaryDetails;
	}

	public void setSummaryDetails(String summaryDetails) {
		this.summaryDetails = summaryDetails;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book(int bookId, double price, int publishYear, String publisher, String title, String summaryDetails,
			double rating, Author author, Category category) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.publishYear = publishYear;
		this.publisher = publisher;
		this.title = title;
		this.summaryDetails = summaryDetails;
		this.rating = rating;
		this.author = author;
		this.category = category;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

   }
