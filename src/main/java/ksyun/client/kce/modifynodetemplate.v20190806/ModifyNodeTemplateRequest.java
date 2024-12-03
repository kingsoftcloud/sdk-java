package ksyun.client.kce.modifynodetemplate.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyNodeTemplateRequest
* @Description 请求参数
*/
@Data
public class ModifyNodeTemplateRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**节点池id*/
    @KsYunField(name="NodePoolId")
    private String NodePoolId;

    /**节点模板信息<br>注：不可修改计费方式、节点池所在vpc*/
    @KsYunField(name="NodeTemplate")
    private NodeTemplateDto NodeTemplate;

    @Data
    @ToString
    public static class NodeTemplateDto {
        /**计费方式，有效值：

         Daily：按量付费（按日月结）
         HourlyInstantSettlement：按量付费
         注：当参数EnableAutoScale设置为False时，计费方式可选Daily、HourlyInstantSettlement；当参数EnableAutoScale设置为True时，计费方式可选HourlyInstantSettlement*/
        @KsYunField(name="ChargeType")
        private String ChargeType;
        /**实例类型，详情请见创建实例中InstanceType具体参数*/
        @KsYunField(name="InstanceType")
        private String InstanceType;
        /**系统盘信息
         注：若不指定该参数，则按照系统默认值进行分配*/
        @KsYunField(name="SystemDisk")
        private SystemDiskDto SystemDisk;
        /**本地数据盘大小*/
        @KsYunField(name="DataDiskGb")
        private Integer DataDiskGb;
        /**
         第n个数据盘（云盘）*/
        @KsYunField(name="DataDisk")
        private List<DataDiskDto> DataDisk;
        /**镜像id*/
        @KsYunField(name="ImageId")
        private String ImageId;
        /**节点池所在vpc的id*/
        @KsYunField(name="VpcId")
        private String VpcId;
        /**子网id*/
        @KsYunField(name="SubnetId")
        private List<String> SubnetId;
        /**多子网扩展策略，有效值：

         balanced-distribution：均衡分布
         choice-first：选择优先
         默认值：balanced-distribution
         注：当绑定多个子网时，该项必填*/
        @KsYunField(name="SubnetStrategy")
        private String SubnetStrategy;
        /**安全组id*/
        @KsYunField(name="SecurityGroupId")
        private String SecurityGroupId;
        /**节点池所属项目*/
        @KsYunField(name="ProjectId")
        private String ProjectId;
        /**实例密码
         校验规则：8-32个字符，必须包含大小写字母和数字，支持英文特殊字符!$%()*+,-./:;<=>?@[]^_`{*/
        @KsYunField(name="Password")
        private String Password;
        /**节点高级设置*/
        @KsYunField(name="AdvancedSetting")
        private AdvancedSettingDto AdvancedSetting;
        /**节点高级设置*/
        @KsYunField(name="EbsTag")
        private List<EbsTagDto> EbsTag;
        /**实例标签，N取值范围[1-10]*/
        @KsYunField(name="InstanceTag")
        private List<InstanceTagDto> InstanceTag;
        /**Cpu核数*/
        @KsYunField(name="Cpu")
        private String Cpu;
        /**内存*/
        @KsYunField(name="Mem")
        private String Mem;
        /**密钥ID*/
        @KsYunField(name="KeyId")
        private List<String> KeyId;
        /**实例名称*/
        @KsYunField(name="InstanceName")
        private String InstanceName;
        /**实例名称后缀*/
        @KsYunField(name="InstanceNameSuffix")
        private Integer InstanceNameSuffix;
        /**是否删除数据盘*/
        @KsYunField(name="DeleteDataDisk")
        private Boolean DeleteDataDisk;
        /**是否删除实例tag*/
        @KsYunField(name="DeleteInstanceTag")
        private Boolean DeleteInstanceTag;
        /**是否删除实例ebs tag*/
        @KsYunField(name="DeleteEbsTag")
        private Boolean DeleteEbsTag;
    }

    @Data
    @ToString
    public static class SystemDiskDto {
        /**系统盘类型*/
        @KsYunField(name="DiskType")
        private String DiskType;
        /**系统盘大小*/
        @KsYunField(name="DiskSize")
        private Integer DiskSize;
    }

    @Data
    @ToString
    public static class DataDiskDto {
        /**第n个数据盘（云盘）的类型，仅支持一块数据盘*/
        @KsYunField(name="Type")
        private String DiskType;
        /**
         第n个数据盘（云盘）的容量大小，范围[1-32000]*/
        @KsYunField(name="Size")
        private Integer Size;
        /**数据盘是否随实例删除，有效值：

         True：是
         False：否
         默认值：False*/
        @KsYunField(name="DeleteWithInstance")
        private Boolean DeleteWithInstance;
    }

    @Data
    @ToString
    public static class AdvancedSettingDto {
        /**数据盘挂载设置，仅针对于第一块数据盘生效*/
        @KsYunField(name="DataDisk")
        private AdvancedSettingDataDiskDto DataDisk;
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
        /**自定义节点上k8s组件的参数*/
        @KsYunField(name="ExtraArg")
        private ExtraArgDto ExtraArg;
        /**自定义容器日志采集文件大小，超出此大小日志将滚动写入下一文件，默认值为100m*/
        @KsYunField(name="ContainerLogMaxSize")
        private Integer ContainerLogMaxSize;
        /**自定义容器日志采集文件最大数量，默认值为10个*/
        @KsYunField(name="ContainerLogMaxFiles")
        private Integer ContainerLogMaxFiles;
    }

    @Data
    @ToString
    public static class AdvancedSettingDataDiskDto {
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
    public static class EbsTagDto{
        /**标签键，校验规则：支持1-128个字符，仅支持中英文字符、数字及±=._/@:*/
        @KsYunField(name="Key")
        private String Key;
        /**标签值，校验规则：256个字符内，仅支持中英文字符、数字及±=._/@()（）【】:*/
        @KsYunField(name="Value")
        private String Value;
    }

    @Data
    @ToString
    public static class InstanceTagDto{
        /**标签键，校验规则：支持1-128个字符，仅支持中英文字符、数字及±=._/@:*/
        @KsYunField(name="Key")
        private String Key;
        /**标签值，校验规则：256个字符内，仅支持中英文字符、数字及±=._/@()（）【】:*/
        @KsYunField(name="Value")
        private String Value;
    }

    /**节点标签*/
    @KsYunField(name="Label")
    private List<LabelDto> LabelList;

    @Data
    @ToString
    public static class LabelDto {
        /**标签键，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
        @KsYunField(name="Key")
        private String Key;
        /**标签值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、".")，且必须以字母、数字开头和结尾*/
        @KsYunField(name="Value")
        private String Value;
    }

    /**节点污点*/
    @KsYunField(name="Taint")
    private List<TaintDto> TaintList;

    @Data
    @ToString
    public static class TaintDto {
        /**污点键，校验规则：污点名不超过253个字符，只能包含字母、数字及分隔符("-"、"_"、"."、"/")，且必须以字母、数字开头和结尾*/
        @KsYunField(name="Key")
        private String Key;
        /**污点值，校验规则：不超过63个字符，只能包含字母、数字及分隔符("-"、"_"、".")，且必须以字母、数字开头和结尾*/
        @KsYunField(name="Value")
        private String Value;
        /**有效值：NoSchedule、PreferNoSchedule、NoExecute*/
        @KsYunField(name="Effect")
        private String Effect;
    }

    /**最小节点数量，即为最小能缩容的实例数量，范围[0-50]，不大于maxSize*/
    @KsYunField(name="MinSize")
    private Integer MinSize;

    /**最大节点数量，即为最大能扩容的实例数量，范围[0-50]，不小于minSize*/
    @KsYunField(name="MaxSize")
    private Integer MaxSize;

    /**期望节点数量，即节点池刚创建时的实例数量，必须在最小节点数量与最大节点数量之间*/
    @KsYunField(name="DesiredCapacity")
    private Integer DesiredCapacity;

}