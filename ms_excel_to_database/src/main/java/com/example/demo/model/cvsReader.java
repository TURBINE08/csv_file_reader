package com.example.demo.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Setter
@Getter
public class cvsReader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
//	@Column(columnDefinition="TEXT")
	 @Column(length=10000,columnDefinition="TEXT")
	private String end_year;
	 @Column(length=10000,columnDefinition="TEXT")
	private String citylng;
	 @Column(length=10000,columnDefinition="TEXT")
	private String citylat;
	 @Column(length=10000,columnDefinition="TEXT")
	private String intensity;
	 @Column(length=10000,columnDefinition="TEXT")
	private String sector;
	
	 @Column(length=10000,columnDefinition="TEXT")
	private String topic;
	@Column(length=10000,columnDefinition="TEXT")
	private String insight;
	@Column(length=10000,columnDefinition="TEXT")
	private String swot;
	@Column(length=10000,columnDefinition="TEXT")
	private String url;
	@Column(length=10000,columnDefinition="TEXT")
	private String region;
	
	@Column(length=10000,columnDefinition="TEXT")
	private String start_year;
	@Column(length=10000,columnDefinition="TEXT")
	private String impact;
	@Column(length=10000,columnDefinition="TEXT")
	private String added;
	@Column(length=10000,columnDefinition="TEXT")
	private String published;
	@Column(length=10000,columnDefinition="TEXT")
	private String city;
	
	@Column(length=10000,columnDefinition="TEXT")
	private String relevance;
	@Column(length=10000,columnDefinition="TEXT")
	private String pestle;
	@Column(length=10000,columnDefinition="TEXT")
	private String source;
	@Column(length=10000,columnDefinition="TEXT")
	private String title;
	@Column(length=10000,columnDefinition="TEXT")
	private String likelihood;
	
	
//	===========================================================================================================================
	
	
	

}
