package com.eazybytes.eazyschool.service;

import com.eazybytes.eazyschool.constants.EazySchoolConstants;
import com.eazybytes.eazyschool.model.Contact;
import com.eazybytes.eazyschool.repository.ContactRepository;
import com.eazybytes.eazyschool.repository.ContactRepository1;
import com.eazybytes.eazyschool.repository.Repo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/*
@Slf4j, is a Lombok-provided annotation that will automatically generate an SLF4J
Logger static property in the class at compilation time.
* */
@Slf4j
@Service
public class ContactService {

    @Autowired
    private Repo repo;

    @Autowired
    public ContactRepository1 repo1;
    /**
     * Save Contact Details into DB
     * @param contact
     * @return boolean
     */
    public boolean saveMessageDetails(Contact contact){
//        boolean isSaved = false;
//        contact.setStatus(EazySchoolConstants.OPEN);
//        contact.setCreatedBy(EazySchoolConstants.ANONYMOUS);
//        contact.setCreatedAt(LocalDateTime.now());
//        int result = repo.saveContactMsg(contact);
//        if(result>0) {
//            isSaved = true;
//        }
//        return isSaved;

        // CRUDRepo
        System.out.println("CRUDRepo");
        contact.setStatus("0");
        Contact isSaved = repo1.save(contact);
        System.out.println(isSaved);
        return true;
    }

    public List<Contact> findMsgsWithOpenStatus(){
        List<Contact> contactMsgs = repo.findMsgsWithStatus(EazySchoolConstants.OPEN);



        // CRUDRepo
        System.out.println("CRUDRepo");
//        repo.saveContactMsg(contact);
        return contactMsgs;
    }

    public boolean updateMsgStatus(int contactId, String updatedBy){
        boolean isUpdated = false;
        int result = repo.updateMsgStatus(contactId,EazySchoolConstants.CLOSE, updatedBy);
        if(result>0) {
            isUpdated = true;
        }

        // CRUDRepo
        return isUpdated;
    }

}
