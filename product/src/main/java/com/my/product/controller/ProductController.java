package com.my.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {

	@GetMapping
	public String getProduct() {
		return "Hello Product!";
	}
}
