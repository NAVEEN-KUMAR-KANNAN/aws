package com.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/get")
public class AwsController {

	@GetMapping(value="/data")
	public String getName() {
		return "Winter Is Coming...";
	}
	
}
