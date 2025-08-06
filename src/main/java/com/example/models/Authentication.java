<<<<<<< HEAD
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
=======
package com.example.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
@Entity
@Table(name = "authentication")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Authentication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authId;

    @Column(nullable = false, unique = true, length = 80)
    private String username;  // typically the email or user ID

    @Column(nullable = false)
    private String password;

   
    @Column(nullable = false)
    private boolean enabled = true;  

    @OneToOne
    @JoinColumn(name = "cust_id", referencedColumnName = "custId")
    private Customer customer;
}
>>>>>>> 48697232c3c3a8a21e62f23700a5e4ed9eb3ad59
