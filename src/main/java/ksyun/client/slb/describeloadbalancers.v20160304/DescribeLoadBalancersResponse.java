package ksyun.client.slb.describeloadbalancers.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeLoadBalancersResponse
* @Description DescribeLoadBalancers 返回体
*/
@Data
@ToString
public class DescribeLoadBalancersResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**负载均衡的信息*/
    @JsonProperty("LoadBalancerDescriptions")
    private List<LoadBalancerDescriptionsDto> LoadBalancerDescriptions;

    @Data
    @ToString
    public static class LoadBalancerDescriptionsDto {
        /**负载均衡的ID*/
        @JsonProperty("LoadBalancerId")
        private String LoadBalancerId;

        /**负载均衡的名称*/
        @JsonProperty("LoadBalancerName")
        private String LoadBalancerName;

        /**是否是WAF*/
        @JsonProperty("IsWaf")
        private Boolean IsWaf;

        /**负载均衡的类型*/
        @JsonProperty("Type")
        private String Type;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**所属项目*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**service结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**IP地址*/
        @JsonProperty("PublicIp")
        private String PublicIp;

        /**负载均衡的关联状态*/
        @JsonProperty("State")
        private String State;

        /**负载均衡支持的IP版本*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**负载均衡开启状态*/
        @JsonProperty("LoadBalancerState")
        private String LoadBalancerState;

        /**监听器个数*/
        @JsonProperty("ListenersCount")
        private Integer ListenersCount;

        /**计费方式 PrepaidByTime（一次性预付费）*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**负载均衡类型*/
        @JsonProperty("LbType")
        private String LbType;

        /**负载均衡状态(active 正常|error 异常|creating 创建中|building 创建中|upgrading 升级中|upgrade_error 升级失败)*/
        @JsonProperty("LbStatus")
        private String LbStatus;

        /**子网id*/
        @JsonProperty("VnetId")
        private String VnetId;

        /**删除保护*/
        @JsonProperty("DeleteProtection")
        private String DeleteProtection;

        /**修改保护*/
        @JsonProperty("ModifyProtection")
        private String ModifyProtection;

        /**资源所绑定的标签信息,仅查询接口且存在标签筛选条件或者IsContainTag为True时才会返回此值*/
        @JsonProperty("TagSet")
        private List<LoadBalancerDescriptionsTagSetDto> TagSet;

        @Data
        @ToString
        public static class LoadBalancerDescriptionsTagSetDto {
            /**资源ID*/
            @JsonProperty("ResourceUuid")
            private String ResourceUuid;

            /**标签ID*/
            @JsonProperty("TagId")
            private String TagId;

            /**标签建*/
            @JsonProperty("TagKey")
            private String TagKey;

            /**标签值*/
            @JsonProperty("TagValue")
            private String TagValue;

        }

    }

}
