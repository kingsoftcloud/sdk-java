package ksyun.client.vpc.describenetworkacls.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNetworkAclsResponse
* @Description DescribeNetworkAcls 返回体
*/
@Data
@ToString
public class DescribeNetworkAclsResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**ACL列表信息*/
    @JsonProperty("NetworkAclSet")
    private List<NetworkAclSetDto> NetworkAclSet;

    @Data
    @ToString
    public static class NetworkAclSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**ACL的名称*/
        @JsonProperty("NetworkAclName")
        private String NetworkAclName;

        /**ACL的ID*/
        @JsonProperty("NetworkAclId")
        private String NetworkAclId;

        /**ACL的描述*/
        @JsonProperty("Description")
        private String Description;

        /**ACL规则信息*/
        @JsonProperty("NetworkAclEntrySet")
        private List<NetworkAclSetDtoNetworkAclEntrySetDto> NetworkAclEntrySet;

        @Data
        @ToString
        public static class NetworkAclSetDtoNetworkAclEntrySetDto {
            /**ACL的描述*/
            @JsonProperty("Description")
            private String Description;

            /**ACL的ID*/
            @JsonProperty("NetworkAclId")
            private String NetworkAclId;

            /**ACL规则ID*/
            @JsonProperty("NetworkAclEntryId")
            private String NetworkAclEntryId;

            /**ACL规则的网段*/
            @JsonProperty("CidrBlock")
            private String CidrBlock;

            /**ACL规则优先级，数字越小优先级越高*/
            @JsonProperty("RuleNumber")
            private Integer RuleNumber;

            /**ACL规则方向，in为入站规则，out为出站规则*/
            @JsonProperty("Direction")
            private String Direction;

            /**ACL规则行为，allow为允许，deny为拒绝*/
            @JsonProperty("RuleAction")
            private String RuleAction;

            /**协议，IP代表所有协议*/
            @JsonProperty("Protocol")
            private String Protocol;

            /**ICMP协议，ICMP类型*/
            @JsonProperty("IcmpType")
            private Integer IcmpType;

            /**ICMP协议，ICMP代码*/
            @JsonProperty("IcmpCode")
            private Integer IcmpCode;

            /**TCP或UDP协议的端口规则起始端口*/
            @JsonProperty("PortRangeFrom")
            private Integer PortRangeFrom;

            /**TCP或UDP协议的端口规则结束端口*/
            @JsonProperty("PortRangeTo")
            private Integer PortRangeTo;

        }

    }

}
