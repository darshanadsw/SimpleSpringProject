package org.springframework.chapter1.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingMessageServiceImpl implements GreetingMessageService {

	public String greetUser() {
		return "Welcome to refresh knowledge in Spring framework!";
	}

}
