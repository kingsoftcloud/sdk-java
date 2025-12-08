package ksyun.client.kce2.describeclusters.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeClustersResponse
* @Description DescribeClusters 返回体
*/
@Data
@ToString
public class DescribeClustersResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("MaxResults")
        private Integer MaxResults;

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("ClusterSet")
        private List<ClusterSetDto> ClusterSet;

        @Data
        @ToString
        public static class ClusterSetDto {
            /***/
            @JsonProperty("ClusterId")
            private String ClusterId;

            /***/
            @JsonProperty("ClusterName")
            private String ClusterName;

            /***/
            @JsonProperty("ClusterManageMode")
            private String ClusterManageMode;

            /***/
            @JsonProperty("ProjectId")
            private String ProjectId;

            /***/
            @JsonProperty("KubernetesVersion")
            private String KubernetesVersion;

            /***/
            @JsonProperty("Network")
            private NetworkDto Network;

            @Data
            @ToString
            public static class NetworkDto {
                /***/
                @JsonProperty("NetworkPluginType")
                private String NetworkPluginType;

                /***/
                @JsonProperty("ApiServer")
                private ApiServerDto ApiServer;

                @Data
                @ToString
                public static class ApiServerDto {
                    /***/
                    @JsonProperty("PublicApiServerEnable")
                    private Boolean PublicApiServerEnable;

                    /**开启公网访问下必填，公网需要绑定的弹性IP id*/
                    @JsonProperty("EipId")
                    private String EipId;

                    /**所选vpc的所在的终端子网Id*/
                    @JsonProperty("ReserveSubnetId")
                    private String ReserveSubnetId;

                }

                /***/
                @JsonProperty("VpcCNI")
                private VpcCNIDto VpcCNI;

                @Data
                @ToString
                public static class VpcCNIDto {
                    /***/
                    @JsonProperty("Enable")
                    private Boolean Enable;

                    /**网络模式：
• eniOnly  独占网卡
• eniMultiIP  共享网卡*/
                    @JsonProperty("DaemonMode")
                    private String DaemonMode;

                    /**vpc的子网id，必须选跟集群同vpc下的子网Id,可以填多个*/
                    @JsonProperty("SubnetIds")
                    private List<String> SubnetIds;

                    /**弹性网卡安全组id，需要跟集群同vpc下的安全组id*/
                    @JsonProperty("SecurityGroup")
                    private String SecurityGroup;

                }

                /***/
                @JsonProperty("PodCidr")
                private String PodCidr;

                /***/
                @JsonProperty("ServiceCidr")
                private String ServiceCidr;

                /***/
                @JsonProperty("MaxPodPerNode")
                private Integer MaxPodPerNode;

            }

            /***/
            @JsonProperty("Addons")
            private List<AddonsDto> Addons;

            @Data
            @ToString
            public static class AddonsDto {
                /***/
                @JsonProperty("Name")
                private String Name;

            }

            /***/
            @JsonProperty("ManagedClusterSpec")
            private ManagedClusterSpecDto ManagedClusterSpec;

            @Data
            @ToString
            public static class ManagedClusterSpecDto {
            }

            /***/
            @JsonProperty("Status")
            private StatusDto Status;

            @Data
            @ToString
            public static class StatusDto {
                /***/
                @JsonProperty("Phase")
                private String Phase;

            }

        }

    }

}
