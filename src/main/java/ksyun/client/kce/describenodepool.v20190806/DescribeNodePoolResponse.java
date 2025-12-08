package ksyun.client.kce.describenodepool.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNodePoolResponse
* @Description DescribeNodePool 返回体
*/
@Data
@ToString
public class DescribeNodePoolResponse extends BaseResponseModel {
    /**RequestId*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**单次调用返回的最大数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**分页标识，如果调用未返回全部实例，标记下次调用的返回值的起点，如果已返回全部实例，则其值为0*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**节点池数量*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**节点池详细信息*/
    @JsonProperty("NodePoolSet")
    private List<NodePoolSetDto> NodePoolSet;

    @Data
    @ToString
    public static class NodePoolSetDto {
        /**节点池id*/
        @JsonProperty("NodePoolId")
        private String NodePoolId;

        /**节点池名称*/
        @JsonProperty("NodePoolName")
        private String NodePoolName;

        /**节点池状态

- normal 
- warn
- error
- updating*/
        @JsonProperty("Status")
        private String Status;

        /**是否开启弹性伸缩*/
        @JsonProperty("EnableAutoScale")
        private Boolean EnableAutoScale;

        /**节点模板信息*/
        @JsonProperty("NodeTemplate")
        private NodeTemplateDto NodeTemplate;

        @Data
        @ToString
        public static class NodeTemplateDto {
            /**计费方式*/
            @JsonProperty("ChargeType")
            private String ChargeType;

            /**实例类型，详情请见创建实例中InstanceType具体参数*/
            @JsonProperty("InstanceType")
            private String InstanceType;

            /**实例名称*/
            @JsonProperty("InstanceName")
            private String InstanceName;

            /**实例名称后缀*/
            @JsonProperty("InstanceNameSuffix")
            private Integer InstanceNameSuffix;

            /**系统盘信息*/
            @JsonProperty("SystemDisk")
            private SystemDiskDto SystemDisk;

            @Data
            @ToString
            public static class SystemDiskDto {
                /**系统盘类型*/
                @JsonProperty("DiskType")
                private String DiskType;

                /**系统盘大小*/
                @JsonProperty("DiskSize")
                private Integer DiskSize;

            }

            /**本地数据盘大小*/
            @JsonProperty("DataDiskGb")
            private Integer DataDiskGb;

            /**云盘数据盘详情*/
            @JsonProperty("DataDisk")
            private DataDiskDto DataDisk;

            @Data
            @ToString
            public static class DataDiskDto {
                /**数据盘类型*/
                @JsonProperty("DiskType")
                private String DiskType;

                /**数据盘大小*/
                @JsonProperty("DiskSize")
                private Integer DiskSize;

                /**是否随云主机删除*/
                @JsonProperty("DeleteWithInstance")
                private Boolean DeleteWithInstance;

            }

            /**镜像id*/
            @JsonProperty("ImageId")
            private String ImageId;

            /**节点池所在vpc的id*/
            @JsonProperty("VpcId")
            private String VpcId;

            /**子网id*/
            @JsonProperty("SubnetIdSet")
            private List<String> SubnetIdSet;

            /**多子网扩展策略*/
            @JsonProperty("SubnetStrategy")
            private String SubnetStrategy;

            /**安全组id*/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /**节点池所属项目*/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /**实例密码*/
            @JsonProperty("Password")
            private String Password;

            /**密钥id*/
            @JsonProperty("KeyIdSet")
            private List<String> KeyIdSet;

            /**节点高级设置*/
            @JsonProperty("AdvancedSetting")
            private AdvancedSettingDto AdvancedSetting;

            @Data
            @ToString
            public static class AdvancedSettingDto {
                /**数据盘挂载设置，仅针对于第一块数据盘生效   */
                @JsonProperty("DataDisk")
                private DataDiskDto DataDisk;

                @Data
                @ToString
                public static class DataDiskDto {
                    /**是否对数据盘格式化并挂载，默认值；true。若此字段填写false，则 FileSystem 和 MountTarget字段不生效*/
                    @JsonProperty("AutoFormatAndMount")
                    private Boolean AutoFormatAndMount;

                    /**数据盘的文件系统，可选值：ext3，ext4，xfs，默认值ext4。若磁盘已有文件系统，则不进行处理，若没有文件系统，则按照用户的定义进行格式化，仅对第一块磁盘生效*/
                    @JsonProperty("FileSystem")
                    private String FileSystem;

                    /**数据盘挂载点，并挂载，仅对第一块盘生效。*/
                    @JsonProperty("MountTarget")
                    private String MountTarget;

                }

                /**容器运行时，根据集群版本和需求选择*/
                @JsonProperty("ContainerRuntime")
                private String ContainerRuntime;

                /**容器的存储路径*/
                @JsonProperty("DockerPath")
                private String DockerPath;

                /**容器的存储路径*/
                @JsonProperty("ContainerPath")
                private String ContainerPath;

                /**base64 编码的用户脚本*/
                @JsonProperty("UserScript")
                private String UserScript;

                /**base64 编码的用户脚本*/
                @JsonProperty("PreUserScript")
                private String PreUserScript;

                /**节点加入集群后是否可以正常调度*/
                @JsonProperty("Schedulable")
                private Boolean Schedulable;

                /**节点加入集群时预置的标签*/
                @JsonProperty("Label")
                private List<LabelDto> Label;

                @Data
                @ToString
                public static class LabelDto {
                    /**标签键，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
                    @JsonProperty("Key")
                    private String Key;

                    /**标签值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、".")，且必须以字母、数字开头和结尾*/
                    @JsonProperty("Value")
                    private String Value;

                }

