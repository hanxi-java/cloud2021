package com.atguigu.springcloud.alibaba.service;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<Payment>(444, "fallback");
    }
}