package com.my.display.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("display")
@RequiredArgsConstructor
public class DisplayController {

	@GetMapping
	public String getDisplayById(@PathVariable(value = "displayId") String displayId) {
		return "Hello World!!";
	}
}