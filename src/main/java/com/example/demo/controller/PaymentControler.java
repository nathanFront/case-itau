package com.example.demo.controller;


import com.example.demo.entity.Payment;
import com.example.demo.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reneg")
public class PaymentControler {

    @Autowired
    PaymentService paymentService;

    @Autowired
    private JavaMailSender smtpService;

    @GetMapping("/list")
    public List<Payment> getAllPayaments(){
        return paymentService.getPayments();
    }


    @GetMapping("/getPayment/{id}")
    public ResponseEntity<Optional<Payment>> getPaymentById(@PathVariable Integer id){
        return new ResponseEntity<>(paymentService.getPaymentById(id), HttpStatus.OK);
    }

    @PostMapping("/makePayment")
    public ResponseEntity<Payment> makePayment(@RequestBody Payment payment){
        paymentService.sendEmail();
        return new ResponseEntity<>(paymentService.makePayment(payment), HttpStatus.OK);
    }


    @DeleteMapping("/cancel/{id}")
    public ResponseEntity<?> cancelPayment(@PathVariable Integer id) {
        Boolean deleted = paymentService.cancelPayment(id);
        if(deleted){
            return new ResponseEntity<>("Registro cancelado com sucesso", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Registro não encontrado", HttpStatus.NOT_FOUND);
        }
    }


}
