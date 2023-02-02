package com.guild.cars.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ContactInfoController {

    @Autowired
    private ContactInfoService contactInfoService;

    @PostMapping("/contact")
    public ContactInfo saveContactInfo(@RequestBody ContactInfo contactInfo) {
        return contactInfoService.saveContactInfo(contactInfo);
    }

    @GetMapping("/contact")
    public List<ContactInfo> findAllContactInfo() {
        return contactInfoService.findAllContactInfo();
    }

    @GetMapping("/contact/{id}")
    public ContactInfo findContactInfoById(@PathVariable Long id) {
        return contactInfoService.findContactInfoById(id);
    }

    @PutMapping("/contact/{id}")
    public ContactInfo updateContactInfo(@PathVariable Long id, @RequestBody ContactInfo contactInfo) {
        contactInfo.setId(id);
        return contactInfoService.updateContactInfo(contactInfo);
    }

    @DeleteMapping("/contact/{id}")
    public void deleteContactInfo(@PathVariable Long id) {
        contactInfoService.deleteContactInfo(id);
    }
}

