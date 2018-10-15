package com.example.demo.Entities;


import javax.persistence.*;
import java.util.Set;

@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String FirstName;
    private String LastName;
    private String Login;
    @org.springframework.data.annotation.Transient
    private String Password;

    private String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
