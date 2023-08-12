package sample.work.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import sample.work.model.User;
import sample.work.model.UserDataResponse;
import sample.work.model.UserDataResponseWrapper;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/userController")
public class ApiController {

	@GetMapping(value = "/getAllUsers")
	public ResponseEntity<List<User>> fetchJsonData() {
		try {
			RestTemplate restTemplate = new RestTemplate();
			URI uri = new URI("https://reqres.in/api/users");
			UserDataResponse response = restTemplate.getForObject(uri, UserDataResponse.class);
			return ResponseEntity.ok(response.getData());
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}

	}

	@GetMapping(value = "/getUserById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> fetchDataById(@PathVariable("id") Long userId) {

		try {
			RestTemplate restTemplate = new RestTemplate();
			URI uri = new URI("https://reqres.in/api/users/" + userId);
			UserDataResponseWrapper response = restTemplate.getForObject(uri, UserDataResponseWrapper.class);
			return ResponseEntity.ok(response.getData());
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred.");
		}
	}

}
