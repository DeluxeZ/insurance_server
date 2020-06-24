package com.example.demo.model;

import javax.persistence.*;

@Table
public class Policy {
    @Id
    private String pid;

    private String date;

    private String hName;

    private String hGender;

    private String hBir;

    private String hIdCard;

    private String hAddress;

    private String hZipCode;

    private String aName;

    private String aGender;

    private String aBir;

    private String aIdCard;

    private String aAddress;

    private String aZipCode;

    private int iId;

    private String iName;

    private String jobNumber;

    private String sName;

    private String sPhone;

    private String bName1;

    private int bNumber1;

    private String bIdCard1;

    private String bName2;

    private int bNumber2;

    private String bIdCard2;

    private int status;

    public Policy(){

    }

    public Policy(String pid, String date, String hName, String hGender, String hBir, String hIdCard, String hAddress, String hZipCode, String aName, String aGender, String aBir, String aIdCard, String aAddress, String aZipCode, int iId, String iName, String jobNumber, String sName, String sPhone, String bName1, int bNumber1, String bIdCard1, String bName2, int bNumber2, String bIdCard2, int status) {
        this.pid = pid;
        this.date = date;
        this.hName = hName;
        this.hGender = hGender;
        this.hBir = hBir;
        this.hIdCard = hIdCard;
        this.hAddress = hAddress;
        this.hZipCode = hZipCode;
        this.aName = aName;
        this.aGender = aGender;
        this.aBir = aBir;
        this.aIdCard = aIdCard;
        this.aAddress = aAddress;
        this.aZipCode = aZipCode;
        this.iId = iId;
        this.iName = iName;
        this.jobNumber = jobNumber;
        this.sName = sName;
        this.sPhone = sPhone;
        this.bName1 = bName1;
        this.bNumber1 = bNumber1;
        this.bIdCard1 = bIdCard1;
        this.bName2 = bName2;
        this.bNumber2 = bNumber2;
        this.bIdCard2 = bIdCard2;
        this.status = status;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getHName() {
        return hName;
    }

    public String getHGender() {
        return hGender;
    }

    public String getHBir() {
        return hBir;
    }

    public String getHIdCard() {
        return hIdCard;
    }

    public String getHAddress() {
        return hAddress;
    }

    public String getHZipCode() {
        return hZipCode;
    }

    public String getAName() {
        return aName;
    }

    public String getAGender() {
        return aGender;
    }

    public String getABir() {
        return aBir;
    }

    public String getAIdCard() {
        return aIdCard;
    }

    public String getAAddress() {
        return aAddress;
    }

    public String getAZipCode() {
        return aZipCode;
    }

    public int getIId() {
        return iId;
    }

    public String getIName() {
        return iName;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public String getSName() {
        return sName;
    }

    public String getSPhone() {
        return sPhone;
    }

    public String getBName1() {
        return bName1;
    }

    public int getBNumber1() {
        return bNumber1;
    }

    public String getBIdCard1() {
        return bIdCard1;
    }

    public String getBName2() {
        return bName2;
    }

    public int getBNumber2() {
        return bNumber2;
    }

    public String getBIdCard2() {
        return bIdCard2;
    }

    public int getStatus() {
        return status;
    }

    public void setHName(String hName) {
        this.hName = hName == null ? null : hName.trim();
    }

    public void setHGender(String hGender) {
        this.hGender = hGender == null ? null : hGender.trim();
    }

    public void setHBir(String hBir) {
        this.hBir = hBir == null ? null : hBir.trim();
    }

    public void sethIdCard(String hIdCard) {
        this.hIdCard = hIdCard == null ? null : hIdCard.trim();
    }

    public void setHAddress(String hAddress) {
        this.hAddress = hAddress == null ? null : hAddress.trim();
    }

    public void setHZipCode(String hZipCode) {
        this.hZipCode = hZipCode == null ? null : hZipCode.trim();
    }

    public void setAName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public void setAGender(String aGender) {
        this.aGender = aGender == null ? null : aGender.trim();
    }

    public void setABir(String aBir) {
        this.aBir = aBir == null ? null : aBir.trim();
    }

    public void setAIdCard(String aIdCard) {
        this.aIdCard = aIdCard == null ? null : aIdCard.trim();
    }

    public void setAAddress(String aAddress) {
        this.aAddress = aAddress == null ? null : aAddress.trim();
    }

    public void setAZipCode(String aZipCode) {
        this.aZipCode = aZipCode == null ? null : aZipCode.trim();
    }

    public void setIId(int iId) {
        this.iId = iId;
    }

    public void setIName(String iName) {
        this.iName = iName == null ? null : iName.trim();
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber == null ? null : jobNumber.trim();
    }

    public void setSName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public void setSPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public void setBName1(String bName1) {
        this.bName1 = bName1 == null ? null : bName1.trim();
    }

    public void setBNumber1(int bNumber1) {
        this.bNumber1 = bNumber1;
    }

    public void setBIdCard1(String bIdCard1) {
        this.bIdCard1 = bIdCard1 == null ? null : bIdCard1.trim();
    }

    public void setBName2(String bName2) {
        this.bName2 = bName2 == null ? null : bName2.trim();
    }

    public void setBNumber2(int bNumber2) {
        this.bNumber2 = bNumber2;
    }

    public void setBIdCard2(String bIdCard2) {
        this.bIdCard2 = bIdCard2 == null ? null : bIdCard2.trim();
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
