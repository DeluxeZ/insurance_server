package com.example.demo.model;

import javax.persistence.*;

@Table(name = "case_info")
public class InsuranceType {
    @Id
    private Integer id;

    private String iname;

    private String ageStart;

    private String ageEnd;

    private String benefit;

    private String payment;

    private Integer premium;

    private String advantage;

    public InsuranceType() {

    }

    public InsuranceType(int id, String iname, String ageStart, String ageEnd,
                         String benefit, String payment, int premium, String advantage) {
        this.id = id;
        this.iname = iname;
        this.ageStart = ageStart;
        this.ageEnd = ageEnd;
        this.benefit = benefit;
        this.payment = payment;
        this.premium = premium;
        this.advantage = advantage;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return iname
     */
    public String getIname() {
        return iname;
    }

    /**
     * @param iname
     */
    public void setIname(String iname) {
        this.iname = iname == null ? null : iname.trim();
    }

    /**
     * @return ageStart
     */
    public String getAgeStart() {
        return ageStart;
    }

    /**
     * @param ageStart
     */
    public void setAgeStart(String ageStart) {
        this.ageStart = ageStart == null ? null : ageStart.trim();
    }

    /**
     * @return ageEnd
     */
    public String getAgeEnd() {
        return ageEnd;
    }

    /**
     * @param ageEnd
     */
    public void setAgeEnd(String ageEnd) {
        this.ageEnd = ageEnd == null ? null : ageEnd.trim();
    }

    /**
     * @return benefit
     */
    public String getBenefit() {
        return benefit;
    }

    /**
     * @param benefit
     */
    public void setBenefit(String benefit) {
        this.benefit = benefit == null ? null : benefit.trim();
    }

    /**
     * @return payment
     */
    public String getPayment() {
        return payment;
    }

    /**
     * @param payment
     */
    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    /**
     * @return premium
     */
    public int getPremium() {
        return premium;
    }

    /**
     * @param premium
     */
    public void setPremium(int premium) {
        this.premium = premium;
    }

    /**
     * @return advantage
     */
    public String getAdvantage() {
        return advantage;
    }

    /**
     * @param advantage
     */
    public void setAdvantage(String advantage) {
        this.advantage = advantage == null ? null : advantage.trim();
    }
}