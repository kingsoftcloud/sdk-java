package ksyun.client.kce2.createcluster.v20230101;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname CreateClusterRequest
 * @Description 请求参数
 */
@Data
public class CreateClusterRequest {
    /**
     * 集群名称
     */
    @KsYunField(name = "ClusterName")
    private String ClusterName;

    /**
     * 集群描述
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
     * 集群网络相关配置
     */
    @KsYunField(name = "Network")

    private NetworkDto NetworkList;
    /**
     * 订单配置
     */
    @KsYunField(name = "OrderInfo")

    private OrderInfoDto OrderInfoList;
    /**
     * K8S相关配置
     */
    @KsYunField(name = "Kubernetes")

    private KubernetesDto KubernetesList;
    /**
     * 节点相关配置
     */
    @KsYunField(name = "NodeInstanceSet", type = 2)
    private List<NodeInstanceSetDto> NodeInstanceSetList;
    /**
     * addon插件配置
     */
    @KsYunField(name = "Addons", type = 2)
    private List<AddonsDto> AddonsList;
    /**
     * 节点登录方式（集群默认配置）
     */
    @KsYunField(name = "DefaultLoginSetting")

    private DefaultLoginSettingDto DefaultLoginSettingList;

    @Data
    @ToString
    public static class NetworkDto {
        /**
         * VPC ID
         */
        @KsYunField(name = "VpcId")
        private String VpcId;
        /**
         * 终端子网ID
         */
        @KsYunField(name = "ReserveSubnetId")
        private String ReserveSubnetId;
        /**
         * 公网访问配置
         */
        @KsYunField(name = "PublicApiServer")
        private PublicApiServerDto PublicApiServerList;

        @Data
        @ToString
        public static class PublicApiServerDto {
            /**
             * EIP ID
             */
            @KsYunField(name = "EipId")
            private String EipId;
        }
    }

    @Data
    @ToString
    public static class OrderInfoDto {
        /**
         * 收费类型
         */
        @KsYunField(name = "ChargeType")
        private String ChargeType;
        /**
         * 购买时长
         */
        @KsYunField(name = "PurchaseTime")
        private Integer PurchaseTime;
    }

    @Data
    @ToString
    public static class KubernetesDto {
        /**
         * K8S 版本
         */
        @KsYunField(name = "KubernetesVersion")
        private String KubernetesVersion;
        /**
         * 组件配置
         */
        @KsYunField(name = "Components")
        private List<Object> ComponentsList;
        /**
         * 仓库地址
         */
        @KsYunField(name = "PrivateRegistries")
        private List<Object> PrivateRegistriesList;
        /**
         * K8S Apiserver SANs
         */
        @KsYunField(name = "SANs")
        private List<String> SANsList;
        /**
         * Container 配置
         */
        @KsYunField(name = "Container")
        private ContainerDto ContainerList;
        /**
         * 镜像仓库替换
         * key为需要替换的仓库地址
         * value为新的仓库地址
         */
        @KsYunField(name = "ImageRepoReplace")
        private String ImageRepoReplace;
        /**
         * 节点命名方式（集群默认）
         * INTERNAL_IP：主机IP
         * HOST_NAME：主机hostname
         */
        @KsYunField(name = "NodeNameMode")
        private String NodeNameMode;

        @Data
        @ToString
        public static class ContainerDto {
            /**
             * 容器运行时
             */
            @KsYunField(name = "Runtime")
            private String Runtime;
            /**
             * 容器日志文件存放路径
             */
            @KsYunField(name = "Path")
            private String Path;
            /**
             * 容器日志文件最大存储
             */
            @KsYunField(name = "LogMaxSize")
            private Integer LogMaxSize;
            /**
             * 容器日志文件最大数量
             */
            @KsYunField(name = "LogMaxFiles")
            private Integer LogMaxFiles;
        }
    }

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
    }

    @Data
    @ToString
    public static class AddonsDto {
        /**
         * 组件版本
         */
        private String Name;
        /**
         * 组件类型
         */
        private String Type;
        /**
         * 组件版本
         */
        private String AddonVersion;
    }

    @Data
    @ToString
    public static class DefaultLoginSettingDto {
        /**
         * 用户名
         */
        @KsYunField(name = "UserName")
        private String UserName;
        /**
         * 密码
         */
        @KsYunField(name = "Password")
        private String Password;
        /**
         * 秘钥ID
         */
        @KsYunField(name = "SecretKeyIds")
        private String SecretKeyIds;
        /**
         * 跳板机配置（集群默认）
         */
        @KsYunField(name = "BastionHosts")
        private List<Object> BastionHostsList;
    }
}