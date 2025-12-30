package ksyun.client.kce.createcluster.v20201231;

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
public class CreateClusterRequest{
    /**集群名称<br>有效值：2-64个字符，支持中文，英文，数字，以及特殊字符-,.!$^*()%#&+/:;<=>[]_`{}~*/
    @KsYunField(name="ClusterName")
    private String ClusterName;

    /**集群类型，默认值 VirtualMachine，该字段已无实际意义，可忽略

- VirtualMachine 云服务器
- BareMetal 裸金属
*/
    @KsYunField(name="ClusterType")
    private String ClusterType;

    /**集群管理模式，默认DedicatedCluster

- DedicatedCluster 独立部署集群
- ManagedCluster 托管集群
- ServerlessCluster serverless集群*/
    @KsYunField(name="ClusterManageMode")
    private String ClusterManageMode;

    /**集群描述*/
    @KsYunField(name="ClusterDesc")
    private String ClusterDesc;

    /**集群所在的vpcid*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**集群pod的网段，如：10.0.0.0/16

- 不能与Service网段冲突
- 不能与VPC网段冲突
- 托管集群不支持33网段*/
    @KsYunField(name="PodCidr")
    private String PodCidr;

    /**集群Service的网段，如10.254.0.0/16

- 不能与Pod网段冲突
- 不能与Vpc网段冲突*/
    @KsYunField(name="ServiceCidr")
    private String ServiceCidr;

    /**集群的网络模型

- Flannel
- Canal
- Calico*/
    @KsYunField(name="NetworkType")
    private String NetworkType;

    /**容器服务支持的k8s的集群版本号<br>示例：v1.27.7
有效值以控制台页面为准*/
    @KsYunField(name="K8sVersion")
    private String K8sVersion;

    /**集群所在vpc终端子网id*/
    @KsYunField(name="ReserveSubnetId")
    private String ReserveSubnetId;

    /**是否将apiserver暴露到公网，仅针对独立部署集群生效。若不需要暴露，则不填写此选项；若选择暴露，则会创建公网SLB和EIP用于开启集群的Api Server公网访问。需要用户传递弹性EIP创建透传参数，json化字符串格，详见[创建弹性IP](https://docs.ksyun.com/documents/687)。*/
    @KsYunField(name="PublicApiServer")
    private String PublicApiServer;

    /**托管集群或者Serverless集群是否将apiserver暴露到公网*/
    @KsYunField(name="ExposePublicApiServer")
    private Boolean ExposePublicApiServer;

    /**每个节点上运行的pod数量上限<br> 默认值：128 <br> 可选值：16，32，64，128，256*/
    @KsYunField(name="MaxPodPerNode")
    private String MaxPodPerNode;

    /**该字段仅针对于独立部署集群生效，托管集群不生效。集群Master和Etcd组件部署方式，有效值：
True：Master和Etcd组件独享节点部署
False：Master和Etcd组件共享节点部署
默认值：False*/
    @KsYunField(name="MasterEtcdSeparate")
    private Boolean MasterEtcdSeparate;

    /**当集群类型为托管集群时生效，为托管集群控制面进行子网和安全组配置，支持配置多个*/
    @KsYunField(name="ManagedClusterMultiMaster",type=1)
    private List<ManagedClusterMultiMasterDto> ManagedClusterMultiMasterList;

    @Data
    @ToString
    public static class ManagedClusterMultiMasterDto {
        /**master.N所在子网的id*/
        @KsYunField(name="SubnetId")
        private String SubnetId;

        /**master.N的安全组id*/
        @KsYunField(name="SecurityGroupId")
        private String SecurityGroupId;

    }

    /**新建节点创建集群，定义节点角色和配置，支持云服务器机和专属云服务器。*/
    @KsYunField(name="InstanceForNode",type=1)
    private List<InstanceForNodeDto> InstanceForNodeList;

    @Data
    @ToString
    public static class InstanceForNodeDto {
        /**节点角色,有效值：
- Worker
- Master_Etcd
- Master
- Etcd

ClusterManageMode字段为DedicatedCluster时
- MasterEtcdSeparate字段设置为False时，Worker和Master_Etcd需要同时指定
- MasterEtcdSeparate字段设置为True时，Master、Etcd和Worker角色需要同时指定。
- Master_Etcd、Master、Etcd目前只能是3个或者5个。
- Master_Etcd、Master、Etcd建议配置4C8G起，数据盘建议SSD，50G起。*/
        @KsYunField(name="NodeRole")
        private String NodeRole;

