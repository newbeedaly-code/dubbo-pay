package cn.newbeedaly.pay.service;

import cn.newbeedaly.pay.dto.req.PayQueryReqDTO;
import cn.newbeedaly.pay.dto.res.PayQueryResDTO;

public interface PayService {

    PayQueryResDTO getPayById(PayQueryReqDTO payQueryReqDTO);

}
