package ksyun.client.slb.describeloadbalanceracls.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeLoadBalancerAclsResponse
* @Description DescribeLoadBalancerAcls 返回体
*/
@Data
@ToString
public class DescribeLoadBalancerAclsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**LoadBalancerAcl的信息*/
    @JsonProperty("LoadBalancerAclSet")
    private List<LoadBalancerAclSetDto> LoadBalancerAclSet;

    @Data
    @ToString
    public static class LoadBalancerAclSetDto {
        /**ACL创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**LoadBalancerAcl的名称*/
        @JsonProperty("LoadBalancerAclName")
        private String LoadBalancerAclName;

        /**LoadBalancerAcl的ID*/
        @JsonProperty("LoadBalancerAclId")
        private String LoadBalancerAclId;

        /**IP版本*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**ACL规则信息*/
        @JsonProperty("LoadBalancerAclEntrySet")
        private List<LoadBalancerAclSetLoadBalancerAclEntrySetDto> LoadBalancerAclEntrySet;

        @Data
        @ToString
        public static class LoadBalancerAclSetLoadBalancerAclEntrySetDto {
            /**ACL的ID*/
            @JsonProperty("LoadBalancerAclId")
            private String LoadBalancerAclId;

            /**ACL规则ID*/
            @JsonProperty("LoadBalancerAclEntryId")
            private String LoadBalancerAclEntryId;

            /**LoadBalancerAcl规则的网段*/
            @JsonProperty("CidrBlock")
            private String CidrBlock;

            /**LoadBalancerAcl规则优先级，1-32766，数字越小优先级越高*/
            @JsonProperty("RuleNumber")
            private Integer RuleNumber;

            /**LoadBalancerAcl规则行为，接受(allow)，拒绝(deny)*/
            @JsonProperty("RuleAction")
            private String RuleAction;

            /**协议，IP代表所有协议*/
            @JsonProperty("Protocol")
            private String Protocol;

            /**描述*/
            @JsonProperty("Description")
            private String Description;

        }

    }

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

}
