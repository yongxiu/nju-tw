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
			System.out.println("username : "+user.getUsername());
			if(user.getUsername().equals(username) && user.getPassword().equals(password))
				//System.out.println(username+" is validated");
				return user;
		}
		
		return null;
	}
	
	public ValidateUser(){
		
	}
	
	/**
	 * test username
	 * @param username
	 * @return
	 */
	public static boolean ifUsernameCanBeUsed(String username) {
		UserDao userDao = new UserDao();
		ArrayList<User> users=(ArrayList<User>) userDao.getAllEntity();
		boolean tag = true;
		for(User user:users) {
			if(user.getUsername().equals(username))
				tag = false;
		}
		return tag;
	}
	
	public static void main(String[] args){
		new ValidateUser().validate("wjc2", "123456");
	}
}
