package ksyun.client.pdns.createendpoint.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateEndPointResponse
* @Description CreateEndPoint 返回体
*/
@Data
@ToString
public class CreateEndPointResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**出站节点信息*/
    @JsonProperty("EndPoint")
    private EndPointDto EndPoint;

    @Data
    @ToString
    public static class EndPointDto {
        /**出站节点的ID*/
        @JsonProperty("EndPointId")
        private String EndPointId;

        /**出站节点所属的机房*/
        @JsonProperty("Region")
        private String Region;

        /**出站节点名称*/
        @JsonProperty("EndPointName")
        private String EndPointName;

        /**出站节点类型（目前仅支持OUTBAND）*/
        @JsonProperty("Type")
        private String Type;

        /**出站节点绑定的出站VpcId*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**出站节点绑定的安全组ID*/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /**所绑定的转发Zone的ID列表*/
        @JsonProperty("FdZoneIds")
        private List<String> FdZoneIds;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**出站节点的状态,building | active | error | updating | deleting | updatingError*/
        @JsonProperty("Status")
        private String Status;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

        /**所绑定的VPC的信息*/
        @JsonProperty("IpConfigSet")
        private List<EndPointIpConfigSetDto> IpConfigSet;

        @Data
        @ToString
        public static class EndPointIpConfigSetDto {
            /**可用区*/
            @JsonProperty("AvailabilityZone")
            private String AvailabilityZone;

            /**子网ID*/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /**子网下IP*/
            @JsonProperty("Ip")
            private String Ip;

        }

    }

}
