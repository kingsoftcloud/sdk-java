package ksyun.client.slb.setalbaccesslog.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetAlbAccessLogResponse
* @Description SetAlbAccessLog 返回体
*/
@Data
@ToString
public class SetAlbAccessLogResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**独享型负载均衡的信息*/
    @JsonProperty("ApplicationLoadBalancer")
    private ApplicationLoadBalancerDto ApplicationLoadBalancer;

    @Data
    @ToString
    public static class ApplicationLoadBalancerDto {
        /**独享型负载均衡的ID*/
        @JsonProperty("AlbId")
        private String AlbId;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**独享型负载均衡的名称*/
        @JsonProperty("AlbName")
        private String AlbName;

        /**所属项目*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**独享型负载均衡支持的版本*/
        @JsonProperty("AlbVersion")
        private String AlbVersion;

        /**负载均衡支持的IP版本*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**独享型负载均衡的类型*/
        @JsonProperty("AlbType")
        private String AlbType;

        /**IP地址*/
        @JsonProperty("PublicIp")
        private String PublicIp;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**独享型负载均衡的开启状态*/
        @JsonProperty("State")
        private String State;

        /**监听器个数*/
        @JsonProperty("ListenersCount")
        private Integer ListenersCount;

        /**独享型负载均衡状态(active 正常|error 异常|creating 创建中|building 创建中|upgrading 升级中|upgrade_error 升级失败)*/
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
        private ApplicationLoadBalancerWafInfoDto WafInfo;

        @Data
        @ToString
        public static class ApplicationLoadBalancerWafInfoDto {
            /**Waf产品的ID*/
            @JsonProperty("WafId")
            private String WafId;

        }

        /**实例规格（L4 | L7 | L4-L7）*/
        @JsonProperty("ProtocolLayers")
        private String ProtocolLayers;

        /**内部资源标签信息*/
        @JsonProperty("ResourceTags")
        private List<ApplicationLoadBalancerResourceTagsDto> ResourceTags;

        @Data
        @ToString
        public static class ApplicationLoadBalancerResourceTagsDto {
            /**标签键*/
            @JsonProperty("Name")
            private String Name;

            /**标签值*/
            @JsonProperty("Value")
            private String Value;

        }

        /**是否开启删除保护on/off*/
        @JsonProperty("DeleteProtection")
        private String DeleteProtection;

        /**是否开启修改保护on/off*/
        @JsonProperty("ModifyProtection")
        private String ModifyProtection;

        /**资源所绑定的标签信息,仅查询接口且存在标签筛选条件或者IsContainTag为True时才会返回此值(会影响接口速度)*/
        @JsonProperty("TagSet")
        private List<ApplicationLoadBalancerTagSetDto> TagSet;

        @Data
        @ToString
        public static class ApplicationLoadBalancerTagSetDto {
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
