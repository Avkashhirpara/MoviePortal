package com.movie.portal.entity.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.movie.portal.entity.Show;

public class ShowMapper implements RowMapper<Show> {

	@Override
	public Show mapRow(ResultSet rs, int rowNum) throws SQLException {
		Show show = new Show();
		show.setId(rs.getInt("id"));
		show.setScreenId(rs.getInt("screen_id"));
		show.setName(rs.getString("name"));
		show.setDescription(rs.getString("description"));
		show.setLanguage(rs.getString("language"));
		show.setTechnology(rs.getString("technology"));
		show.setFromDate(rs.getDate("from_date"));
		show.setToDate(rs.getDate("to_date"));
		show.setStartTime(rs.getTime("start_time"));
		show.setEndTime(rs.getTime("end_time"));
		show.setStatus(rs.getInt("status"));
		show.setBookedSeat(rs.getLong("booked_seats"));
		show.setCreatedby(rs.getLong("createdby"));
		show.setCreateddate(rs.getTimestamp("createddate"));
		return show;
	}
	

}
