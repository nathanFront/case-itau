package com.example.demo.service;

import com.example.demo.dto.PaymentDTO;
import com.example.demo.entity.Payment;
import com.example.demo.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    JavaMailSender javaMailSender;


    public List<Payment> getPayments(){
        return paymentRepository.findAll();
    }

    public Optional<Payment> getPaymentById(Integer id){
        return paymentRepository.findById(id);
    }

    public Payment makePayment(Payment payment){
        return paymentRepository.save(payment);
    }

    public boolean cancelPayment(Integer id){
        if(paymentRepository.existsById(id)){
            paymentRepository.deleteById(id);
            return true;
        }else
        {
            return false;
        }

    }

    public void sendEmail(){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("borges10nathan@gmail.com");
        mailMessage.setSubject("Itau feito pra voce");
        mailMessage.setText("Itau unibanco Renegocia Ja");
        javaMailSender.send(mailMessage);
    }

}
