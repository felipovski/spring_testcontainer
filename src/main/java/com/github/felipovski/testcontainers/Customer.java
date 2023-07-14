package com.github.felipovski.testcontainers;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String name;
        String email;
        String phone;
        String address;

        public Customer() {
        }

        public Customer(String name, String email, String phone, String address) {
                this.name = name;
                this.email = email;
                this.phone = phone;
                this.address = address;
        }
        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }
}
