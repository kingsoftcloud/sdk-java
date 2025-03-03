package ksyun.client.vpc.deletenatip.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteNatIpRequest
 * @Description 请求参数
 */
@Data
public class DeleteNatIpRequest {
    /**
     * Nat的ID
     */
    @KsYunField(name = "NatId")
    private String NatId;

    /**
     * Nat IP的ID
     */
    @KsYunField(name = "NatIpId")
    private String NatIpId;


}