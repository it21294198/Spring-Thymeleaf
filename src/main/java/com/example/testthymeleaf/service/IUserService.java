package com.example.testthymeleaf.service;

import java.util.List;

import com.example.testthymeleaf.model.User;

public interface IUserService {
	
	public void creatUser(User user);
	public User updateUser(User user);
	public User getUserById(int id);
	public void deleteUser(int id);
	
	public List<User> getAllUsers();
	public List<User> getEqualNameUsers(String name);
	
}
