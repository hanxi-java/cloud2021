package com.atguigu.springcloud.service;

import com.atguigu.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
//@Mapper
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
