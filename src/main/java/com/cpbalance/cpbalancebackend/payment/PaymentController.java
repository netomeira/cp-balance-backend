package com.cpbalance.cpbalancebackend.payment;

import com.cpbalance.cpbalancebackend.exception.InternalErrorException;
import com.cpbalance.cpbalancebackend.exception.NoContentException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PaymentController {

    private PaymentService paymentService;
    private PaymentRepository paymentRepository;

    public PaymentController(PaymentRepository paymentRepository, PaymentService paymentService){
        this.paymentRepository = paymentRepository;
        this.paymentService = paymentService;
    }

    @GetMapping("/payment/{id}")
    public Payment searchById(@PathVariable Long id){
        return paymentRepository.findById(id).orElseThrow(NoContentException::new);
    }

    @GetMapping("/payment")
    public List<Payment> listAll() {
        return paymentRepository.findAll();
    }

    @PostMapping("/payment")
    public void add(@RequestBody PaymentTO payment){
        paymentService.addPayment(payment);
    }
}
