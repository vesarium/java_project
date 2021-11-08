package com.company.optionals;

import java.util.Optional;

public class User {
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String phone;


    public User(int id, String fname, String lname, String email, String phone) {
        this.id = id;
        this.fname = Optional.ofNullable(fname).orElse("default");
        this.lname = lname;
        this.email = email;
        this.phone = phone;

    }


    public boolean getEmail() {
        return Optional.ofNullable(email).isPresent();

    }

    public String getFname() {
        return fname;
    }

    public boolean ifFname(){
        return fname.isEmpty();
    }

    public String getPhone() {
        return Optional.ofNullable(this.phone).orElse("Phone number is not provided");
        //return Optional.ofNullable(this.phone).orElseThrow(() -> new RuntimeException("Phone number is not provided"));
    }
}
