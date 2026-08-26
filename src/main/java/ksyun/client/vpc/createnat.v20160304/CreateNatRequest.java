package ksyun.client.vpc.createnat.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateNatRequest
* @Description 请求参数
*/
@Data
public class CreateNatRequest{
    /**Vpc的ID*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**Nat的线路ID
> Nat1.0参数*/
    @KsYunField(name="NatLineId")
    private String NatLineId;

    /**Nat的带宽
> Nat1.0参数,且对应Nat1.0 必传*/
    @KsYunField(name="BandWidth")
    private Integer BandWidth;

    /**Nat的名称*/
    @KsYunField(name="NatName")
    private String NatName;

    /**Nat的类型，目前只支持public*/
    @KsYunField(name="NatType")
    private String NatType;

    /**Nat的IP数量
> Nat1.0参数*/
    @KsYunField(name="NatIpNumber")
    private Integer NatIpNumber;

    /**Nat的映射范围*/
    @KsYunField(name="NatMode")
    private String NatMode;

    /**项目的ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**Nat的计费类型
> Nat1.0参数，当创建Nat2.0时可不传,2.0仅支持`HourlyInstantSettlement`*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**购买时长，计费类型为包年包月时不可缺省。*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;

    /**Nat版本
可选值：
- 1.0
- 2.0
> 2.0具有机房限制，并非全机房支持，具体咨询客服了解*/
    @KsYunField(name="NatVersion")
    private String NatVersion;

}
