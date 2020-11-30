package com.jackie.springcloud01.controller;

import com.jackie.springcloud01.service.PaymentService;
import com.jackie.common.enties.CommonResult;
import com.jackie.common.enties.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPosrt;

    @Autowired
    private DiscoveryClient discoveryClient;


    @PostMapping("/create")
    public CommonResult createPayment(@RequestBody Payment payment){
      int res=  paymentService.addPayment(payment);

      if (res>0){
          return new CommonResult(200,"数据添加成功,serverPosrt"+serverPosrt,res);
      }else {
          return new CommonResult(300,"数据添加失败,serverPosrt"+serverPosrt,null);
      }

    }

    @GetMapping("/get/{id}")
    public CommonResult getPayment(@PathVariable("id") String id){
        Payment payment = paymentService.getPaymentByid(Long.valueOf(id));
        if (payment!=null){
            return  new CommonResult(200,"数据查询成功,serverPosrt"+serverPosrt,payment);
        }else {
            return new CommonResult(444,"数据查询失败,serverPosrt"+serverPosrt,null);
        }
    }

    @GetMapping("/discoverClient")
    public Object discover(){
        List<String> services = discoveryClient.getServices();
        services.forEach(server->{
            log.info("server信息："+server.toString());

            //获取当前服务对象的信息
            discoveryClient.getInstances(server).forEach(serviceInstance -> {
                log.info(serviceInstance.getInstanceId()+"\t"+serviceInstance.getHost()
                        +"\t"+serviceInstance.getUri()+"\t"+serviceInstance.getPort());
            });

        });

        return this.discoveryClient;
    }



}
