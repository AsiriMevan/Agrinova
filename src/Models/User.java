/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Vishmi
 */
public class User {

    public static String userID;
    public static String userName;
    public static String email;
    public  String nic;
    public static String password;
    public  String con_password;
    public static String role;
    public  String contactNo;

    public User(String userID, String userName, String email, String nic, String password, String con_password, String role, String contactNo) {
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.nic = nic;
        this.password = password;
        this.con_password = con_password;
        this.role = role;
        this.contactNo = contactNo;
    }

    public String getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getNic() {
        return nic;
    }

    public String getPassword() {
        return password;
    }

    public String getCon_password() {
        return con_password;
    }

    public String getRole() {
        return role;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCon_password(String con_password) {
        this.con_password = con_password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

}
