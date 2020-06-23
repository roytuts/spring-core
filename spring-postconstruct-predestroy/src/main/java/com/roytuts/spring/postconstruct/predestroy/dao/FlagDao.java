package com.roytuts.spring.postconstruct.predestroy.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FlagDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String SQL_SELECT_FLAG_VAL = "select flag_val from flag where flag_id = 1";

	public String getFlag() {
		return jdbcTemplate.queryForObject(SQL_SELECT_FLAG_VAL, new Object[] {}, String.class);
	}

}
