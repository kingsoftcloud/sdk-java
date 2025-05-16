package ksyun.client.vpc.modifynat.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyNatRequest
 * @Description 请求参数
 */
@Data
public class ModifyNatRequest {
    /**
     * Nat的ID
     */
    @KsYunField(name = "NatId")
    private String NatId;

    /**
     * Nat的名称
     */
    @KsYunField(name = "NatName")
    private String NatName;

    /**
     * Nat的带宽
     */
    @KsYunField(name = "BandWidth")
    private Integer BandWidth;

}