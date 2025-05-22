package ksyun.client.vpc.disassociatenat.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DisassociateNatRequest
 * @Description 请求参数
 */
@Data
public class DisassociateNatRequest {
    /**
     * Nat的ID
     */
    @KsYunField(name = "NatId")
    private String NatId;

    /**
     * 子网的ID
     */
    @KsYunField(name="SubnetId")
    private String SubnetId;

}