package com.infotech.app.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController(value="/")
public class HelloWorldController {
	public String Hello() {
		return "Hello world";
	}
}
