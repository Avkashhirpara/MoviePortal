package com.movie.portal.show;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.movie.portal.entity.Show;
import com.movie.portal.entity.mapper.ShowMapper;
import com.movie.portal.entity.mapper.ShowSearchMapper;

@Repository
public class ShowRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public List<Show> getAllShow() {

		String sql = "SELECT * FROM movieportal.show";
		List<Show> shows = null;
		try {
			shows = jdbcTemplate.query(sql, new ShowMapper());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return shows;
	}
	
	public Show getShowById(long id) {

		String sql = "SELECT * FROM movieportal.show where id =:id";
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id",id);
		List<Show> shows = null;
		try {
			shows = namedParameterJdbcTemplate.query(sql, namedParameters, new ShowMapper());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return shows.get(0);
	}

	public List<ShowSearchDTO> searchShowByName(String showName) {
		List<ShowSearchDTO> shows = null;
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("name", "%" + showName + "%");
		// SqlParameterSource namedParameters = new
		// MapSqlParameterSource().addValue("name", showName);
		
		//below query for shingle show seat counts and all. 
//		String newSql = "SELECT s.name,s.description,s.language,s.technology,sc.screen_name,sc.screen_location,"
//				+ "sc.total_seat,sec.name sectionName, count(bs.id) booked_seat"
//				+ " FROM movieportal.show s inner join screen sc  on sc.id = s.screen_id "
//				+ "inner join section sec on sec.screen_id = sc.id " + "inner join booking b on b.show_id = s.id "
//				+ "inner join book_seat bs on bs.booking_id = b.id "
//				+ "inner join seat st on st.id = bs.seat_id and  sec.id = st.section_id "
//				+ "where s.id = 1 group by s.name,s.description,s.language,s.technology,sc.screen_name,sc.screen_location,sc.total_seat,sec.name, sc.total_seat";

		String sql = "	SELECT " + "	 s.name," + "	 s.description," + "	 s.language," + "	 s.technology,"
				+ "	 s.start_time," + "	 p.name theater, " + "	 screen.screen_location screenlocation,"
				+ "	 s.booked_seats," + "	 p.location, " + "	 p.city," + "	 s.id showId,"
				+ "	 screen.id screenId," + "	 p.id PartnerId," + "	 screen.screen_name "
				+ "	FROM movieportal.show s inner join screen on s.screen_id = screen.id"
				+ " inner join partner p on p.id = screen.pid" + "	where s.status = 1 and s.name like :name";

		try {
			shows = namedParameterJdbcTemplate.query(sql, namedParameters, new ShowSearchMapper());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return shows;
	}

	public List<ShowSearchDTO> searchShowByCity(String city) {
		List<ShowSearchDTO> shows = null;
		SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("city", "%" + city + "%");
		// SqlParameterSource namedParameters = new
		// MapSqlParameterSource().addValue("name", showName);
		String sql = "	SELECT " + "	 s.name," + "	 s.description," + "	 s.language," + "	 s.technology,"
				+ "	 s.start_time," + "	 p.name theater, " + "	 screen.screen_location screenlocation,"
				+ "	 s.booked_seats," + "	 p.location, " + "	 p.city," + "	 s.id showId,"
				+ "	 screen.id screenId," + "	 p.id PartnerId," + "	 screen.screen_name "
				+ "	FROM movieportal.show s inner join screen on s.screen_id = screen.id"
				+ " inner join partner p on p.id = screen.pid" + "	where s.status = 1 and " + " p.city like :city";

		try {
			shows = namedParameterJdbcTemplate.query(sql, namedParameters, new ShowSearchMapper());
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return shows;
	}

}
