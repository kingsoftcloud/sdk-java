package ksyun.client.epc.describeprice.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribePriceRequest
 * @Description 请求参数
 */
@Data
public class DescribePriceRequest {
    /**
     * 主机计费类型，包年包月Monthly，按日月结Daily
     * -有效值：Monthly|Daily|PostPaidByDay|PrePaidByMonth
     */
    @KsYunField(name = "ChargeType")
    private String ChargeType;

    /**
     * 物理机类型
     */
    @KsYunField(name = "HostType")
    private String HostType;

    /**
     * 可用区的名称
     */
    @KsYunField(name = "AvailabilityZone")
    private String AvailabilityZone;

    /**
     * 购买时长，计费类型为包年包月时不可缺省。
     */
    @KsYunField(name = "PurchaseTime")
    private Integer PurchaseTime;

    /**
     * 购买的数量
     */
    @KsYunField(name = "Amount")
    private Integer Amount;

}