        /**定义节点的配置，支持普通云主机和专属云主机。*/
        @KsYunField(name="NodeConfig",type=1)
        private List<InstanceForNodeNodeConfigDto> NodeConfigList;

        @Data
        @ToString
        public static class InstanceForNodeNodeConfigDto {
            /**定义节点的配置，支持普通云主机和专属云主机。
节点配置信息使用云主机/专属云主机创建透传参数，json化字符串格式，详见云主机创建实例接口*/
            @KsYunField(name="Para")
            private String Para;

            /**节点的高级配置设置*/
            @KsYunField(name="AdvancedSetting")
            private InstanceForNodeNodeConfigAdvancedSettingDto AdvancedSetting;

            @Data
            @ToString
            public static class InstanceForNodeNodeConfigAdvancedSettingDto {
                /**不推荐使用，请优先使用MultiDataDisk参数支持多块数据盘挂载设置。DataDisk仅针对第一块数据盘挂载设置生效*/
                @KsYunField(name="DataDisk")
                private InstanceForNodeNodeConfigAdvancedSettingDataDiskDto DataDisk;

                @Data
                @ToString
                public static class InstanceForNodeNodeConfigAdvancedSettingDataDiskDto {
                    /**是否对数据盘格式化并挂载，默认值；true。若此字段填写false，则 FileSystem 和 MountTarget字段不生效*/
                    @KsYunField(name="AutoFormatAndMount")
                    private Boolean AutoFormatAndMount;

                    /**数据盘的文件系统，可选值：ext3，ext4，xfs，默认值ext4。若磁盘已有文件系统，则不进行处理，若没有文件系统，则按照用户的定义进行格式化，仅对第一块磁盘生效*/
                    @KsYunField(name="FileSystem")
                    private String FileSystem;

                    /**数据盘挂载点，并挂载，仅对第一块盘生效。*/
                    @KsYunField(name="MountTarget")
                    private String MountTarget;

                }

                /**容器运行时，根据集群版本和需求选择
Kubernetes版本＜1.24时，有效值：
- docker
- containerd
Kubernetes版本≥1.24时，有效值：
- containerd
默认值：docker*/
                @KsYunField(name="ContainerRuntime")
                private String ContainerRuntime;

                /**容器的存储路径，不填写的话默认为/data/container*/
                @KsYunField(name="ContainerPath")
                private String ContainerPath;

                /**base64 编码的用户脚本, 此脚本会在 节点上k8s 组件运行后执行, 需要用户保证脚本的可重入及重试逻辑,脚本和生成的日志的文件可在录/usr/local/ksyun/kce/userscript路径查看*/
                @KsYunField(name="UserScript")
                private String UserScript;

                /**base64 编码的用户脚本, 此脚本会在节点上 k8s 组件运行前执行, 需要用户保证脚本的可重入及重试逻辑,脚本和生成的日志的文件可在录/usr/local/ksyun/kce/pre_userscript路径查看*/
                @KsYunField(name="PreUserScript")
                private String PreUserScript;

                /**节点加入集群后是否可以正常调度，默认值：true*/
                @KsYunField(name="Schedulable")
                private Boolean Schedulable;

                /**节点加入集群时预置的标签*/
                @KsYunField(name="Label",type=1)
                private List<InstanceForNodeNodeConfigAdvancedSettingLabelDto> LabelList;

                @Data
                @ToString
                public static class InstanceForNodeNodeConfigAdvancedSettingLabelDto {
                    /**标签键，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
                    @KsYunField(name="Key")
                    private String Key;

                    /**标签值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、".")，且必须以字母、数字开头和结尾*/
                    @KsYunField(name="Value")
                    private String Value;

                }

                /**自定义节点上k8s组件的参数*/
                @KsYunField(name="ExtraArg")
                private InstanceForNodeNodeConfigAdvancedSettingExtraArgDto ExtraArg;

                @Data
                @ToString
                public static class InstanceForNodeNodeConfigAdvancedSettingExtraArgDto {
                    /**用户自定义kubelet的参数*/
                    @KsYunField(name="Kubelet",type=1)
                    private List<InstanceForNodeNodeConfigAdvancedSettingExtraArgKubeletDto> KubeletList;

                    @Data
                    @ToString
                    public static class InstanceForNodeNodeConfigAdvancedSettingExtraArgKubeletDto {
                        /**用户自定义kubelet的参数，格式k1=v1，如： --feature-gates=EphemeralContainers=true*/
                        @KsYunField(name="CustomArg")
                        private String CustomArg;

                    }

                }

