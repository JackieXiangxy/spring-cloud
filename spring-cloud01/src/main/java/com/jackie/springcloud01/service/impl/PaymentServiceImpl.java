package com.jackie.springcloud01.service.impl;

import com.jackie.common.enties.Payment;
import com.jackie.springcloud01.mapper.PaymantMapper;
import com.jackie.springcloud01.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymantMapper paymantMapper;

    public int addPayment(Payment payment) {
        return paymantMapper.create(payment);
    }

    public Payment getPaymentByid(long id) {
        return paymantMapper.getPaymentByid(id);
    }
}
