package ksyun.client.vpc.deletenat.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteNatRequest
 * @Description 请求参数
 */
@Data
public class DeleteNatRequest {
    /**
     * Nat的ID
     */
    @KsYunField(name = "NatId")
    private String NatId;

}