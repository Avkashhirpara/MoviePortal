package com.movie.portal.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.movie.portal.show.ShowSearchDTO;

public class ShowSearchMapper implements RowMapper<ShowSearchDTO> {

	@Override
	public ShowSearchDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

		ShowSearchDTO showSearchRs = new ShowSearchDTO();
		showSearchRs.setShowId(rs.getInt("showId"));
		showSearchRs.setScreenId(rs.getInt("screenId"));
		showSearchRs.setPartnerId(rs.getInt("PartnerId"));
		showSearchRs.setName(rs.getString("name"));
		showSearchRs.setDescription(rs.getString("description"));
		showSearchRs.setLanguage(rs.getString("language"));
		showSearchRs.setTechnology(rs.getString("technology"));
		showSearchRs.setTheater(rs.getString("theater"));
		showSearchRs.setScreenlocation(rs.getString("screenlocation") + " screen :" + rs.getString("screen_name"));
		showSearchRs.setStart_time(rs.getTime("start_time"));
		showSearchRs.setBooked_seats(rs.getInt("booked_seats"));
		showSearchRs.setLocation(rs.getString("location"));
		showSearchRs.setCity(rs.getString("city"));

		return showSearchRs;
	}

}