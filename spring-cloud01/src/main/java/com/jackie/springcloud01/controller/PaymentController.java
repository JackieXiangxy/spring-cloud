package com.jackie.springcloud01.controller;

import com.jackie.springcloud01.service.PaymentService;
import com.jackie.common.enties.CommonResult;
import com.jackie.common.enties.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;



    @PostMapping("/create")
    public CommonResult createPayment(@RequestBody Payment payment){
      int res=  paymentService.addPayment(payment);

      if (res>0){
          return new CommonResult(200,"数据添加成功",res);
      }else {
          return new CommonResult(300,"数据添加失败",null);
      }

    }

    @GetMapping("/get/{id}")
    public CommonResult getPayment(@PathVariable("id") long id){
        Payment payment = paymentService.getPaymentByid(id);
        if (payment!=null){
            return  new CommonResult(200,"数据查询成功",payment);
        }else {
            return new CommonResult(444,"数据查询失败",null);
        }
    }



}
