package com.cognizant.twitterApp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document("user")
public class User {
	@Id
	private String id;
	@Field("passWord")
	private String passWord;
	@Field("firstName")
	private String firstName;
	@Field("lastName")
	private String lastName;
	@Field("email")
	@Indexed(unique = true)
	private String email;
	@Field("contactNumber")
	private int contactNumber;
}
