package com.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Saludo {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public void hello() {
		System.out.println("Saludos!");
	}
	
}