                /**自定义容器日志采集文件大小，超出此大小日志将滚动写入下一文件，默认值为100m*/
                @KsYunField(name="ContainerLogMaxSize")
                private Integer ContainerLogMaxSize;

                /**自定义容器日志采集文件最大数量，默认值为10个*/
                @KsYunField(name="ContainerLogMaxFiles")
                private Integer ContainerLogMaxFiles;

                /**节点加入集群时预置污点，匹配污点容忍进行调度*/
                @KsYunField(name="Taints",type=1)
                private List<InstanceForNodeNodeConfigAdvancedSettingTaintsDto> TaintsList;

                @Data
                @ToString
                public static class InstanceForNodeNodeConfigAdvancedSettingTaintsDto {
                    /**污点名称，校验规则：不超过253个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
                    @KsYunField(name="Key")
                    private String Key;

                    /**污点值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
                    @KsYunField(name="Value")
                    private String Value;

                    /**污点效果，有效值为NoSchedule、PreferNoSchedule、NoExecute*/
                    @KsYunField(name="Effect")
                    private String Effect;

                }

                /**节点多块数据盘挂载格式化设置，DataDisk只能设置第一块盘，请优先使用MultiDataDisk。
这个N与NodeConfig下的Para开机参数中DataDisk.N.Type等相关数据盘的定义对应，在Para中定义的数据盘可以不在MultiDataDisk中定义，即某块盘可以不进行格式化挂载设置*/
                @KsYunField(name="MultiDataDisk",type=1)
                private List<InstanceForNodeNodeConfigAdvancedSettingMultiDataDiskDto> MultiDataDiskList;

                @Data
                @ToString
                public static class InstanceForNodeNodeConfigAdvancedSettingMultiDataDiskDto {
                    /**是否自动格式化并挂载*/
                    @KsYunField(name="AutoFormatAndMount")
                    private Boolean AutoFormatAndMount;

                    /**数据盘的文件系统，默认值ext4，可选值
- ext3
- ext4
- xfs

若磁盘已有文件系统，则不进行处理，若没有文件系统，则按照用户的定义进行格式化*/
                    @KsYunField(name="FileSystem")
                    private String FileSystem;

                    /**挂载点，同一个节点的多块数据盘挂载点不可重复*/
                    @KsYunField(name="MountTarget")
                    private String MountTarget;

                }

            }

        }

    }

    /**使用已有的云物理机创建集群，定义节点角色和配置*/
    @KsYunField(name="ExistedInstanceForEpc",type=1)
    private List<ExistedInstanceForEpcDto> ExistedInstanceForEpcList;

    @Data
    @ToString
    public static class ExistedInstanceForEpcDto {
        /**节点角色,有效值：

- Worker
- Master_Etcd
- Master
- Etcd

ClusterManageMode字段为DedicatedCluster时

- MasterEtcdSeparate字段设置为False时，Worker和Master_Etcd需要同时指定
- MasterEtcdSeparate字段设置为True时，Master、Etcd和Worker角色需要同时指定。
- Master_Etcd、Master、Etcd目前只能是3个或者5个。
- Master_Etcd、Master、Etcd建议配置4C8G起，数据盘建议SSD，50G起。*/
        @KsYunField(name="NodeRole")
        private String NodeRole;

        /**裸金属节点配置*/
        @KsYunField(name="EpcConfig",type=1)
        private List<ExistedInstanceForEpcEpcConfigDto> EpcConfigList;

        @Data
        @ToString
        public static class ExistedInstanceForEpcEpcConfigDto {
            /**支持移入的EPC实例id，Json形式*/
            @KsYunField(name="Para")
            private String Para;

            /**节点的高级配置设置
*/
            @KsYunField(name="AdvancedSetting")
            private ExistedInstanceForEpcEpcConfigAdvancedSettingDto AdvancedSetting;

            @Data
            @ToString
            public static class ExistedInstanceForEpcEpcConfigAdvancedSettingDto {
                /**容器运行时，根据集群版本和需求选择
Kubernetes版本＜1.24时，有效值：
- docker
- containerd
Kubernetes版本≥1.24时，有效值：
- contained
默认值：docker*/
                @KsYunField(name="ContainerRuntime")
                private String ContainerRuntime;

                /**容器的存储路径，不填写的话默认为/data/container*/
                @KsYunField(name="ContainerPath")
                private String ContainerPath;

                /**base64 编码的用户脚本, 此脚本会在 节点上k8s 组件运行后执行, 需要用户保证脚本的可重入及重试逻辑,脚本和生成的日志的文件可在录/usr/local/ksyun/kce/userscript路径查看*/
                @KsYunField(name="UserScript")
                private String UserScript;

