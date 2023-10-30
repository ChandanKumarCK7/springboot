package com.eazybytes.eazyschool.repository;


import com.eazybytes.eazyschool.model.Contact;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface Repo {
    public int saveContactMsg(Contact contact);
    public List<Contact> findMsgsWithStatus(String status);


    public int updateMsgStatus(int contactId, String status,String updatedBy);
}
