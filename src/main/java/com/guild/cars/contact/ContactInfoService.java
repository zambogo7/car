package com.guild.cars.contact;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactInfoService {

    @Autowired
    private ContactInfoRepository contactInfoRepository;

    public ContactInfo saveContactInfo(ContactInfo contactInfo) {
        return contactInfoRepository.save(contactInfo);
    }

    public List<ContactInfo> findAllContactInfo() {
        return contactInfoRepository.findAll();
    }

    public ContactInfo findContactInfoById(Long id) {
        return contactInfoRepository.findById(id).orElse(null);
    }

    public void deleteContactInfo(Long id) {
        contactInfoRepository.deleteById(id);
    }

    public ContactInfo updateContactInfo(ContactInfo contactInfo) {
        ContactInfo existingContactInfo = findContactInfoById(contactInfo.getId());
        if (existingContactInfo == null) {
            return null;
        }
        existingContactInfo.setName(contactInfo.getName());
        existingContactInfo.setPhone(contactInfo.getPhone());
        existingContactInfo.setEmail(contactInfo.getEmail());
        existingContactInfo.setMessage(contactInfo.getMessage());
        return contactInfoRepository.save(existingContactInfo);
    }
}


