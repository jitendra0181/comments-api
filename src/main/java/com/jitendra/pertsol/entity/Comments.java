package com.jitendra.pertsol.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "COMMENTS")
@IdClass
public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	@Column(name = "Name", nullable = false)
	private String by;
	@Column(name = "TEXT", nullable = false)
	private String text;
	@Column(name = " DATEOFCOMMENT", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateofcomment;
	
	@Id
	private Integer pincode;
	

	public Comments(Long id, String by, String text, Date dateofcomment) {
		super();
		this.id = id;
		this.by = by;
		this.text = text;
		this.dateofcomment = dateofcomment;
	}

	public Comments() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDateofcomment() {
		return dateofcomment;
	}

	public void setDateofcomment(Date dateofcomment) {
		this.dateofcomment = dateofcomment;
	}

}
