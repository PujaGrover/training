package com.sageit.spring.jdbc.dao;

import java.util.List;

import com.sageit.spring.jdbc.domain.Contact;

public interface ContactDAO {
     
    public void saveOrUpdate(Contact contact);
     
    public void delete(int contactId);
     
    public Contact get(int contactId);
     
    public List<Contact> list();
}