package com.movie.portal.show;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.portal.entity.Show;

@Service
public class ShowService {

	@Autowired
	ShowRepository showRepository; 

	public List<Show> getAllShow() {

		return showRepository.getAllShow();
	}
	
	public List<ShowSearchDTO> searchShowByName(String showName) {

		return showRepository.searchShowByName(showName);
	}
	public List<ShowSearchDTO> searchShowByCity(String city) {

		return showRepository.searchShowByCity(city);
	}

	public Show save(Show show) {
		return null;
	}

}
