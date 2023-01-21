package com.api.peolpesearcher.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.IDENTITY;
@Data
@AllArgsConstructor
@Entity
public class Searcher  {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Password is required")
    private String password;
    @Email
    @NotEmpty(message = "Email is required")
    private String email;
    private String gender;
    private String phone;
    private String imageURL;
    @Column(nullable = false, updatable = false)
    private String searcherCode;

    public Searcher() {}

    public Searcher(Long id, String name, String email, String gender, String imageURL,String searcherCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.imageURL = imageURL;
        this.searcherCode = searcherCode;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSearcherCode() {
        return searcherCode;
    }

    public void setSearcherCode(String searcherCode) {
        this.searcherCode = searcherCode;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override

    public String toString() {
        return "Searcher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", searcherCode='" + searcherCode + '\'' +
                '}';
    }
}

