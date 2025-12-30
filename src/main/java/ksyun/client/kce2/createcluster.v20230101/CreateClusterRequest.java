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
public class CreateClusterRequest{
    /**集群名称
有效值：2-64个字符，支持中文，英文，数字，以及特殊字符-_
*/
    @KsYunField(name="ClusterName")
    private String ClusterName;

    /**集群描述，255个字符以内。*/
    @KsYunField(name="ClusterDesc")
    private String ClusterDesc;

    /**集群部署方式
INDEPENDENT_CLUSTER:独立部署集群MANAGED_CLUSTER: 托管集群*/
    @KsYunField(name="ClusterManageMode")
    private String ClusterManageMode;

    /**所属项目ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**K8S版本：v1.26.11，v1.28.7,v1.30.6
*/
    @KsYunField(name="KubernetesVersion")
    private String KubernetesVersion;

    /**集群网络信息*/
    @KsYunField(name="Network")
    private NetworkDto Network;

    @Data
    @ToString
    public static class NetworkDto {
        /**VPC ID*/
        @KsYunField(name="VpcId")
        private String VpcId;

        /**apiserver 信息*/
        @KsYunField(name="ApiServer")
        private NetworkApiServerDto ApiServer;

        @Data
        @ToString
        public static class NetworkApiServerDto {
            /**	
EIP ID*/
            @KsYunField(name="EipId")
            private String EipId;

            /**是否开启公网访问，默认值：false*/
            @KsYunField(name="PublicApiServerEnable")
            private Boolean PublicApiServerEnable;

            /**所选vpc的所在的终端子网Id*/
            @KsYunField(name="ReserveSubnetId")
            private String ReserveSubnetId;

            /**LB（负载均衡类型）类型
• ALB 
• SLB*/
            @KsYunField(name="LbType")
            private String LbType;

            /**ALB实例是否为公私网合一类型，默认值：false
地域是否支持 ALB以及支持哪种 ALB实例类型可参照文档：https://docs.ksyun.com/documents/42600?type=3*/
            @KsYunField(name="IsAdaptationLb")
            private Boolean IsAdaptationLb;

            /**已有私网LB实例 id（新建实例不用填写）*/
            @KsYunField(name="PrivateLbId")
            private String PrivateLbId;

            /**已有公网LB实例 id（新建实例不用填写，若是 ALB公私网合一类型开启公网访问也不用填写）*/
            @KsYunField(name="PublicLbId")
            private String PublicLbId;

        }

        /**集群网络插件类型
• calico*/
        @KsYunField(name="NetworkPluginType")
        private String NetworkPluginType;

        /**VPC-CNI 信息*/
        @KsYunField(name="VpcCNI")
        private NetworkVpcCNIDto VpcCNI;

        @Data
        @ToString
        public static class NetworkVpcCNIDto {
            /**是否开启vpc-cni，默认值：false*/
            @KsYunField(name="Enable")
            private Boolean Enable;

            /**开启vpc-cni必填
网络模式：
• eniOnly  独占网卡
• eniMultiIP  共享网卡*/
            @KsYunField(name="DaemonMode")
            private String DaemonMode;

            /**开启vpc-cni后必填，
vpc的子网id，必须选跟集群同vpc下的子网Id,可以填多个*/
            @KsYunField(name="SubnetIds",type=2)
            private List<String> SubnetIdsList;

            /**开启vpc-cni后必填，
弹性网卡安全组id，需要跟集群同vpc下的安全组id*/
            @KsYunField(name="SecurityGroup")
            private String SecurityGroup;

        }

        /**Pod CIDR 信息,如：10.0.0.0/16
• 不能与Service网段冲突
• 不能与VPC网段冲突
• 托管集群不支持33网段*/
        @KsYunField(name="PodCidr")
        private String PodCidr;

        /**Service CIDR，如10.254.0.0/16
• 不能与Pod网段冲突
• 不能与Vpc网段冲突*/
        @KsYunField(name="ServiceCidr")
        private String ServiceCidr;

        /**Pod数量上限/节点
默认值：128
可选值：16，32，64，128，256*/
        @KsYunField(name="MaxPodPerNode")
        private Integer MaxPodPerNode;

        /**集群证书SAN 信息*/
        @KsYunField(name="SANs",type=2)
        private List<String> SANsList;

        /**安全组id，如果填写则使用该安全组为集群的安全组，如果不填写则集群会自动创建一个安全组*/
        @KsYunField(name="SecurityGroupId")
        private String SecurityGroupId;

    }

    /**节点相关配置*/
    @KsYunField(name="NodeInstanceSet",type=2)
    private List<NodeInstanceSetDto> NodeInstanceSetList;

    @Data
    @ToString
    public static class NodeInstanceSetDto {
        /**节点基础配置*/
        @KsYunField(name="BasicSetting")
        private NodeInstanceSetBasicSettingDto BasicSetting;

