package ksyun.client.kce2.createcluster.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateClusterRequest
 * @Description 请求参数
 */
@Data
public class CreateClusterRequest {
    /**
     * 集群名称
     * 有效值：2-64个字符，支持中文，英文，数字，以及特殊字符-_
     */
    @KsYunField(name = "ClusterName")
    private String ClusterName;

    /**
     * 集群描述，255个字符以内。
     */
    @KsYunField(name = "ClusterDesc")
    private String ClusterDesc;

    /**
     * 集群部署方式
     * INDEPENDENT_CLUSTER:独立部署集群MANAGED_CLUSTER: 托管集群
     */
    @KsYunField(name = "ClusterManageMode")
    private String ClusterManageMode;

    /**
     * 所属项目ID
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * K8S版本：v1.26.11，v1.28.7,v1.30.6
     */
    @KsYunField(name = "KubernetesVersion")
    private String KubernetesVersion;

    /**
     * 集群网络信息
     */
    @KsYunField(name = "Network")

    private NetworkDto NetworkList;

    @Data
    @ToString
    public static class NetworkDto {
        /**
         * VPC ID
         */
        @KsYunField(name = "VpcId")
        private String VpcId;
        /**
         * apiserver 信息
         */
        @KsYunField(name = "ApiServer")
        private ApiServerDto ApiServerList;

        @Data
        @ToString
        public static class ApiServerDto {
            /**
             * EIP ID
             */
            @KsYunField(name = "EipId")
            private String EipId;
            /**
             * 是否开启公网访问，默认值：false
             */
            @KsYunField(name = "PublicApiServerEnable")
            private Boolean PublicApiServerEnable;
            /**
             * 所选vpc的所在的终端子网Id
             */
            @KsYunField(name = "ReserveSubnetId")
            private String ReserveSubnetId;
        }

        /**
         * 集群网络插件类型
         * • calico
         */
        @KsYunField(name = "NetworkPluginVeType")
        private String NetworkPluginVeType;
        /**
         * VPC-CNI 信息
         */
        @KsYunField(name = "VpcCNI")
        private VpcCNIDto VpcCNIList;

        @Data
        @ToString
        public static class VpcCNIDto {
            /**
             * 是否开启vpc-cni，默认值：false
             */
            @KsYunField(name = "Enable")
            private Boolean Enable;
            /**
             * 开启vpc-cni必填
             * 网络模式：
             * • eniOnly  独占网卡
             * • eniMultiIP  共享网卡
             */
            @KsYunField(name = "DaemonMode")
            private String DaemonMode;
            /**
             * 开启vpc-cni后必填，
             * vpc的子网id，必须选跟集群同vpc下的子网Id,可以填多个
             */
            @KsYunField(name = "SubnetIds")
            private List<String> SubnetIdsList;
            /**
             * 开启vpc-cni后必填，
             * 弹性网卡安全组id，需要跟集群同vpc下的安全组id
             */
            @KsYunField(name = "SecurityGroup")
            private String SecurityGroup;
        }

        /**
         * Pod CIDR 信息,如：10.0.0.0/16
         * • 不能与Service网段冲突
         * • 不能与VPC网段冲突
         * • 托管集群不支持33网段
         */
        @KsYunField(name = "PodCidr")
        private String PodCidr;
        /**
         * Service CIDR，如10.254.0.0/16
         * • 不能与Pod网段冲突
         * • 不能与Vpc网段冲突
         */
        @KsYunField(name = "ServiceCidr")
        private String ServiceCidr;
        /**
         * Pod数量上限/节点
         * 默认值：128
         * 可选值：16，32，64，128，256
         */
        @KsYunField(name = "MaxPodPerNode")
        private Integer MaxPodPerNode;
        /**
         * 集群证书SAN 信息
         */
        @KsYunField(name = "SANs")
        private List<String> SANsList;
    }

    /**
     * 节点相关配置
     */
    @KsYunField(name = "NodeInstanceSet", type = 2)
    private List<NodeInstanceSetDto> NodeInstanceSetList;

    @Data
    @ToString
    public static class NodeInstanceSetDto {
        /**节点基础配置*/
        /**节点高级配置*/
        /**
         * 组件配置
         */
        @KsYunField(name = "Components", type = 2)
        private List<Object> ComponentsList;
        /**
         * 实例类型
         * • KEC   云服务器
         * • EPC   裸金属服务器
         */
        private String Provider;
    }

    /**
     * addon插件配置
     */
    @KsYunField(name = "Addons", type = 2)
    private List<AddonsDto> AddonsList;

    @Data
    @ToString
    public static class AddonsDto {
        /**
         * 插件名称（会根据插件名称选择
         * • csi-driver
         * • lb-controller （推荐默认选择该组件）
         * • kube-proxy （推荐默认选择该组件，确实该组件会影响集群网络功能）
         * • nvidia-gpu （gpu机型才能选择）
         */
        private String Name;
    }

}