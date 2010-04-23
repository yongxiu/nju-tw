package service;

import java.util.ArrayList;

import bean.User;

import dao.UserDao;

public class ValidateUser {
	/**
	 * usage:validate user
	 * wjc
	 */
	public User validate(String username, String password){
		UserDao dao=new UserDao();
		ArrayList<User> users=(ArrayList<User>) dao.getAllEntity();
		for(User user:users){
			System.out.println(user.getId()+":"+user.getName());
			if(user.getUsername().equals(username) && user.getPassword().equals(password))
				//System.out.println(username+" is validated");
				return user;
		}
		
		return null;
	}
	
	public ValidateUser(){
		
	}
	
	public static void main(String[] args){
		new ValidateUser().validate("wjc2", "123456");
	}
}
