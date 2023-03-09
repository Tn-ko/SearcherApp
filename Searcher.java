package com.api.peolpesearcher.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;


@Entity
public class Searcher implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(nullable = false, updatable = false)
        private Long id;
        private String name;
        private String password;
        private String email;
        private String gender;
        private String phone;
        @Column(nullable = false, updatable = false)
        private String searcherCode;




    public Searcher() {}

    public Searcher(Long id, String name, String password, String email, String phone, String gender, String searcherCode) {
            this.id = id;
            this.name = name;
            this.password = password;
            this.email = email;
            this.phone = phone;
            this.gender = gender;
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    @Override

        public String toString() {
            return "Searcher{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", password='" + password + '\'' +
                    ", email='" + email + '\'' +
                    ", gender='" + gender + '\'' +
                    ", phone='" + phone + '\'' +
                    ", searcherCode='" + searcherCode + '\'' +
                    '}';
        }
    }
