package ksyun.client.kce.describecluster.v20231115;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeClusterResponse
* @Description DescribeCluster 返回体
*/
@Data
@ToString
public class DescribeClusterResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**集群总数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**单次调用返回的最大记录数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**分页标识，如果调用未返回全部实例，标记下次调用的返回值的起点，如果已返回全部实例，则其值为0*/
    @JsonProperty("Marker")
    private Integer Marker;

    /***/
    @JsonProperty("ClusterSet")
    private List<ClusterSetDto> ClusterSet;

    @Data
    @ToString
    public static class ClusterSetDto {
        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**集群名称*/
        @JsonProperty("ClusterName")
        private String ClusterName;

        /**该字段已废弃*/
        @JsonProperty("ClusterType")
        private String ClusterType;

        /**集群管理形态

- DedicatedCluster 独立部署集群
- ManagedCluster 托管集群
- ServerlessCluster serverless集群
- ExternalCluster 纳管集群*/
        @JsonProperty("ClusterManageMode")
        private String ClusterManageMode;

        /**k8s集群版本*/
        @JsonProperty("K8sVersion")
        private String K8sVersion;

        /**集群描述信息*/
        @JsonProperty("ClusterDesc")
        private String ClusterDesc;

        /**集群pod网段*/
        @JsonProperty("PodCidr")
        private String PodCidr;

        /**集群Service网段*/
        @JsonProperty("ServiceCidr")
        private String ServiceCidr;

        /**集群VpcId*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**集群Vpc网段*/
        @JsonProperty("VpcCidr")
        private String VpcCidr;

        /**集群状态

- building 创建中
- running 运行中
- not ready 异常
- error 创建失败
- deleting 删除中
- pending 等待接入(纳管集群)
- imported 已接入(纳管集群)*/
        @JsonProperty("Status")
        private String Status;

        /**Worker节点总数*/
        @JsonProperty("NodeNum")
        private Integer NodeNum;

        /**Worker正常节点数量*/
        @JsonProperty("NormalNodeNum")
        private Integer NormalNodeNum;

        /**集群网络模型

- Flannel
- Canal
- Calico*/
        @JsonProperty("NetworkType")
        private String NetworkType;

        /**单个节点上运行的pod数量上限*/
        @JsonProperty("MaxPodPerNode")
        private Integer MaxPodPerNode;

        /**集群Master与Etcd组件是否分开部署*/
        @JsonProperty("MasterEtcdSeparate")
        private Boolean MasterEtcdSeparate;

        /**订单类型

- 1 试用订单
- 2 常规订单
- 3 协议订单*/
        @JsonProperty("OrderType")
        private Integer OrderType;

        /**服务结束时间，一般预付费包年包月才有该值，格式 yyyy-MM-dd HH:mm:ss
*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**是否已支持微服务*/
        @JsonProperty("EnableKMSE")
        private Boolean EnableKMSE;

        /**集群创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

}
