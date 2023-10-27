package com.example.demo.entity;


import com.example.demo.dto.PaymentDTO;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "client")
    private String client;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "card")
    private String card;

    @Column(name = "form_payment")
    private String formPayment;

    @Column(name = "status")
    private String status;

    @Column(name = "date_payment")
    private Date datePayment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getFormPayment() {
        return formPayment;
    }

    public void setFormPayment(String formPayment) {
        this.formPayment = formPayment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDatePayment() {
        return datePayment;
    }

    public void setDatePayment(Date datePayment) {
        this.datePayment = datePayment;
    }
}
