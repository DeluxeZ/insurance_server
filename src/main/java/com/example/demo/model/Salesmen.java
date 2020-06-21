package com.example.demo.model;

import javax.persistence.*;

@Table
public class Salesmen {
    @Id
    private String jobNumber;

    private String idCard;

    private String sname;

    private String phone;

    private String gender;

    private Integer authority;

    /**
     * @return jobNumber
     */
    public String getJobNumber() {
        return jobNumber;
    }

    /**
     * @param jobNumber
     */
    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
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
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
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
}
