package ksyun.client.kce2.addepcnodes.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddEpcNodesRequest
* @Description 请求参数
*/
@Data
public class AddEpcNodesRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**节点信息*/
    @KsYunField(name="NodeInstanceSet",type=2)
    private List<NodeInstanceSetDto> NodeInstanceSetList;

    @Data
    @ToString
    public static class NodeInstanceSetDto {
        /**实例类型
• EPC   裸金属服务器*/
        @KsYunField(name="Provider")
        private String Provider;

        /**组件配置*/
        @KsYunField(name="Components",type=2)
        private List<NodeInstanceSetDtoComponentsDto> ComponentsList;

        @Data
        @ToString
        public static class NodeInstanceSetDtoComponentsDto {
            /**核心组件的类型
• APISERVER
• ETCD
• CONTROLLERMANAGER
• EVENTETCD
• SCHEDULER*/
            @KsYunField(name="Type")
            private String Type;

        }

        /**节点通用配置*/
        private NodeInstanceSetDtoBasicSettingDto BasicSettingList;

        @Data
        @ToString
        public static class NodeInstanceSetDtoBasicSettingDto {
            /**是否为新建节点
true为新建节点
false为已有节点
*/
            @KsYunField(name="IsNew")
            private Boolean IsNew;

            /**可用区信息，示例：cn-beijing-6a（新建必填）*/
            @KsYunField(name="AvailabilityZone")
            private String AvailabilityZone;

            /**如果是已有节点，填写已有实例的id
epc已有实例要求：
1. 跟集群在同一个vpc下
2. 云主机处于关机状态
3. 未加入其他集群*/
            @KsYunField(name="ExistedInstances",type=2)
            private List<String> ExistedInstancesList;

            /**添加节点的数量（新建节点时必填）*/
            @KsYunField(name="Num")
            private Integer Num;

            /**epc的实例类型 ，示例：CAL-III
具体值参照裸金属文档：https://apiexplorer.ksyun.com/#/document/documentDetail/44/CreateEpc/2015-11-01/1003（新建节点时必填）*/
            @KsYunField(name="InstanceType")
            private String InstanceType;

            /**镜像id*/
            @KsYunField(name="ImageID")
            private String ImageID;

            /**系统盘信息（新建节点必填）*/
            private NodeInstanceSetDtoBasicSettingDtoSystemDiskDto SystemDiskList;

            @Data
            @ToString
            public static class NodeInstanceSetDtoBasicSettingDtoSystemDiskDto {
                /**系统盘类型
具体值参考云主机文档：https://docs.ksyun.com/documents/1528?type=6*/
                @KsYunField(name="Type")
                private String Type;

                /**系统盘大小，单位：G
具体值参考云主机文档：https://docs.ksyun.com/documents/1528?type=6*/
                @KsYunField(name="Size")
                private String Size;

            }

            /**实例名称（新建节点必填）
有效值：有效值：2-64个字符，支持中文，英文，数字，以及特殊字符-_*/
            @KsYunField(name="InstanceName")
            private String InstanceName;

            /**实例的子网id（新建节点必填），子网id必须为集群vpc下的*/
            @KsYunField(name="SubnetID")
            private String SubnetID;

            /**节点命名方式
• INTERNAL_IP 以实例ip作为节点名称
• HOST_NAME 以实例hostName作为节点名称*/
            @KsYunField(name="NodeNameMode")
            private String NodeNameMode;

            /**数据盘信息*/
            @KsYunField(name="DataDisk",type=2)
            private List<NodeInstanceSetDtoBasicSettingDtoDataDiskDto> DataDiskList;

            @Data
            @ToString
            public static class NodeInstanceSetDtoBasicSettingDtoDataDiskDto {
                /**epc数据盘类型
• EXT4
• XFS*/
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
• NaturalNumberFromZero：后缀从0递增的整数*/
                @KsYunField(name="Suffix")
                private String Suffix;

            }

            /**节点登录信息（云主机节点为必填字段）
（查询时，该字段为敏感信息，不返回）*/
            private NodeInstanceSetDtoBasicSettingDtoLoginSettingDto LoginSettingList;

            @Data
            @ToString
            public static class NodeInstanceSetDtoBasicSettingDtoLoginSettingDto {
                /**登录密码（明文）跟秘钥二选一
有效值：8-32个字符，必须包含大小写字母和数字*/
                @KsYunField(name="Password")
                private String Password;

                /**实例登录秘钥Id信息 跟密码二选一*/
                @KsYunField(name="SSHKeyId")
                private String SSHKeyId;

            }

            /**Epc的类型
• GPU  gpu类型
• CAL  计算型
*/
            @KsYunField(name="Series")
            private String Series;

            /**是否重装系统（已有节点时该字段才生效）*/
            @KsYunField(name="ReInstall")
            private Boolean ReInstall;

            /**安全组Id，为集群所选vpc下的安全组id（如果为空，则会创建一个新的安全组id）
*/
            @KsYunField(name="SecurityGroupID")
            private String SecurityGroupID;

            /**数据盘Raid级别,和数据盘的数量直接相关（新建节点必填）
有效值： Raid1、Raid5、Raid10、Raid50、SRaid0*/
            @KsYunField(name="Raid")
            private String Raid;

            /**网卡模式（新建节点必填）
有效值：
bond4：BOND模式
single：非BOND模式
dual：双网卡模式
*/
            @KsYunField(name="NetworkInterfaceMode")
            private String NetworkInterfaceMode;

            /**bond名称
有效值： 
• bond0（默认值）
• bond1*/
            @KsYunField(name="BondName")
            private String BondName;

            /**gpu的驱动id （为gpu类型才生效）
命名方式为cuda版本+“_” + GPU驱动，示例：12.0_525.105.17
可参考裸金属文档：https://apiexplorer.ksyun.com/#/api/44/DescribeGpuImageDriver/2015-11-01/1003*/
            @KsYunField(name="GpuImageDriverId")
            private String GpuImageDriverId;

            /**计费方式（新建节点时必填）
• monthly 包年包月
• dailysettlement 按量付费（按日月结）*/
            @KsYunField(name="ChargeType")
            private String ChargeType;

            /**购买时长单位（计费方式为包年包月时必填）
• 2  单位月*/
            @KsYunField(name="Unit")
            private Integer Unit;

            /**购买时长，当计费方式为包年包月时必填，单位为月
有效值1-36
其他计费类型可不填，若填只能为0*/
            @KsYunField(name="PurchaseTime")
            private Integer PurchaseTime;

        }

        /**k8s节点配置*/
        private NodeInstanceSetDtoAdvancedSettingDto AdvancedSettingList;

        @Data
        @ToString
        public static class NodeInstanceSetDtoAdvancedSettingDto {
            /**部署前执行脚本（base64编码）*/
            @KsYunField(name="PostUserScript")
            private String PostUserScript;

            /**部署后执行脚本（base64编码）*/
            @KsYunField(name="PreUserScript")
            private String PreUserScript;

            /**容器相关信息*/
            private NodeInstanceSetDtoAdvancedSettingDtoContainerDto ContainerList;

            @Data
            @ToString
            public static class NodeInstanceSetDtoAdvancedSettingDtoContainerDto {
                /**容器运行时名称:
• Containerd（默认）*/
                @KsYunField(name="Runtime")
                private String Runtime;

                /**容器存储目录，默认值为：/data/container*/
                @KsYunField(name="Path")
                private String Path;

                /**容器单个日志文件大小  单位：Mi,默认值为100*/
                @KsYunField(name="LogMaxSize")
                private Integer LogMaxSize;

                /**日志文件数量大小，默认值为10*/
                @KsYunField(name="LogMaxFiles")
                private Integer LogMaxFiles;

            }

            /**标签信息*/
            @KsYunField(name="Labels",type=2)
            private List<NodeInstanceSetDtoAdvancedSettingDtoLabelsDto> LabelsList;

            @Data
            @ToString
            public static class NodeInstanceSetDtoAdvancedSettingDtoLabelsDto {
                /**key信息
*/
                @KsYunField(name="Key")
                private String Key;

                /**value信息*/
                @KsYunField(name="Value")
                private String Value;

            }

            /**污点信息*/
            private NodeInstanceSetDtoAdvancedSettingDtoTaintDto TaintList;

            @Data
            @ToString
            public static class NodeInstanceSetDtoAdvancedSettingDtoTaintDto {
                /**key信息*/
                @KsYunField(name="Key")
                private String Key;

                /**value信息*/
                @KsYunField(name="Value")
                private String Value;

                /**effect 信息：PreferNoSchedule，NoSchedule，NoExecute
*/
                @KsYunField(name="Effect")
                private String Effect;

            }

        }

    }

}
