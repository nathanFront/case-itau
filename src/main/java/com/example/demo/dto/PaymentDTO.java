package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class PaymentDTO {

    private String client;
    private Double amount;
    private String card;

    private String formPayment;

    private String status;

    private Date datePayment;


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