                /**base64 编码的用户脚本, 此脚本会在节点上 k8s 组件运行前执行, 需要用户保证脚本的可重入及重试逻辑,脚本和生成的日志的文件可在录/usr/local/ksyun/kce/pre_userscript路径查看*/
                @KsYunField(name="PreUserScript")
                private String PreUserScript;

                /**节点加入集群后是否可以正常调度，默认值：true*/
                @KsYunField(name="Schedulable")
                private Boolean Schedulable;

                /**节点加入集群时预置的标签*/
                @KsYunField(name="Label",type=1)
                private List<ExistedInstanceForEpcEpcConfigAdvancedSettingLabelDto> LabelList;

                @Data
                @ToString
                public static class ExistedInstanceForEpcEpcConfigAdvancedSettingLabelDto {
                    /**标签键，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
                    @KsYunField(name="Key")
                    private String Key;

                    /**标签值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、".")，且必须以字母、数字开头和结尾*/
                    @KsYunField(name="Value")
                    private String Value;

                }

                /**自定义节点上k8s组件的参数
*/
                @KsYunField(name="ExtraArg")
                private ExistedInstanceForEpcEpcConfigAdvancedSettingExtraArgDto ExtraArg;

                @Data
                @ToString
                public static class ExistedInstanceForEpcEpcConfigAdvancedSettingExtraArgDto {
                    /**用户自定义kubelet的参数*/
                    @KsYunField(name="Kubelet",type=1)
                    private List<kubeletDto1> KubeletList;

                    @Data
                    @ToString
                    public static class kubeletDto1 {
                        /**用户自定义kubelet的参数，格式k1=v1，如： --feature-gates=EphemeralContainers=true*/
                        @KsYunField(name="CustomArg")
                        private String CustomArg;

                    }

                }

                /**自定义容器日志采集文件大小，超出此大小日志将滚动写入下一文件，默认值为100m*/
                @KsYunField(name="ContainerLogMaxSize")
                private Integer ContainerLogMaxSize;

                /**自定义容器日志采集文件最大数量，默认值为10个*/
                @KsYunField(name="ContainerLogMaxFiles")
                private Integer ContainerLogMaxFiles;

                /**节点加入集群时预置污点，匹配污点容忍进行调度
*/
                @KsYunField(name="Taint",type=1)
                private List<ExistedInstanceForEpcEpcConfigAdvancedSettingTaintDto> TaintList;

                @Data
                @ToString
                public static class ExistedInstanceForEpcEpcConfigAdvancedSettingTaintDto {
                    /**污点名称，校验规则：不超过253个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
                    @KsYunField(name="Key")
                    private String Key;

                    /**污点值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
                    @KsYunField(name="Value")
                    private String Value;

                    /**污点效果，有效值为NoSchedule、PreferNoSchedule、NoExecute*/
                    @KsYunField(name="Effect")
                    private String Effect;

                }

            }

        }

    }

    /**不推荐使用接口进行安装，集群会安装默认的组件，如需安装其它增强组件，请在集群创建完成后，在控制台选择安装。*/
    @KsYunField(name="Component",type=1)
    private List<ComponentDto> ComponentList;

    @Data
    @ToString
    public static class ComponentDto {
        /**组件名称*/
        @KsYunField(name="Name")
        private String Name;

        /**组件相关参数*/
        @KsYunField(name="Config")
        private String Config;

    }

    /**控制面日志采集,当用户选择的是独立部署集群时，此选项填写无效；当选择是托管时，可选*/
    @KsYunField(name="ControlPlaneLog")
    private ControlPlaneLogDto ControlPlaneLog;

    @Data
    @ToString
    public static class ControlPlaneLogDto {
        /**集群ID*/
        @KsYunField(name="ClusterId")
        private String ClusterId;

        /**控制面日志采集是否开启*/
        @KsYunField(name="Enable")
        private Boolean Enable;

        /**指定控制面日志所投递日志项目的名称，未配置但指定items时将自动创建名称为k8s-log-{clusterID}的日志项目*/
        @KsYunField(name="ProjectName")
        private String ProjectName;

        /**指定哪些控制面日志需要被采集，多个组件请采用英文逗号拼接，如apiserver,kcm，有效值

- apiserver 
- kcm
- scheduler
- auditing"*/
        @KsYunField(name="Items")
        private String Items;

    }

    /**开启删除保护
默认值：True*/
    @KsYunField(name="EnableDelProtection")
    private Boolean EnableDelProtection;

}
