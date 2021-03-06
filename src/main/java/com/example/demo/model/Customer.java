package com.example.demo.model;

import javax.persistence.*;

@Table
public class Customer {
    @Id
    private String idCard;

    private String cname;

    private String birthday;

    private String phone;

    private String gender;

    private Integer authority;

    private String password;

    public Customer(String idCard, String cname, String birthday, String phone, String gender, int authority, String password) {
        this.idCard = idCard;
        this.cname = cname;
        this.birthday = birthday;
        this.password = password;
        this.phone = phone;
        this.gender = gender;
        this.authority = authority;
    }

    /**
     * @return idCard
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * @return cname
     */
    public String getCname() {
        return cname;
    }

    /**
     * @param cname
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * @return birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * @return authority
     */
    public int getAuthority() {
        return authority;
    }

    /**
     * @param authority
     */
    public void setAuthority(int authority) {
        this.authority = authority;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}
