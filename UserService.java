package com.RestApiProject.Services;


	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.RestApiProject.Repository.IUserRepository;
import com.RestApiProject.model.User;


	@Service

	public class UserService {

			@Autowired
			private IUserRepository userRepo;
			

			public void addUser(User user) {
				
				this.userRepo.save(user);
				
			}

			public Optional<User> getUserByEmail(String email) {
				
				return this.userRepo.findByuserEmail(email);
				
			}
		}


