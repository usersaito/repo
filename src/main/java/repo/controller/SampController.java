package repo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/hoges")
public class SampController {

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> post(UriComponentsBuilder uriComponentsBuilder) {
		return new ResponseEntity<String>("string", null, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		return "success";
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public String get(@PathVariable int id) {
		return "aaa";
	}
}
