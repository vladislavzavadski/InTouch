package com.mycompany.intouch_serv;
// Generated 21.02.2016 14:56:57 by Hibernate Tools 4.3.1



/**
 * UserSuscriber generated by hbm2java
 */
public class UserSuscriber  implements java.io.Serializable {


     private Long id;
     private long userId;
     private long subscriberId;

    public UserSuscriber() {
    }

    public UserSuscriber(long userId, long subscriberId) {
       this.userId = userId;
       this.subscriberId = subscriberId;
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public long getUserId() {
        return this.userId;
    }
    
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public long getSubscriberId() {
        return this.subscriberId;
    }
    
    public void setSubscriberId(long subscriberId) {
        this.subscriberId = subscriberId;
    }




}


