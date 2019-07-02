package net.suncaper.demo.service;

import net.suncaper.demo.domain.PaymentRecord;
import net.suncaper.demo.domain.PaymentRecordExample;
import net.suncaper.demo.mapper.PaymentRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentRecordServiceImpl implements PaymentRecordService {
    @Autowired
    private PaymentRecordMapper paymentRecordMapper;
    @Override
    public PaymentRecord findPaymentRecord(String ordersId) {
        PaymentRecordExample example = new PaymentRecordExample();
        example.createCriteria().andOrdersIdEqualTo(ordersId);
        return paymentRecordMapper.selectByExample(example).get(0);
    }
}
