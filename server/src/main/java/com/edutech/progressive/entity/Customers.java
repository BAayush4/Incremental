package com.edutech.progressive.entity;

public class Customers implements Comparable<Customers> {

private int customerId;
private String name;
private String email;
private String username;
private String password;
private String role;
public int getCutomerId() {
    return customerId;
}
public void setCustomerId(int cutomerId) {
    this.customerId = cutomerId;
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
public String getRole() {
    return role;
}
public void setRole(String role) {
    this.role = role;
}
public Customers(int cutomerId, String name, String email, String username, String password, String role) {
    this.customerId = cutomerId;
    this.name = name;
    this.email = email;
    this.username = username;
    this.password = password;
    this.role = role;
}
public Customers() {
}
@Override
public int compareTo(Customers o) {
    return this.getName().compareToIgnoreCase(o.getName());
}




}


/*
CREATE TABLE customers (
customer_id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
username VARCHAR(255) NOT NULL,
password VARCHAR(255) NOT NULL,
role VARCHAR(255));

CREATE TABLE accounts (
account_id INT AUTO_INCREMENT PRIMARY KEY,
customer_id INT NOT NULL,
balance DECIMAL(10, 2) NOT NULL):



CREATE TABLE transactions (
transaction_id INT AUTO_INCREMENT PRIMARY KEY,
account_id INT NOT NULL,
amount DECIMAL(10, 2) NOT NULL,
transaction_date TIMESTAMP NOT NULL,
transaction_type VARCHAR(255) NOT NULL);


*/