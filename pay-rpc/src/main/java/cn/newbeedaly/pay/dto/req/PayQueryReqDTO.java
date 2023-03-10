package cn.newbeedaly.pay.dto.req;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
@Setter
public class PayQueryReqDTO extends BaseDTO {

    /**
     * 支付ID
     */
    @NotBlank(message = "支付ID不能不能为空")
    private String payId;

}
