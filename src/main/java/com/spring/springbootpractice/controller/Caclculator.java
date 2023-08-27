package com.spring.springbootpractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calculator")
public class Caclculator {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public int add(@RequestParam("num1") int a, @RequestParam("num2") int b) {
		int c = a+b;
		return c;
	}
}
