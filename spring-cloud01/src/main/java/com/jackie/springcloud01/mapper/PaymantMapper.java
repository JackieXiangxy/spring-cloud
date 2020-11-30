package com.jackie.springcloud01.mapper;

import com.jackie.common.enties.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymantMapper {

    public int create(Payment payment);

    public Payment getPaymentByid(@Param("id") long id);
}
