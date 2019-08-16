package com.cpbalance.cpbalancebackend.payment;

import com.cpbalance.cpbalancebackend.exception.InternalErrorException;
import com.cpbalance.cpbalancebackend.person.PersonRepository;
import com.cpbalance.cpbalancebackend.util.DateUtil;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaymentService {

    private PaymentRepository paymentRepository;
    private PersonRepository personRepository;

    public PaymentService(PaymentRepository paymentRepository, PersonRepository personRepository){
        this.paymentRepository = paymentRepository;
        this.personRepository = personRepository;
    }

    public void addPayment(PaymentTO paymentTO){
        Payment newPayment = new Payment();

        System.out.println(paymentTO.getPersonId());

        newPayment.setPerson(personRepository.findById(paymentTO.getPersonId()).orElseThrow(InternalErrorException::new));
        newPayment.setValue(Double.valueOf(paymentTO.getValue()));
        newPayment.setDescription(paymentTO.getDesc());
        newPayment.setDateRegistered(DateUtil.parseLocalDate(LocalDateTime.now()));
        newPayment.setDatePaid(DateUtil.parseLocalDate(paymentTO.getDate()));

        paymentRepository.save(newPayment);
    }
}
