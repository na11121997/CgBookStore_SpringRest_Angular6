package com.cg.bookstore.services;

import java.util.List;

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

public interface BookStoreServices {
    Customer createNewCustomer(Customer customer);
    Customer getCustomerDetails(int customerId) throws CustomerNotFoundException;
    List<Customer> getAllCustomersDetails() ;
    boolean deleteCustomer(int customerId);

    Admin createNewAdmin(Admin admin);
    Admin getAdminDetails(int adminId) throws AdmintNotFoundException;
    List<Admin> getAllAdminDetails() ;
    boolean deleteAdmin(int adminId);
    
    Author createNewAuthor(Author author);
    Author getAuthorDetails(int authorId) throws AuthorNotFoundException;
    List<Author> getAllAuthorDetails();
    boolean deleteAuthor(int authorId);
    
    Book createNewBook(Book book) ;
    Book getBookDetails(int bookId) throws BookNotFoundException;
    List<Book> getAllBookDetails();
    boolean deleteBook(int bookId);

    Category createNewCategory(Category category) ;
    Category getCategoryDetails(int categoryId) throws CategoryNotFoundException;
    List<Category> getAllCategoryDetails();
    boolean deleteCategory(int categoryId);
    
    Comment createNewComment(Comment comment);
    Comment getCommentDetails(int commentId) throws CommentNotFoundException;
    List<Comment> getAllCommentDetails();
    boolean deleteComment(int commentId);
    
    Ordered createNewOrder(Ordered order);
    Ordered getOrderDetails(int orderId) throws OrderNotFoundException;
    List<Ordered> getAllOrderDetails();
    boolean deleteOrder(int orderId);

}
