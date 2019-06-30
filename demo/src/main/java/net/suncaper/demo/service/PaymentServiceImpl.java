package net.suncaper.demo.service;

import net.suncaper.demo.domain.Payment;
import net.suncaper.demo.domain.PaymentExample;
import net.suncaper.demo.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    @Override
    public List<Payment> allPayment() {
        PaymentExample example =  new PaymentExample();
        return paymentMapper.selectByExample(example);
    }
}
