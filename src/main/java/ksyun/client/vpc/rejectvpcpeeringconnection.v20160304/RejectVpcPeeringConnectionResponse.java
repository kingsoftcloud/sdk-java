package ksyun.client.vpc.rejectvpcpeeringconnection.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RejectVpcPeeringConnectionResponse
* @Description RejectVpcPeeringConnection 返回体
*/
@Data
@ToString
public class RejectVpcPeeringConnectionResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**对等连接的信息*/
    @JsonProperty("VpcPeeringConnection")
    private VpcPeeringConnectionDto VpcPeeringConnection;

    @Data
    @ToString
    public static class VpcPeeringConnectionDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**对等连接的ID*/
        @JsonProperty("VpcPeeringConnectionId")
        private String VpcPeeringConnectionId;

        /**Vpc的对等连接类型*/
        @JsonProperty("VpcPeeringConnectionType")
        private String VpcPeeringConnectionType;

        /**peering的名称*/
        @JsonProperty("PeeringName")
        private String PeeringName;

        /**peering的状态，申请中（pending-acceptance）状态的只能由发起端删除，已连接（active ）状态的发起端和接受端都可以删除，已拒绝（rejected ），连接失败（failed ）是对端网段重复或其他异常的导致失败的状态，已过期（expired ），连接中（provisioning ）是对方已经接受，对等连接联通的状态*/
        @JsonProperty("State")
        private String State;

        /**对等连接的带宽上限，单位Mbps*/
        @JsonProperty("BandWidth")
        private Integer BandWidth;

        /**Peering发起端Vpc的信息*/
        @JsonProperty("RequesterVpcInfo")
        private VpcPeeringConnectionDtoRequesterVpcInfoDto RequesterVpcInfo;

        @Data
        @ToString
        public static class VpcPeeringConnectionDtoRequesterVpcInfoDto {
            /**发起端账号ID*/
            @JsonProperty("AccountId")
            private String AccountId;

            /**发起端Vpc的region*/
            @JsonProperty("Region")
            private String Region;

            /**发起端Vpc的ID*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**发起端Vpc的名称*/
            @JsonProperty("VpcName")
            private String VpcName;

            /**发起端Vpc的网段信息*/
            @JsonProperty("CidrBlock")
            private String CidrBlock;

            /**发起端VPC的对等连接ID*/
            @JsonProperty("VpcPeeringConnectionId")
            private String VpcPeeringConnectionId;

        }

        /**Peering接受端Vpc信息*/
        @JsonProperty("AccepterVpcInfo")
        private VpcPeeringConnectionDtoAccepterVpcInfoDto AccepterVpcInfo;

        @Data
        @ToString
        public static class VpcPeeringConnectionDtoAccepterVpcInfoDto {
            /**接受端账号ID*/
            @JsonProperty("AccountId")
            private String AccountId;

            /**接受端Vpc的region*/
            @JsonProperty("Region")
            private String Region;

            /**接受端Vpc的ID*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**接受端Vpc的名称*/
            @JsonProperty("VpcName")
            private String VpcName;

            /**接受端Vpc的网段信息*/
            @JsonProperty("CidrBlock")
            private String CidrBlock;

            /**接受端Vpc的对等连接ID*/
            @JsonProperty("VpcPeeringConnectionId")
            private String VpcPeeringConnectionId;

        }

        /**项目制ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**计费方式*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**服务结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

    }

}
