package com.jackie.springcloud01.zxing;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("zxing")
public class QrCodeController {

    @GetMapping("/getQrCode")
    public void getQrCode(String content, HttpServletResponse response) {
        Utils.getQrCode(content,response);
    }


}
