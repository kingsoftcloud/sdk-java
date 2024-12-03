package ksyun.client.kce.addclusterinstances.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddClusterInstancesRequest
* @Description 请求参数
*/
@Data
public class AddClusterInstancesRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**建议仅填写一条InstanceSet数据，不要填写多条。*/
    @KsYunField(name="InstanceSet")
    private List<InstanceSetDto> InstanceSetList;

    @Data
    @ToString
    public static class InstanceSetDto {
        /**节点角色,有效值：Worker*/
        @KsYunField(name="NodeRole")
        private String NodeRole;
        /**定义节点的配置，支持普通云主机和专属云主机。
节点配置信息使用云主机/专属云主机创建透传参数，json化字符串格式，详见云主机创建实例接口和专属云主机创建实例接口*/
        @KsYunField(name="NodePara")
        private List<String> NodeParaList;
        /**节点高级设置*/
        @KsYunField(name="AdvancedSetting")
        private AdvancedSettingDto AdvancedSetting;
    }

    @Data
    @ToString
    public static class AdvancedSettingDto {
        /**数据盘挂载设置，仅针对于第一块数据盘生效*/
        @KsYunField(name="DataDisk")
        private DataDiskDto DataDisk;
        /**容器运行时，根据集群版本和需求选择
         Kubernetes版本*/
        @KsYunField(name="ContainerRuntime")
        private String ContainerRuntime;
        /**容器的存储路径，不填写的话默认为/data/docker*/
        @KsYunField(name="DockerPath")
        private String DockerPath;
        /**容器的存储路径，不填写的话默认为/data/container
         注：当传该参数时，DockerPath参数失效*/
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
        @KsYunField(name="Label")
        private LabelDto Label;
        /**自定义节点上k8s组件的参数*/
        @KsYunField(name="ExtraArg")
        private ExtraArgDto ExtraArg;
        /**自定义容器日志采集文件大小，超出此大小日志将滚动写入下一文件，默认值为100m*/
        @KsYunField(name="ContainerLogMaxSize")
        private Integer ContainerLogMaxSize;
        /**自定义容器日志采集文件最大数量，默认值为10个*/
        @KsYunField(name="ContainerLogMaxFiles")
        private Integer ContainerLogMaxFiles;
        /**节点加入集群时预置污点，匹配污点容忍进行调度*/
        @KsYunField(name="Taints")
        private TaintsDto Taints;
    }

    @Data
    @ToString
    public static class DataDiskDto {
        /**是否对数据盘格式化并挂载，默认值；true。若此字段填写false，则 FileSystem 和 MountTarget字段不生效*/
        @KsYunField(name="AutoFormatAndMount")
        private Boolean AutoFormatAndMount;
        /**数据盘的文件系统，可选值：ext3，ext4，xfs，默认值ext4。若磁盘已有文件系统，则不进行处理，若没有文件系统，则按照用户的定义进行格式化，仅对第一块磁盘生效*/
        @KsYunField(name="FileSystem")
        private Integer FileSystem;
        /**数据盘挂载点，并挂载，仅对第一块盘生效。*/
        @KsYunField(name="MountTarget")
        private String MountTarget;
    }

    @Data
    @ToString
    public static class LabelDto {
        /**标签名称*/
        @KsYunField(name="Key")
        private String Key;
        /**标签值*/
        @KsYunField(name="Value")
        private String Value;
    }

    @Data
    @ToString
    public static class ExtraArgDto {
        /**用户自定义kubelet的参数*/
        @KsYunField(name="Kubelet")
        private KubeletDto Kubelet;
    }

    @Data
    @ToString
    public static class KubeletDto {
        /**用户自定义kubelet的参数，格式k1=v1，如： --feature-gates=EphemeralContainers=true*/
        @KsYunField(name="CustomArg")
        private String CustomArg;
    }

    @Data
    @ToString
    public static class TaintsDto {
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