package com.movie.portal.show;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.portal.entity.Show;

@RestController
@RequestMapping("/movieportal/v1/")
public class ShowController {
	
	ShowService showService;
	
	@Autowired
	public void setShowService(ShowService showService) {
		this.showService = showService;
	}

	@GetMapping("/allShow")
	ResponseEntity<List<Show>> getShow() {
		return new ResponseEntity<>(showService.getAllShow(), HttpStatus.CREATED);
	}
	
	@GetMapping("/SearchShowByName/{name}")
	ResponseEntity<List<ShowSearchDTO>> getShowbyName(@PathVariable String name ) {
		return new ResponseEntity<>(showService.searchShowByName(name), HttpStatus.CREATED);
	}
	
	@GetMapping("/SearchShowByCity/{city}") // same implementation for locations and timings. 
	ResponseEntity<List<ShowSearchDTO>> getShowbyCity(@PathVariable String city ) {
		return new ResponseEntity<>(showService.searchShowByName(city), HttpStatus.CREATED);
	}
	
	

	@PostMapping("/show")
	ResponseEntity<Show> createShow(@RequestBody Show show) {
		return new ResponseEntity<>(showService.save(show), HttpStatus.CREATED);
	}
	
	

}