                /**自定义节点上k8s组件的参数*/
                @JsonProperty("ExtraArg")
                private ExtraArgDto ExtraArg;

                @Data
                @ToString
                public static class ExtraArgDto {
                    /**自定义节点上k8s组件的参数*/
                    @JsonProperty("Kubelet")
                    private List<KubeletDto> Kubelet;

                    @Data
                    @ToString
                    public static class KubeletDto {
                        /**自定义节点上k8s组件的参数*/
                        @JsonProperty("CustomArg")
                        private String CustomArg;

                    }

                }

                /**自定义容器日志采集文件大小*/
                @JsonProperty("ContainerLogMaxSize")
                private String ContainerLogMaxSize;

                /**自定义容器日志采集文件最大数量*/
                @JsonProperty("ContainerLogMaxFiles")
                private String ContainerLogMaxFiles;

                /**节点加入集群时预置污点 */
                @JsonProperty("Taints")
                private List<TaintsDto> Taints;

                @Data
                @ToString
                public static class TaintsDto {
                    /**污点名称，校验规则：不超过253个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
                    @JsonProperty("Key")
                    private String Key;

                    /**污点值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
                    @JsonProperty("Value")
                    private String Value;

                    /**污点效果，有效值为NoSchedule、PreferNoSchedule、NoExecute*/
                    @JsonProperty("Effect")
                    private String Effect;

                }

            }

            /**云盘标签*/
            @JsonProperty("EbsTags")
            private List<EbsTagsDto> EbsTags;

            @Data
            @ToString
            public static class EbsTagsDto {
                /**标签键*/
                @JsonProperty("Key")
                private String Key;

                /**标签值*/
                @JsonProperty("Value")
                private String Value;

            }

            /**伸缩组ID*/
            @JsonProperty("ScalingConfigurationId")
            private String ScalingConfigurationId;

            /**伸缩组名称*/
            @JsonProperty("ScalingConfigurationName")
            private String ScalingConfigurationName;

            /**内存*/
            @JsonProperty("Mem")
            private String Mem;

            /**移除策略*/
            @JsonProperty("RemovePolicy")
            private String RemovePolicy;

            /**实例标签*/
            @JsonProperty("InstanceTags")
            private List<InstanceTagsDto> InstanceTags;

            @Data
            @ToString
            public static class InstanceTagsDto {
                /**标签键，校验规则：支持1-128个字符，仅支持中英文字符、数字及±=._/@:*/
                @JsonProperty("Key")
                private String Key;

                /**标签值，校验规则：256个字符内，仅支持中英文字符、数字及±=._/@()（）【】:*/
                @JsonProperty("Value")
                private String Value;

            }

            /**是否删除数据盘*/
            @JsonProperty("DeleteDataDisk")
            private Boolean DeleteDataDisk;

            /**是否删除tag*/
            @JsonProperty("DeleteInstanceTag")
            private Boolean DeleteInstanceTag;

            /**是否删除ebstag*/
            @JsonProperty("DeleteEbsTag")
            private Boolean DeleteEbsTag;

            /**CPU核数*/
            @JsonProperty("Cpu")
            private String Cpu;

        }

        /**节点标签*/
        @JsonProperty("Labels")
        private List<LabelsDto> Labels;

        @Data
        @ToString
        public static class LabelsDto {
            /**标签键*/
            @JsonProperty("Key")
            private String Key;

            /**标签值*/
            @JsonProperty("Value")
            private String Value;

        }

        /**节点污点*/
        @JsonProperty("Taints")
        private List<TaintsDto> Taints;

        @Data
        @ToString
        public static class TaintsDto {
            /**污点名称*/
            @JsonProperty("Key")
            private String Key;

            /**污点值*/
            @JsonProperty("Value")
            private String Value;

            /**有效值*/
            @JsonProperty("Effect")
            private String Effect;

        }

        /**最小节点数量*/
        @JsonProperty("MinSize")
        private Integer MinSize;

        /**最大节点数量*/
        @JsonProperty("MaxSize")
        private Integer MaxSize;

        /**当前期望节点数量*/
        @JsonProperty("DesiredCapacity")
        private Integer DesiredCapacity;

        /**当前实例数量*/
        @JsonProperty("InstanceCount")
        private Integer InstanceCount;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**集群id*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**节点池状态错误状态信息*/
        @JsonProperty("ErrorStatusMessage")
        private String ErrorStatusMessage;

        /**是否开启自动删除实例*/
        @JsonProperty("FailureAutoDelete")
        private Boolean FailureAutoDelete;

    }

    /**集群扩容算法*/
    @JsonProperty("ScaleUpPolicy")
    private String ScaleUpPolicy;

    /**集群缩容算法*/
    @JsonProperty("ScaleDownPolicy")
    private ScaleDownPolicyDto ScaleDownPolicy;

    @Data
    @ToString
    public static class ScaleDownPolicyDto {
        /**是否启用自动缩容*/
        @JsonProperty("ScaleDownEnabled")
        private Boolean ScaleDownEnabled;

        /**集群扩容后多少分钟开始考虑缩容条件*/
        @JsonProperty("ScaleDownDelayAfterAdd")
        private Integer ScaleDownDelayAfterAdd;

        /**节点满足缩容条件多少分钟后开始启动缩容*/
        @JsonProperty("ScaleDownUnneededTime")
        private Integer ScaleDownUnneededTime;

        /**缩容阈值百分比*/
        @JsonProperty("ScaleDownUtilizationThreshold")
        private Integer ScaleDownUtilizationThreshold;

        /**缩容最大并发数*/
        @JsonProperty("MaxEmptyBulkDelete")
        private Integer MaxEmptyBulkDelete;

    }

}
