package com.atguigu.springcloud.service;

import com.atguigu.cloud.entities.CommonResult;
import com.atguigu.cloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult
            <Payment> getPaymentById
            (@PathVariable("id") Long id);

    //在CLOUD-PAYMENT-SERVICE服务中找到我们暴露的地址"/payment/feign/timeout"
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentTimeout();
}