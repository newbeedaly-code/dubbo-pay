package cn.newbeedaly.pay.order.controller;

import cn.newbeedaly.pay.dto.req.PayQueryReqDTO;
import cn.newbeedaly.pay.dto.res.PayQueryResDTO;
import cn.newbeedaly.pay.service.PayService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/pay")
@RestController
public class PayController {

    @Reference
    private PayService payService;

    @GetMapping(value = "/{payId}")
    public PayQueryResDTO getPayInfoByOrderId(@PathVariable("payId") String payId) {
        PayQueryReqDTO payQueryReqDTO = PayQueryReqDTO.builder().payId(payId).build();
        return payService.getPayById(payQueryReqDTO);
    }
}
