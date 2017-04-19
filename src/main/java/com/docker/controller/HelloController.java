package com.docker.controller;

import com.docker.domain.User;
import com.docker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：my test of docker
 * Created by Peivxuan on 2017/4/14.
 */
@RestController
public class HelloController {


	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/hello")
	public String postHello(){
		User user = new User();
		user.setUsername("guest");
		user.setPassword("guest");
		User save = userRepository.save(user);
		User one = userRepository.findOne(save.getId());

		return "Hello "+ one.getUsername() + " By Post!";
	}
//	@GetMapping
//	public String getHello(){
//		User user = new User();
//		user.setUsername("guest");
//		user.setPassword("guest");
//		User save = userRepository.save(user);
//		User one = userRepository.findOne(save.getId());
//
//		return "Hello "+ one.getUsername() + " By get!";
//	}
}
