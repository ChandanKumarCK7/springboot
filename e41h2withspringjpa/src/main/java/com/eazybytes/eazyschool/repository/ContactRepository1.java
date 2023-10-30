package com.eazybytes.eazyschool.repository;


import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.rommappers.ContactRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ContactRepository1 extends JpaRepository<Contact, Long>  {



    public Contact save(Contact contact);

    public Contact findContactByStatus(String status);

}
