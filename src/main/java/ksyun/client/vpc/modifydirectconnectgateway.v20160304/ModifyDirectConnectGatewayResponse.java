package ksyun.client.vpc.modifydirectconnectgateway.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyDirectConnectGatewayResponse
* @Description ModifyDirectConnectGateway 返回体
*/
@Data
@ToString
public class ModifyDirectConnectGatewayResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**边界网关的信息*/
    @JsonProperty("DirectConnectGateway")
    private DirectConnectGatewayDto DirectConnectGateway;

    @Data
    @ToString
    public static class DirectConnectGatewayDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**边界网关的ID*/
        @JsonProperty("DirectConnectGatewayId")
        private String DirectConnectGatewayId;

        /**Nat的ID*/
        @JsonProperty("NatId")
        private String NatId;

        /**连接通道的ID*/
        @JsonProperty("DirectConnectInterfaceId")
        private String DirectConnectInterfaceId;

        /**边界网关的名称*/
        @JsonProperty("DirectConnectGatewayName")
        private String DirectConnectGatewayName;

        /**边界网关的带宽*/
        @JsonProperty("BandWidth")
        private Integer BandWidth;

        /**关联的实例的类型*/
        @JsonProperty("AssociatedInstanceType")
        private String AssociatedInstanceType;

        /**云企业网的用户ID*/
        @JsonProperty("CenAccountId")
        private String CenAccountId;

        /**边界网关的状态*/
        @JsonProperty("Status")
        private String Status;

        /**云企业网ID*/
        @JsonProperty("CenId")
        private String CenId;

        /**对端的网段*/
        @JsonProperty("RemoteCidrSet")
        private List<String> RemoteCidrSet;

        /**额外的网段*/
        @JsonProperty("ExtraCidrSet")
        private List<String> ExtraCidrSet;

        /**版本号*/
        @JsonProperty("Version")
        private String Version;

        /**连接通道列表*/
        @JsonProperty("DirectConnectInterfaceInfoSet")
        private List<DirectConnectInterfaceInfoSetDto> DirectConnectInterfaceInfoSet;

        @Data
        @ToString
        public static class DirectConnectInterfaceInfoSetDto {
            /**连接通道的ID*/
            @JsonProperty("DirectConnectInterfaceId")
            private String DirectConnectInterfaceId;

        }

    }

}
