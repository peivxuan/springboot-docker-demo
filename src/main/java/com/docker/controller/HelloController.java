package com.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：my test of docker
 * Created by Peivxuan on 2017/4/14.
 */
@RestController
public class HelloController {
	@PostMapping
	public String postHello(){
		return "Hello Docker By Post!";
	}
	@GetMapping
	public String getHello(){
		return "Hello Docker By Get!";
	}
}