        @Data
        @ToString
        public static class NodeInstanceSetBasicSettingDto {
            /**节点数量*/
            @KsYunField(name="Num")
            private Integer Num;

            /**节点命名方式（集群默认）
INTERNAL_IP：主机IP
HOST_NAME：主机hostname*/
            @KsYunField(name="NodeNameMode")
            private String NodeNameMode;

            /**系统镜像ID*/
            @KsYunField(name="ImageId")
            private String ImageId;

            /**安全组ID*/
            @KsYunField(name="SecurityGroupId")
            private String SecurityGroupId;

            /**子网ID*/
            @KsYunField(name="SubnetId")
            private String SubnetId;

            /**机型*/
            @KsYunField(name="InstanceType")
            private String InstanceType;

            /**系统盘配置*/
            @KsYunField(name="SystemDisk")
            private NodeInstanceSetBasicSettingSystemDiskDto SystemDisk;

            @Data
            @ToString
            public static class NodeInstanceSetBasicSettingSystemDiskDto {
                /**系统磁盘类型*/
                @KsYunField(name="Type")
                private String Type;

                /**系统磁盘大小*/
                @KsYunField(name="Size")
                private Integer Size;

                /**epc系统盘类型 （默认值EXT4）
• EXT4
• XFS*/
                @KsYunField(name="FileSystem")
                private String FileSystem;

            }

            /**Container 配置*/
            @KsYunField(name="Container")
            private NodeInstanceSetBasicSettingContainerDto Container;

            @Data
            @ToString
            public static class NodeInstanceSetBasicSettingContainerDto {
                /**容器运行时*/
                @KsYunField(name="Runtime")
                private String Runtime;

                /**容器日志文件存放路径*/
                @KsYunField(name="Path")
                private String Path;

                /**容器日志文件最大存储*/
                @KsYunField(name="LogMaxSize")
                private Integer LogMaxSize;

                /**容器日志文件最大数量*/
                @KsYunField(name="LogMaxFiles")
                private Integer LogMaxFiles;

            }

            /**实例名称*/
            @KsYunField(name="InstanceName")
            private String InstanceName;

            /**实例名称后缀*/
            @KsYunField(name="InstanceNameSuffix")
            private Integer InstanceNameSuffix;

            /**	
可用区*/
            @KsYunField(name="AvailabilityZone")
            private String AvailabilityZone;

            /**数据盘配置*/
            @KsYunField(name="DataDisk")
            private NodeInstanceSetBasicSettingDataDiskDto DataDisk;

            @Data
            @ToString
            public static class NodeInstanceSetBasicSettingDataDiskDto {
                /**数据盘类型*/
                @KsYunField(name="Type")
                private String Type;

                /**数据盘大小(单位：GB)*/
                @KsYunField(name="Size")
                private Integer Size;

                /**是否随实例删除*/
                @KsYunField(name="DeleteWithInstance")
                private Boolean DeleteWithInstance;

                /**是否自动挂载*/
                @KsYunField(name="AutoFormatAndMount")
                private Boolean AutoFormatAndMount;

                /**epc数据盘类型
• EXT4
• XFS
*/
                @KsYunField(name="FileSystem")
                private String FileSystem;

                /**epc数据盘目录
• /DATA/disk    在系统的DATA目录下，系统里展示内容如/DATA/disk1，/DATA/disk2
• /data    在系统的根目录下，系统里展示内容从/data1开始，如/data1，/data2
• /ssd*/
                @KsYunField(name="MountTarget")
                private String MountTarget;

                /**数据盘目录后缀属性
• NoSuffix 不使用后缀
• NaturalNumber：后缀从1底层的整数
• NaturalNumberFromZero：后缀从0递增的整数
*/
                @KsYunField(name="Suffix")
                private String Suffix;

            }

            /**登录方式配置*/
            @KsYunField(name="LoginSetting")
            private NodeInstanceSetBasicSettingLoginSettingDto LoginSetting;

            @Data
            @ToString
            public static class NodeInstanceSetBasicSettingLoginSettingDto {
                /**密码*/
                @KsYunField(name="Password")
                private String Password;

                /**实例登录秘钥Id信息 跟密码二选一*/
                @KsYunField(name="SSHKeyId")
                private String SSHKeyId;

            }

            /**是否为新建节点
true为新建节点
false为已有节点*/
            @KsYunField(name="IsNew")
            private Boolean IsNew;

            /**安全组Id，为集群所选vpc下的安全组id（如果为空，则会创建一个新的安全组id）
如果为已有云主机实例，该字段为空时，会判断是否已有5个安全组，如果已有5个安全组会报错（云主机实例安全组上限为5个）*/
            @KsYunField(name="SecurityGroupID")
            private String SecurityGroupID;

            /**计费方式（新建实例为必填项）
• monthly 包年包月
• dailysettlement 按量付费（按日月结）
• hourlyInstantSettlement(按小时结）
*/
            @KsYunField(name="ChargeType")
            private String ChargeType;

