package com.user.mgmt.model;
 
import java.util.Date;
 
public class User {

       private String userId;
       private String userName;
       private String password;
       private String vertical;
       private String horizontal;
       private String designation;
       private String role;
       private String account;
       private Date dateOfBirth;
 
       public User() {
 
       }
 
       public User(String userId, String password) {
              super();
              this.userId = userId;
              this.password = password;
       }
 
       public User(String userId, String userName, String password, String vertical, String horizontal, String designation,
                     String role, String account, Date dateOfBirth) {
              super();
              this.userId = userId;
              this.userName = userName;
              this.password = password;
              this.vertical = vertical;
              this.horizontal = horizontal;
              this.designation = designation;
              this.role = role;
              this.account = account;
              this.dateOfBirth = dateOfBirth;
       }
 
       public String getUserId() {
              return userId;
       }
 
       public void setUserId(String userId) {
              this.userId = userId;
       }
 
       public String getUserName() {
              return userName;
       }
 
       public void setUserName(String userName) {
              this.userName = userName;
       }
 
       public String getPassword() {
              return password;
       }
 
       public void setPassword(String password) {
              this.password = password;
       }
 
       public String getVertical() {
              return vertical;
       }
 
       public void setVertical(String vertical) {
              this.vertical = vertical;
       }
 
       public String getHorizontal() {
              return horizontal;
       }
 
       public void setHorizontal(String horizontal) {
              this.horizontal = horizontal;
       }
 
       public String getDesignation() {
              return designation;
       }
 
       public void setDesignation(String designation) {
              this.designation = designation;
       }
 
       public String getRole() {
              return role;
       }
 
       public void setRole(String role) {
              this.role = role;
       }
 
       public String getAccount() {
              return account;
       }
 
       public void setAccount(String account) {
              this.account = account;
       }
 
       public Date getDateOfBirth() {
              return dateOfBirth;
       }
 
       public void setDateOfBirth(Date dateOfBirth) {
              this.dateOfBirth = dateOfBirth;
       }
 
       @Override
       public String toString() {
              return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", vertical=" + vertical
                           + ", horizontal=" + horizontal + ", designation=" + designation + ", role=" + role + ", account="
                           + account + ", dateOfBirth=" + dateOfBirth + "]";
       }
 
}