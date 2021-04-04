package com.my.display.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("display")
public class DisplayController {

	@GetMapping
	public String displayProduct() {
		return "Hello World";
	}
}
