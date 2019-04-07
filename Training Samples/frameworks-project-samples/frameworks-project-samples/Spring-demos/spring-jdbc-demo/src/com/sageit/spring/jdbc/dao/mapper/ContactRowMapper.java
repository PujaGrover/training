package com.sageit.spring.jdbc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sageit.spring.jdbc.domain.Contact;

public class ContactRowMapper implements RowMapper<Contact> {

	@Override
	public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
		Contact aContact = new Contact();

		aContact.setId(rs.getInt("contact_id"));
		aContact.setName(rs.getString("name"));
		aContact.setEmail(rs.getString("email"));
		aContact.setAddress(rs.getString("address"));
		aContact.setTelephone(rs.getString("telephone"));

		return aContact;
	}
}
