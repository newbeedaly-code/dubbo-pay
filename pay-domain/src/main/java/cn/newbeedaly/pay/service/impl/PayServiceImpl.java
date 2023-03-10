package cn.newbeedaly.pay.service.impl;

import cn.newbeedaly.pay.dto.req.PayQueryReqDTO;
import cn.newbeedaly.pay.dto.res.PayQueryResDTO;
import cn.newbeedaly.pay.service.PayService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class PayServiceImpl implements PayService {

    @Override
    public PayQueryResDTO getPayById(PayQueryReqDTO payQueryReqDTO) {
        return PayQueryResDTO.builder().payId(payQueryReqDTO.getPayId()).orderId("1").payStatus("SUCCESS").build();
    }

}
