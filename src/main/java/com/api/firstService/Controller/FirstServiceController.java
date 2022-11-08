package com.api.firstService.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/firstservice")
public class FirstServiceController {

	@GetMapping("/message")
	public String test() {
		return "firstservice conected";
	}
}
