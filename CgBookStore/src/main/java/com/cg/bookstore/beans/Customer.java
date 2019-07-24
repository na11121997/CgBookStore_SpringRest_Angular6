package com.cg.bookstore.beans;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;
    
    private String customerFirstName;
	private String customerLastName;
    private String email;
    private String phoneNumber;
    private String password;
    

    @Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerFirstName=" + customerFirstName
				+ ", customerLastName=" + customerLastName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", orders=" + orders + "]";
	}

	@OneToMany(mappedBy = "customer" , fetch =FetchType.EAGER , cascade = CascadeType.ALL)
    @MapKey
    @JsonManagedReference("customer_order")
    private Map<Integer , Ordered> orders;
   
    public Customer(int customerId, String customerFirstName, String customerLastName, String email,
			String phoneNumber, String password) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}


    
    public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

    public Customer(){

    }


}
