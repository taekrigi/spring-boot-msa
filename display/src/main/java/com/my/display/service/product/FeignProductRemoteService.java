package com.my.display.service.product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.display.dto.ProductDto;

@FeignClient(name = "product", fallbackFactory = FeignProductRemoteServiceFallbackFactory.class)
public interface FeignProductRemoteService {
	
	@RequestMapping(path = "/products/productId")
	ProductDto getProductById(@PathVariable(value = "productId") String productId);

}
