package ksyun.client.vpc.createipv6publicip.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateIpv6PublicIpRequest
 * @Description 请求参数
 */
@Data
public class CreateIpv6PublicIpRequest {
    /**
     * 弹性网卡的ID
     */
    @KsYunField(name = "NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**
     * Ipv6公网的带宽
     */
    @KsYunField(name = "BandWidth")
    private Integer BandWidth;

    /**
     * Ipv6公网的地址
     */
    @KsYunField(name = "Ipv6PublicIpAddress")
    private String Ipv6PublicIpAddress;

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