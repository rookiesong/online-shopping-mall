package net.suncaper.demo.service;

import net.suncaper.demo.domain.PaymentRecord;

public interface PaymentRecordService {
    public PaymentRecord findPaymentRecord(String orderId);

    public void addPaymentRecord(String recordId,String ordersId,String payingMethod,int amount );

}
