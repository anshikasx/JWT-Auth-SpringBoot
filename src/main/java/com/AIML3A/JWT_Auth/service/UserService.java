package com.AIML3A.JWT_Auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AIML3A.JWT_Auth.model.User;
import com.AIML3A.JWT_Auth.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;

	public User saveUser(User user) {
	    return repo.save(user);
	}

	public List<User> getAllUsers() {
	    return repo.findAll();
	}

	public User getUserById(Long id) {
	    return repo.findById(id).orElse(null);
	}

	public User updateUser(Long id, User user) {
	    User existingUser = repo.findById(id).orElse(null);

	    if(existingUser != null) {
	        existingUser.setUsername(user.getUsername());
	        existingUser.setPassword(user.getPassword());
	        return repo.save(existingUser);
	    }

	    return null;
	}

	public void deleteUser(Long id) {
	    repo.deleteById(id);
	}
}