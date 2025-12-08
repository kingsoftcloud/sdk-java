package ksyun.client.kce.describeclustersummary.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeClusterSummaryResponse
* @Description DescribeClusterSummary 返回体
*/
@Data
@ToString
public class DescribeClusterSummaryResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ClusterSet")
    private ClusterSetDto ClusterSet;

    @Data
    @ToString
    public static class ClusterSetDto {
        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**集群名称*/
        @JsonProperty("ClusterName")
        private String ClusterName;

        /**集群模式

- DedicatedCluster
- ManagedCluster
- ServerlessCluster
- ExternalCluster*/
        @JsonProperty("ClusterManageMode")
        private String ClusterManageMode;

        /**集群版本*/
        @JsonProperty("K8sVersion")
        private String K8sVersion;

        /**Pod网段*/
        @JsonProperty("PodCidr")
        private String PodCidr;

        /**Service网段*/
        @JsonProperty("ServiceCidr")
        private String ServiceCidr;

        /**虚拟网络ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**VPC网段*/
        @JsonProperty("VpcCidr")
        private String VpcCidr;

        /**集群网络模型

- Calico
- Flannel*/
        @JsonProperty("NetworkType")
        private String NetworkType;

        /**集群状态，请参考DescribeCluster接口*/
        @JsonProperty("Status")
        private String Status;

        /**集群创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
