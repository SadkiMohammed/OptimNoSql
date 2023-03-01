package com.program.myApi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
 
@Document("login")
public class Login {
    @Id
    private String id;
    @Field(name = "user")
    @Indexed(unique = true)
    private String user;
    @Field(name = "password")
    private String password;


    public String getId() {
        return id;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
