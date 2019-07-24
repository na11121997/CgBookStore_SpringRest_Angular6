package com.cg.bookstore.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int commentId;

    private String commentString;
    private Date timeStamp;
    private int commentedbyBookId;
    private int commentedBycustomerId;

    public  Comment(){

    }

   

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public Comment(int commentId, String commentString, Date timeStamp, int commentedBycustomerId) {
		super();
		this.commentId = commentId;
		this.commentString = commentString;
		this.timeStamp = timeStamp;

		this.commentedBycustomerId = commentedBycustomerId;
	}



	public String getCommentString() {
        return commentString;
    }

    public void setCommentString(String commentString) {
        this.commentString = commentString;
    }




	public int getCommentedBycustomerId() {
		return commentedBycustomerId;
	}



	public void setCommentedBycustomerId(int commentedBycustomerId) {
		this.commentedBycustomerId = commentedBycustomerId;
	}



	public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }


 
}
