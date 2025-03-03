package ksyun.client.vpc.associatenat.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname AssociateNatRequest
 * @Description 请求参数
 */
@Data
public class AssociateNatRequest {
    /**
     * Nat的ID
     */
    @KsYunField(name = "NatId")
    private String NatId;

    /**
     * 子网的ID
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 要绑定的NatIp的ID值
     */
    @KsYunField(name = "NatIpId")
    private List<String> NatIpIdList;

}