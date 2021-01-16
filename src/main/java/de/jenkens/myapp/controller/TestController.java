package de.jenkens.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test App
 * 
 * @author Rezan
 *
 */
@RestController
@RequestMapping("test")
public class TestController {

	@GetMapping
	public String callTest() {
		return "Test was Called -jenkins successful - auto trigger 2 minute";
	}
}
