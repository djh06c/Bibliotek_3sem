package org.example.library.catalog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String address;
    String contactInfo;

    //Getters
    public Long getId(){return id;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getContactInfo(){return contactInfo;}

    //Setters
    public void setId(Long id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setAddress(String address){this.address = address;}
    public void setContactInfo(String contactInfo){this.contactInfo = contactInfo;}

}
