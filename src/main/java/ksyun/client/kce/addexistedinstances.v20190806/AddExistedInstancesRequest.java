package ksyun.client.kce.addexistedinstances.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddExistedInstancesRequest
* @Description 请求参数
*/
@Data
public class AddExistedInstancesRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**选择已有的虚拟机（包含专属云主机）作为集群的Worker节点，其中NodeRole只能是Worker。<br>N：1-99*/
    @KsYunField(name = "ExistedInstanceKecSet", type = 1)
    private List<ExistedInstanceKecSetDto> ExistedInstanceKecSetList;

    @Data
    @ToString
    public static class ExistedInstanceKecSetDto {
        /**节点角色,有效值：Worker*/
        @KsYunField(name="NodeRole")
        private String NodeRole;

        /**云服务器产品重新安装实例操作系统的透传参数，json化字符串格式，详见主机更换或者重新安装实例操作接口ModifyInstanceImage。
注意：接口中的ImageId参数替换为支持的节点操作系统，可调用容器的DescribeInstanceImage接口，获取容器服务支持的节点操作系统*/
        @KsYunField(name = "KecPara", type = 1)
        private List<String> KecParaList;

        /**节点高级设置*/
        @KsYunField(name="AdvancedSetting")
        private ExistedInstanceKecSetAdvancedSettingDto AdvancedSetting;

        @Data
        @ToString
        public static class ExistedInstanceKecSetAdvancedSettingDto {
            /**数据盘挂载设置，仅针对于第一块数据盘生效*/
            @KsYunField(name="DataDisk")
            private ExistedInstanceKecSetAdvancedSettingDataDiskDto DataDisk;

            @Data
            @ToString
            public static class ExistedInstanceKecSetAdvancedSettingDataDiskDto {
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
            @KsYunField(name = "Label", type = 1)
            private List<ExistedInstanceKecSetAdvancedSettingLabelDto> LabelList;

            @Data
            @ToString
            public static class ExistedInstanceKecSetAdvancedSettingLabelDto {
                /**标签键，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
                @KsYunField(name="Key")
                private String Key;

                /**标签值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、".")，且必须以字母、数字开头和结尾*/
                @KsYunField(name="Value")
                private String Value;

            }

            /**自定义节点上k8s组件的参数*/
            @KsYunField(name="ExtraArg")
            private ExistedInstanceKecSetAdvancedSettingExtraArgDto ExtraArg;

            @Data
            @ToString
            public static class ExistedInstanceKecSetAdvancedSettingExtraArgDto {
                /**用户自定义kubelet的参数*/
                @KsYunField(name = "Kubelet", type = 1)
                private List<ExistedInstanceKecSetAdvancedSettingExtraArgKubeletDto> KubeletList;

                @Data
                @ToString
                public static class ExistedInstanceKecSetAdvancedSettingExtraArgKubeletDto {
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
            @KsYunField(name = "Taints", type = 1)
            private List<ExistedInstanceKecSetAdvancedSettingTaintsDto> TaintsList;

            @Data
            @ToString
            public static class ExistedInstanceKecSetAdvancedSettingTaintsDto {
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
