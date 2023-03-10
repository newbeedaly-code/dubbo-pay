package cn.newbeedaly.pay.dto.res;

import cn.newbeedaly.pay.dto.req.BaseDTO;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
@Setter
public class PayQueryResDTO extends BaseDTO {

    /**
     * 支付ID
     */
    private String payId;

    /**
     * 订单ID
     */
    private String orderId;

    /**
     * 支付状态
     */
    private String payStatus;

}
