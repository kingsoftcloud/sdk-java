package ksyun.client.vpc.createvpngateway.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateVpnGatewayResponse
* @Description CreateVpnGateway 返回体
*/
@Data
@ToString
public class CreateVpnGatewayResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**Vpn网关信息*/
    @JsonProperty("VpnGateway")
    private VpnGatewayDto VpnGateway;

    @Data
    @ToString
    public static class VpnGatewayDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**VPN网关的ID*/
        @JsonProperty("VpnGatewayId")
        private String VpnGatewayId;

        /**VPN网关的名称*/
        @JsonProperty("VpnGatewayName")
        private String VpnGatewayName;

        /**VPN网关的带宽*/
        @JsonProperty("BandWidth")
        private Integer BandWidth;

        /**VPN网关的公网IP*/
        @JsonProperty("GatewayAddress")
        private String GatewayAddress;

        /**HA模式VPN网关的公网IP*/
        @JsonProperty("HaGatewayAddress")
        private String HaGatewayAddress;

        /**Vpn网关设备类型*/
        @JsonProperty("VpnSwitchType")
        private String VpnSwitchType;

        /**项目的ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**VPN网关的计费类型*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**服务结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**版本信息*/
        @JsonProperty("VpnGatewayVersion")
        private String VpnGatewayVersion;

    }

}
