package com.cg.bookstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookstore.beans.Admin;
import com.cg.bookstore.beans.Author;
import com.cg.bookstore.beans.Book;
import com.cg.bookstore.beans.Category;
import com.cg.bookstore.beans.Comment;
import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.beans.Ordered;
import com.cg.bookstore.exceptions.AdmintNotFoundException;
import com.cg.bookstore.exceptions.AuthorNotFoundException;
import com.cg.bookstore.exceptions.BookNotFoundException;
import com.cg.bookstore.exceptions.CategoryNotFoundException;
import com.cg.bookstore.exceptions.CommentNotFoundException;
import com.cg.bookstore.exceptions.CustomerNotFoundException;
import com.cg.bookstore.exceptions.OrderNotFoundException;
import com.cg.bookstore.services.BookStoreServices;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookStoreController {
	
	@Autowired
	BookStoreServices bookStoreServices;
	
	@RequestMapping(value= {"/sayHello"},method=RequestMethod.GET)
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<String>("hello world ",HttpStatus.OK);
	}
	
	//Login
	
	
	//CUSTOMER CONTROLLER
	@PostMapping(value="/newCustomer",consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	ResponseEntity<String> newCustomer(@RequestBody Customer customer) {	
		bookStoreServices.createNewCustomer(customer);
		  return new ResponseEntity<>("Customer details successfully added - Customer Id :"+customer.getCustomerId(),HttpStatus.OK);
	}
	
	@GetMapping("/getCustomerDetails")
    public Customer getCustomerDetails(@RequestParam int customerId) throws CustomerNotFoundException{
		System.out.println(bookStoreServices.getCustomerDetails(customerId));
        return bookStoreServices.getCustomerDetails(customerId);
    }
	
	@RequestMapping(value="/getAllCustomerDetails",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public List<Customer> findAllCustomers() {
		  return bookStoreServices.getAllCustomersDetails();
	}

	@RequestMapping(value="/deleteCustomer/{customerId}",method=RequestMethod.DELETE)
	public ResponseEntity<String> removeCustomerDetails(@PathVariable(value="customerId")int customerId) throws CustomerNotFoundException{
		bookStoreServices.deleteCustomer(customerId);
		return new ResponseEntity<>("Customer details successfully removed ",HttpStatus.OK);
	}

	//ADMIN CONTROLLER
	@PostMapping(value="/newAdmin",consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	ResponseEntity<String> newAdmin(@RequestBody Admin admin) {	
		bookStoreServices.createNewAdmin(admin);
		  return new ResponseEntity<>("Customer details successfully added - Customer Id :"+admin.getAdminId(),HttpStatus.OK);
			
	}
	
	@GetMapping("/getAdminDetails")
    public Admin getAdminDetails(@RequestParam int adminId) throws AdmintNotFoundException{
        return bookStoreServices.getAdminDetails(adminId);
    }
	
	@GetMapping(value="/getAllAdminDetails",produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public List<Admin> findAllAdmin() {
		  return bookStoreServices.getAllAdminDetails();
	}

	@DeleteMapping("/deleteAdmin")
	public ResponseEntity<String> removeAdminDetails(@RequestParam int adminId) throws AdmintNotFoundException{
		bookStoreServices.deleteAdmin(adminId);
		return new ResponseEntity<>("Admin details successfully removed ",HttpStatus.OK);
	}
	
	//AUTHOR CONTROLLER
	@PostMapping(value="/newAuthor",consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	void newAuthor(@RequestBody Author author) {	
		bookStoreServices.createNewAuthor(author);
	}
	
	@GetMapping("/getAuthorDetails")
    public Author getAuthorDetails(@RequestParam int authorId) throws AuthorNotFoundException{
        return bookStoreServices.getAuthorDetails(authorId);
    }
	
	@GetMapping(value="/getAllAuthorDetails",produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public List<Author> findAllAuthors() {
		  return bookStoreServices.getAllAuthorDetails();
	}

	@DeleteMapping("/deleteAuthor")
	public ResponseEntity<String> removeAuthorDetails(@RequestParam int authorId) throws AuthorNotFoundException{
		bookStoreServices.deleteAuthor(authorId);
		return new ResponseEntity<>("Author details successfully removed ",HttpStatus.OK);
	}
	
	//BOOK CONTROLLER
	@RequestMapping(value="/newBooks",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	void newBooks(@RequestBody Book book) {	
		bookStoreServices.createNewBook(book);
	}
	
	@GetMapping("/getBooksDetails")
    public Book getBooksDetails(@RequestParam int bookId) throws BookNotFoundException{
        return bookStoreServices.getBookDetails(bookId);
    }
	
	@GetMapping(value="/getAllBooksDetails",produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public List<Book> findAllBooks() {
		  return bookStoreServices.getAllBookDetails();
	}

	@RequestMapping(value="/deleteBooks/{bookId}",method=RequestMethod.DELETE)
	public ResponseEntity<String> removeBookDetails(@PathVariable(value="bookId")int bookId) throws BookNotFoundException{
		bookStoreServices.deleteBook(bookId);
		return new ResponseEntity<>("Book details successfully removed ",HttpStatus.OK);
	}
	
	//CATEGORY CONTROLLER
	@PostMapping(value="/newCategory",consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	void newCategory(@RequestBody Category category) {	
		bookStoreServices.createNewCategory(category);
	}
	
	@RequestMapping(value="/getCategoryDetails/{categoryId}",method=RequestMethod.GET)
	public Category getCategoryDetails(@PathVariable(value="categoryId")int categoryId) throws CategoryNotFoundException{
		 return bookStoreServices.getCategoryDetails(categoryId);
	}
	
	@GetMapping(value="/getAllCategoryDetails",produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public List<Category> findAllCategory() {
		  return bookStoreServices.getAllCategoryDetails();
	}
	
	@RequestMapping(value="/deleteCategory/{categoryId}",method=RequestMethod.DELETE)
	public ResponseEntity<String> removeCategoryDetailsById(@PathVariable(value="categoryId")int categoryId) throws CategoryNotFoundException{
		bookStoreServices.deleteCategory(categoryId);
		return new ResponseEntity<>("Category details successfully removed ",HttpStatus.OK);
	}
	
	//COMMENT CONTROLLER
	@PostMapping(value="/newComment",consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	void newComment(@RequestBody Comment comment) {	
		bookStoreServices.createNewComment(comment);
	}
		
	@GetMapping("/getCommentsDetails")
    public Comment getCommentDetails(@RequestParam int commentId) throws CommentNotFoundException{
       return bookStoreServices.getCommentDetails(commentId);
	}
		
	@GetMapping(value="/getAllCommentsDetails",produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public List<Comment> findAllComments() {
		return bookStoreServices.getAllCommentDetails();
	}

	@DeleteMapping("/deleteComments")
	public ResponseEntity<String> removeCommentsDetails(@RequestParam int commentId) throws CommentNotFoundException{
		bookStoreServices.deleteComment(commentId);
		return new ResponseEntity<>("Comment details successfully removed ",HttpStatus.OK);
	}
	
	//ORDER CONTROLLER
	@PostMapping(value="/newOrdered",consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	void newOrdered(@RequestBody Ordered ordered) {	
		bookStoreServices.createNewOrder(ordered);
	}
			
	@GetMapping("/getOrderedDetails")
    public Ordered getOrderDetails(@RequestParam int orderedId) throws OrderNotFoundException{
       return bookStoreServices.getOrderDetails(orderedId);	
    }
			
	@GetMapping(value="/getAllOrderedDetails",produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public List<Ordered> findAllOrders() {
		return bookStoreServices.getAllOrderDetails();
	}

	@DeleteMapping("/deleteOrdered")
	public ResponseEntity<String> removeOrderDetails(@RequestParam int orderedId) throws OrderNotFoundException{
		bookStoreServices.deleteOrder(orderedId);
		return new ResponseEntity<>("Ordered details successfully removed ",HttpStatus.OK);
	}
	
}