            /**购买时长单位，当计费方式为包年包月时必填
• 2  单位月*/
            @KsYunField(name="Unit")
            private String Unit;

            /**购买时长，当计费方式为包年包月时必填，单位为月
有效值1-36
其他计费类型可不填，若填只能为0*/
            @KsYunField(name="PurchaseTime")
            private String PurchaseTime;

            /**epc专有字段
数据盘Raid级别,和数据盘的数量直接相关（新建节点必填）
有效值： Raid1，Raid5，Raid10，Raid50，SRaid0*/
            @KsYunField(name="Raid")
            private String Raid;

            /**epc专有字段：
网卡模式（新建节点必填）
有效值：
bond4：BOND模式
single：非BOND模式
dual：双网卡模式
windows创建时，只支持非bond模式。*/
            @KsYunField(name="NetworkInterfaceMode")
            private String NetworkInterfaceMode;

            /**epc专有字段
bond名称
有效值： 
• bond0（默认值）
• bond1*/
            @KsYunField(name="BondName")
            private String BondName;

            /**epc专有字段
gpu的驱动id （为gpu类型才生效）
命名方式为cuda版本+“_” + GPU驱动，示例：12.0_525.105.17
可参考裸金属文档：https://apiexplorer.ksyun.com/#/api/44/DescribeGpuImageDriver/2015-11-01/1003*/
            @KsYunField(name="GpuImageDriverId")
            private String GpuImageDriverId;

        }

        /**节点高级配置*/
        @KsYunField(name="AdvancedSetting")
        private NodeInstanceSetAdvancedSettingDto AdvancedSetting;

        @Data
        @ToString
        public static class NodeInstanceSetAdvancedSettingDto {
            /**部署前执行脚本（base64 加密后的密文）*/
            @KsYunField(name="PostUserScript")
            private String PostUserScript;

            /**部署后执行脚本（base64 加密后的密文）*/
            @KsYunField(name="PreUserScript")
            private String PreUserScript;

            /**Label 列表*/
            @KsYunField(name="Labels",type=2)
            private List<NodeInstanceSetAdvancedSettingLabelsDto> LabelsList;

            @Data
            @ToString
            public static class NodeInstanceSetAdvancedSettingLabelsDto {
                /**	
Label Key*/
                @KsYunField(name="Key")
                private String Key;

                /**Label Value*/
                @KsYunField(name="Value")
                private String Value;

            }

            /***/
            @KsYunField(name="Taints",type=2)
            private List<NodeInstanceSetAdvancedSettingTaintsDto> TaintsList;

            @Data
            @ToString
            public static class NodeInstanceSetAdvancedSettingTaintsDto {
                /**	
Taints key*/
                @KsYunField(name="Key")
                private String Key;

                /**Taints Value*/
                @KsYunField(name="Value")
                private String Value;

                /**Taint Effect
(包括：NoSchedule、NoExecute、PreferNoSchedule)*/
                @KsYunField(name="Effect")
                private String Effect;

            }

            /**容器相关信息*/
            @KsYunField(name="Container")
            private NodeInstanceSetAdvancedSettingContainerDto Container;

            @Data
            @ToString
            public static class NodeInstanceSetAdvancedSettingContainerDto {
                /**容器运行时名称:
• Containerd（默认）*/
                @KsYunField(name="Runtime")
                private String Runtime;

                /**容器存储目录，默认值为：/data/container*/
                @KsYunField(name="Path")
                private String Path;

            }

        }

        /**组件配置*/
        @KsYunField(name="Components",type=2)
        private List<NodeInstanceSetComponentsDto> ComponentsList;

        @Data
        @ToString
        public static class NodeInstanceSetComponentsDto {
            /**组件类型*/
            @KsYunField(name="Type")
            private String Type;

            /**组件参数配置*/
            @KsYunField(name="Args")
            private String Args;

            /**容器单个日志文件大小  单位：Mi,默认值为100*/
            @KsYunField(name="LogMaxSize")
            private Integer LogMaxSize;

            /**日志文件数量大小，默认值为10*/
            @KsYunField(name="LogMaxFiles")
            private Integer LogMaxFiles;

        }

        /**实例类型
• KEC   云服务器
• EPC   裸金属服务器*/
        @KsYunField(name="Provider")
        private String Provider;

    }

    /**addon插件配置*/
    @KsYunField(name="Addons",type=2)
    private List<AddonsDto> AddonsList;

    @Data
    @ToString
    public static class AddonsDto {
        /**插件名称（会根据插件名称选择
• csi-driver 
• lb-controller （推荐默认选择该组件）
• kube-proxy （推荐默认选择该组件，确实该组件会影响集群网络功能）
• nvidia-gpu （gpu机型才能选择）*/
        @KsYunField(name="Name")
        private String Name;

    }

}
