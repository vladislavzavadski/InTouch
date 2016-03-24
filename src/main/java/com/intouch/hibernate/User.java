package com.intouch.hibernate;
// Generated 24.03.2016 21:30:48 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private Long id;
     private String firstName;
     private String lastName;
     private byte[] userImage;
     private String login;
     private String password;
     private Date registrationDate;
     private Date lastVisit;
     private String token;
     private Set events = new HashSet(0);
     private Set userEvents = new HashSet(0);
     private Set userSubsesForUser = new HashSet(0);
     private Set userSubsesForSubscriber = new HashSet(0);

    public User() {
    }

	
    public User(String firstName, String lastName, String login, String password, Date registrationDate, Date lastVisit, String token) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.registrationDate = registrationDate;
        this.lastVisit = lastVisit;
        this.token = token;
    }
    public User(String firstName, String lastName, byte[] userImage, String login, String password, Date registrationDate, Date lastVisit, String token, Set events, Set userEvents, Set userSubsesForUser, Set userSubsesForSubscriber) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.userImage = userImage;
       this.login = login;
       this.password = password;
       this.registrationDate = registrationDate;
       this.lastVisit = lastVisit;
       this.token = token;
       this.events = events;
       this.userEvents = userEvents;
       this.userSubsesForUser = userSubsesForUser;
       this.userSubsesForSubscriber = userSubsesForSubscriber;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public byte[] getUserImage() {
        return this.userImage;
    }
    
    public void setUserImage(byte[] userImage) {
        this.userImage = userImage;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getRegistrationDate() {
        return this.registrationDate;
    }
    
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
    public Date getLastVisit() {
        return this.lastVisit;
    }
    
    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }
    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    public Set getEvents() {
        return this.events;
    }
    
    public void setEvents(Set events) {
        this.events = events;
    }
    public Set getUserEvents() {
        return this.userEvents;
    }
    
    public void setUserEvents(Set userEvents) {
        this.userEvents = userEvents;
    }
    public Set getUserSubsesForUser() {
        return this.userSubsesForUser;
    }
    
    public void setUserSubsesForUser(Set userSubsesForUser) {
        this.userSubsesForUser = userSubsesForUser;
    }
    public Set getUserSubsesForSubscriber() {
        return this.userSubsesForSubscriber;
    }
    
    public void setUserSubsesForSubscriber(Set userSubsesForSubscriber) {
        this.userSubsesForSubscriber = userSubsesForSubscriber;
    }




}


