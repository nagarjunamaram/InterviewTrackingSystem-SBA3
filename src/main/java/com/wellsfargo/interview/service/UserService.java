package com.wellsfargo.interview.service;

import java.util.List;

import com.wellsfargo.interview.exception.InterviewTrackerException;
import com.wellsfargo.interview.model.UserModel;

public interface UserService {

	UserModel add(UserModel user) throws InterviewTrackerException;
	
	boolean deleteUser(int userId) throws InterviewTrackerException;
	
	UserModel getUser(int userId);
	
	List<UserModel> getAllUsers();

}
