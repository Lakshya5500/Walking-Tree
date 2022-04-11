package com.Walkingtree.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
	@Id
	
	int id;
	String username;
	String password;

	public Users() {
	}

	public Users(int id, String user, String pass) {
		super();
		this.id = id;
		this.username = user;
		this.password = pass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return username;
	}

	public void setUser(String user) {
		this.username = user;
	}

	public String getPass() {
		return password;
	}

	public void setPass(String pass) {
		this.password = pass;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", user=" + username + ", pass=" + password + "]";
	}

}
