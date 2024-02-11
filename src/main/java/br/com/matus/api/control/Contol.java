package br.com.matus.api.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.matus.api.model.Client;
import br.com.matus.api.repository.Repositori;

@RestController
@CrossOrigin(origins = "*")
public class Contol {

	@Autowired
	private Repositori action;
	
	@GetMapping("/")
	public Iterable<Client> select() {
		return action.findAll();
	}

	@PostMapping("/")
	public Client register(@RequestBody Client c) {
		return action.save(c);
	}
	
	@PutMapping("/")
	public Client edit(@RequestBody Client c) {
		return action.save(c);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		action.deleteById(id);
	}
	
}
