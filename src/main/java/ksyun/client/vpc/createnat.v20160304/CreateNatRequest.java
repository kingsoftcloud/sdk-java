package ksyun.client.vpc.createnat.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateNatRequest
 * @Description 请求参数
 */
@Data
public class CreateNatRequest {
    /**
     * Vpc的ID
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * Nat的线路ID
     */
    @KsYunField(name = "NatLineId")
    private String NatLineId;

    /**
     * Nat的带宽
     */
    @KsYunField(name = "BandWidth")
    private Integer BandWidth;

    /**
     * Nat的名称
     */
    @KsYunField(name = "NatName")
    private String NatName;

    /**
     * Nat的类型，目前只支持public
     */
    @KsYunField(name = "NatType")
    private String NatType;

    /**
     * Nat的IP数量
     */
    @KsYunField(name = "NatIpNumber")
    private Integer NatIpNumber;

    /**
     * Nat的映射范围
     */
    @KsYunField(name = "NatMode")
    private String NatMode;

    /**
     * 项目的ID
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * Nat的计费类型
     */
    @KsYunField(name = "ChargeType")
    private String ChargeType;

    /**
     * 购买时长，计费类型为包年包月时不可缺省。
     */
    @KsYunField(name = "PurchaseTime")
    private Integer PurchaseTime;


}