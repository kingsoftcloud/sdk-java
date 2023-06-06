package ksyun.client.vpc.createvpngateway.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateVpnGatewayRequest
* @Description 请求参数
*/
@Data
public class CreateVpnGatewayRequest{
    /**Vpc的ID*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**VPN网关的带宽*/
    @KsYunField(name="BandWidth")
    private Integer BandWidth;

    /**VPN网关的名称*/
    @KsYunField(name="VpnGatewayName")
    private String VpnGatewayName;

    /**项目的ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**VPN网关的计费类型*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**购买时长，计费类型为包年包月时不可缺省。*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;


}