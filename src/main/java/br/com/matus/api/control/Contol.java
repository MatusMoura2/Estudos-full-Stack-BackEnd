package br.com.matus.api.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contol {

	@GetMapping("/hello")
	String hello() {
		return "Eu amo a minha familia";
	}
}
