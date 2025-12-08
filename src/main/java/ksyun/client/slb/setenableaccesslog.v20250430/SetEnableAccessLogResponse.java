package ksyun.client.slb.setenableaccesslog.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetEnableAccessLogResponse
* @Description SetEnableAccessLog 返回体
*/
@Data
@ToString
public class SetEnableAccessLogResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**负载均衡的信息*/
    @JsonProperty("LoadBalancer")
    private LoadBalancerDto LoadBalancer;

    @Data
    @ToString
    public static class LoadBalancerDto {
        /**负载均衡的ID*/
        @JsonProperty("LoadBalancerId")
        private String LoadBalancerId;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**负载均衡的名称*/
        @JsonProperty("LoadBalancerName")
        private String LoadBalancerName;

        /**所属项目*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**负载均衡支持的版本*/
        @JsonProperty("LoadBalancerVersion")
        private String LoadBalancerVersion;

        /**负载均衡支持的IP版本*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**负载均衡的类型*/
        @JsonProperty("LoadBalancerType")
        private String LoadBalancerType;

        /**IP地址*/
        @JsonProperty("PublicIp")
        private String PublicIp;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**负载均衡的开启状态*/
        @JsonProperty("State")
        private String State;

        /**监听器个数*/
        @JsonProperty("ListenersCount")
        private Integer ListenersCount;

        /**负载均衡状态(active 正常|error 异常|creating 创建中|building 创建中|upgrading 升级中|upgrade_error 升级失败)*/
        @JsonProperty("Status")
        private String Status;

        /**是否开启日志服务*/
        @JsonProperty("EnabledLog")
        private Boolean EnabledLog;

        /**计费方式 (PrePaidByHourUsage : 809)*/
        @JsonProperty("BillType")
        private Integer BillType;

        /**是否试用(1正式 | 2试用)*/
        @JsonProperty("ProductWhat")
        private Integer ProductWhat;

        /**服务结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**子网id*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**私网ip*/
        @JsonProperty("PrivateIpAddress")
        private String PrivateIpAddress;

        /**是否开启QUIC功能*/
        @JsonProperty("EnabledQuic")
        private Boolean EnabledQuic;

        /**是否开启弹性伸缩*/
        @JsonProperty("EnableHpa")
        private Boolean EnableHpa;

        /**绑定WAF状态*/
        @JsonProperty("BindWafStatus")
        private String BindWafStatus;

        /**绑定WAF状态*/
        @JsonProperty("WafInfo")
        private WafInfoDto WafInfo;

        @Data
        @ToString
        public static class WafInfoDto {
            /**Waf产品的ID*/
            @JsonProperty("WafId")
            private String WafId;

        }

        /**实例规格（L4 | L7 | L4-L7）*/
        @JsonProperty("ProtocolLayers")
        private String ProtocolLayers;

        /**是否开启删除保护on/off*/
        @JsonProperty("DeleteProtection")
        private String DeleteProtection;

        /**是否开启修改保护on/off*/
        @JsonProperty("ModifyProtection")
        private String ModifyProtection;

        /**资源所绑定的标签信息,仅查询接口且存在标签筛选条件或者IsContainTag为True时才会返回此值*/
        @JsonProperty("TagSet")
        private List<TagSetDto> TagSet;

        @Data
        @ToString
        public static class TagSetDto {
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
