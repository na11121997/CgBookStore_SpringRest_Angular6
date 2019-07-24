package com.cg.bookstore.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Ordered {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;

    private Date orderDate;
    private String orderStatus;
    private String BookId;

	@ManyToOne
    @JsonBackReference("customer_order")
    private Customer customer;


    //@OneToMany(mappedBy = "order" , fetch =FetchType.EAGER , cascade = CascadeType.ALL)
   // @MapKey
    //@JsonManagedReference("order_books")
   // private Map<Integer , Book> books;

    public Ordered(int orderId, Date orderDate, String orderStatus,  Customer customer) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.customer = customer;
	}

	
    public Ordered() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
    public Ordered(Date orderDate, String orderStatus,Customer customer , int orderId) {
        super();
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
  
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }


}
