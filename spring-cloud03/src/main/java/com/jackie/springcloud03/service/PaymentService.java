package com.jackie.springcloud03.service;


import com.jackie.common.enties.Payment;

public interface PaymentService {

    public int addPayment(Payment payment);

    public Payment getPaymentByid(long id);
}
