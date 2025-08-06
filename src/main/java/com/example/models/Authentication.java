
package com.example.models;

import jakarta.persistence.*;

@Entity
@Table(name = "authentication")
public class Authentication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authId;

    @Column(nullable = false, unique = true, length = 80)
    private String username; // email

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String confirmpassword;

    @OneToOne
    @JoinColumn(name = "cust_id", referencedColumnName = "custId")
    private Customer customer; // optional at signup

    // Getters and Setters

    public int getAuthId() {
        return authId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
