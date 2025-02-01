package com.v4.login.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "vendor")
@NoArgsConstructor
@AllArgsConstructor
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendor_id;

    @Column(nullable = false, unique = true)
    private String email; // Vendor's email (unique)



    @Column(nullable = false)
    private String password; // Password for vendor login

    @Column(nullable = false)
    private String first_name; // Vendor's first name

    @Column(nullable = false)
    private String last_name; // Vendor's last name

    @Column(nullable = false, unique = true)
    private String phone; // Vendor's phone number

    @Column(nullable = false)
    private String address; // Vendor's business address

    @Column(nullable = false)
    private String city; // City of the vendor's address

    @Column(nullable = false)
    private String state; // State of the vendor's address

    @Column(nullable = false)
    private String zip_code; // ZIP/Postal code of the vendor's address

    // Business Information
    @Column(nullable = false)
    private String business_name; // Name of the business

    @Column(nullable = false)
    private String business_type; // Type of business (e.g., retail, wholesale)

    @Column(nullable = false, unique = true)
    private String registration_number; // Business registration number (unique)

    @Column(nullable = false, unique = true)
    private String taxId; // Tax ID for the business (unique)

    @Column(nullable = false)
    private int years_in_business; // Number of years in business

    private String website_url; // Business website URL
}