package ksyun.client.kmr.getinstancedetail.v20231231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetInstanceDetailResponse
* @Description GetInstanceDetail 返回体
*/
@Data
@ToString
public class GetInstanceDetailResponse extends BaseResponseModel {

    /**请求ID，用于唯一标识一次请求*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例ID，用于唯一标识一个实例*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例运行时间*/
        @JsonProperty("RunningTime")
        private Integer RunningTime;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**账户ID*/
        @JsonProperty("AccountId")
        private String AccountId;

        /**租户ID*/
        @JsonProperty("TenantId")
        private String TenantId;

        /**实例状态*/
        @JsonProperty("Status")
        private String Status;

        /**可用区*/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /**实例开始时间*/
        @JsonProperty("BeginTime")
        private String BeginTime;

        /**计费类型*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**负载均衡ID*/
        @JsonProperty("SlbId")
        private String SlbId;

        /**负载均衡IP*/
        @JsonProperty("SlbIp")
        private String SlbIp;

        /**终端子网ID*/
        @JsonProperty("TerminalSubnetId")
        private String TerminalSubnetId;

        /**订单ID*/
        @JsonProperty("OrderId")
        private String OrderId;

        /**套餐类型*/
        @JsonProperty("PackageType")
        private String PackageType;

        /**区域*/
        @JsonProperty("Region")
        private String Region;

        /**VPC ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**VPC CIDR*/
        @JsonProperty("VpcCidr")
        private String VpcCidr;

        /**VPC子网ID*/
        @JsonProperty("VpcSubnetId")
        private String VpcSubnetId;

        /**安全组ID*/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /***/
        @JsonProperty("InstanceInfo")
        private DataInstanceInfoDto InstanceInfo;

        @Data
        @ToString
        public static class DataInstanceInfoDto {
            /**运行模式*/
            @JsonProperty("RunMode")
            private String RunMode;

            /**产品名称*/
            @JsonProperty("Product")
            private String Product;

            /**产品版本*/
            @JsonProperty("Version")
            private String Version;

            /**是否高可用*/
            @JsonProperty("HighAvailability")
            private Boolean HighAvailability;

            /***/
            @JsonProperty("FeEndpoints")
            private DataInstanceInfoFeEndpointsDto FeEndpoints;

            @Data
            @ToString
            public static class DataInstanceInfoFeEndpointsDto {
                /**前端查询端口*/
                @JsonProperty("FeQueryPort")
                private Integer FeQueryPort;

                /**前端HTTP端口*/
                @JsonProperty("FeHttpPort")
                private Integer FeHttpPort;

                /**前端私有负载均衡IP*/
                @JsonProperty("FePrivateSlbIP")
                private String FePrivateSlbIP;

                /**前端公共负载均衡IP*/
                @JsonProperty("FePublicSlbIP")
                private String FePublicSlbIP;

                /**前端公共ACL ID*/
                @JsonProperty("FePublicAClId")
                private String FePublicAClId;

            }

            /***/
            @JsonProperty("CnEndpoints")
            private DataInstanceInfoCnEndpointsDto CnEndpoints;

            @Data
            @ToString
            public static class DataInstanceInfoCnEndpointsDto {
                /**计算节点HTTP端口*/
                @JsonProperty("CnHttpPort")
                private Integer CnHttpPort;

                /**计算节点公共负载均衡IP*/
                @JsonProperty("CnPublicSlbIP")
                private String CnPublicSlbIP;

                /**计算节点公共ACL ID*/
                @JsonProperty("CnPublicAClId")
                private String CnPublicAClId;

            }

            /***/
            @JsonProperty("FeResourceSpec")
            private DataInstanceInfoFeResourceSpecDto FeResourceSpec;

            @Data
            @ToString
            public static class DataInstanceInfoFeResourceSpecDto {
                /**前端初始卷大小 单位GB*/
                @JsonProperty("InitVolumeSize")
                private Integer InitVolumeSize;

                /**前端卷大小*/
                @JsonProperty("VolumeSize")
                private Integer VolumeSize;

                /**前端卷类型*/
                @JsonProperty("VolumeType")
                private String VolumeType;

                /**前端计算单元*/
                @JsonProperty("Cu")
                private Integer Cu;

                /**前端节点数量*/
                @JsonProperty("NodeNumber")
                private Integer NodeNumber;

                /**前端弹性节点数量*/
                @JsonProperty("ElasticNodeNumber")
                private Integer ElasticNodeNumber;

            }

            /***/
            @JsonProperty("CnResourceSpec")
            private DataInstanceInfoCnResourceSpecDto CnResourceSpec;

            @Data
            @ToString
            public static class DataInstanceInfoCnResourceSpecDto {
                /**计算节点初始卷大小 单位GB*/
                @JsonProperty("InitVolumeSize")
                private Integer InitVolumeSize;

                /**计算节点卷大小*/
                @JsonProperty("VolumeSize")
                private Integer VolumeSize;

                /**计算节点卷类型*/
                @JsonProperty("VolumeType")
                private String VolumeType;

                /**计算节点计算单元*/
                @JsonProperty("Cu")
                private Integer Cu;

                /**计算节点数量*/
                @JsonProperty("NodeNumber")
                private Integer NodeNumber;

                /**计算节点弹性节点数量*/
                @JsonProperty("ElasticNodeNumber")
                private Integer ElasticNodeNumber;

            }

            /***/
            @JsonProperty("KS3Spec")
            private DataInstanceInfoKS3SpecDto KS3Spec;

            @Data
            @ToString
            public static class DataInstanceInfoKS3SpecDto {
                /**KS3桶名称*/
                @JsonProperty("Bucket")
                private String Bucket;

                /**KS3目录前缀*/
                @JsonProperty("Prefix")
                private String Prefix;

            }

            /***/
            @JsonProperty("ManagerAccessSpec")
            private DataInstanceInfoManagerAccessSpecDto ManagerAccessSpec;

            @Data
            @ToString
            public static class DataInstanceInfoManagerAccessSpecDto {
                /**管理员Web地址*/
                @JsonProperty("ManagerWebAddr")
                private String ManagerWebAddr;

                /**管理员用户名*/
                @JsonProperty("UserName")
                private String UserName;

                /**允许访问的IP列表*/
                @JsonProperty("AllowList")
                private List<String> AllowList;

                /**拒绝访问的IP列表*/
                @JsonProperty("DenyList")
                private List<String> DenyList;

            }

            /**Tuna主机信息*/
            @JsonProperty("TunaHosts")
            private String TunaHosts;

        }

    }

}
