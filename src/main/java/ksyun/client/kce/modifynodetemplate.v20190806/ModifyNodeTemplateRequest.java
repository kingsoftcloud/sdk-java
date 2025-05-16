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
public class ModifyNodeTemplateRequest {
    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 节点池id
     */
    @KsYunField(name = "NodePoolId")
    private String NodePoolId;

    /**
     * 节点模板信息<br>注：不可修改计费方式、节点池所在vpc
     */
    @KsYunField(name = "NodeTemplate")

    private NodeTemplateDto NodeTemplateList;

    @Data
    @ToString
    public static class NodeTemplateDto {
        /**
         * 计费方式，有效值：
         * - Daily：按量付费（按日月结）
         * - HourlyInstantSettlement：按量付费
         * 注：当参数EnableAutoScale设置为False时，计费方式可选Daily、HourlyInstantSettlement；当参数EnableAutoScale设置为True时，计费方式可选HourlyInstantSettlement
         */
        @KsYunField(name = "ChargeType")
        private String ChargeType;
        /**
         * 实例类型，详情请见创建实例中InstanceType具体参数
         */
        @KsYunField(name = "InstanceType")
        private String InstanceType;
        /**
         * 实例名称
         * 注：若不指定该参数，名称则为：AS-节点池名称-Worker
         */
        @KsYunField(name = "InstanceName")
        private String InstanceName;
        /**
         * 实例名称后缀
         */
        @KsYunField(name = "InstanceNameSuffix")
        private Integer InstanceNameSuffix;
        /**
         * 系统盘信息
         * 注：若不指定该参数，则按照系统默认值进行分配
         */
        @KsYunField(name = "SystemDisk")
        private SystemDiskDto SystemDiskList;

        @Data
        @ToString
        public static class SystemDiskDto {
            /**
             * 系统盘类型
             */
            @KsYunField(name = "DiskType")
            private String DiskType;
            /**
             * 系统盘大小
             */
            @KsYunField(name = "DiskSize")
            private Integer DiskSize;
        }

        /**
         * 本地数据盘大小
         */
        @KsYunField(name = "DataDiskGb")
        private Integer DataDiskGb;
        /***/
        @KsYunField(name = "DataDisk")
        private List<Object> DataDiskList;
        /**
         * 镜像id
         */
        @KsYunField(name = "ImageId")
        private String ImageId;
        /**
         * 节点池所在vpc的id
         */
        @KsYunField(name = "VpcId")
        private String VpcId;
        /**
         * 子网id
         */
        @KsYunField(name = "SubnetId")
        private List<String> SubnetIdList;
        /**
         * 多子网扩展策略，有效值：
         * - balanced-distribution：均衡分布
         * - choice-first：选择优先
         * 默认值：balanced-distribution
         * 注：当绑定多个子网时，该项必填
         */
        @KsYunField(name = "SubnetStrategy")
        private String SubnetStrategy;
        /**
         * 安全组id
         */
        @KsYunField(name = "SecurityGroupId")
        private String SecurityGroupId;
        /**
         * 节点池所属项目
         */
        @KsYunField(name = "ProjectId")
        private String ProjectId;
        /**
         * 实例密码
         * 校验规则：8-32个字符，必须包含大小写字母和数字，支持英文特殊字符!$%()*+,-./:;<=>?@[]^_`{
         */
        @KsYunField(name = "Password")
        private String Password;
        /**
         * 密钥id
         * 校验规则：请填写有效的keyId，若填写此参数，则Password参数无效
         * 注：参数KeyId.N和Password必须填写一个
         */
        @KsYunField(name = "KeyId")
        private List<String> KeyIdList;
        /**
         * 节点高级设置
         */
        @KsYunField(name = "AdvancedSetting")
        private AdvancedSettingDto AdvancedSettingList;

        @Data
        @ToString
        public static class AdvancedSettingDto {
            /**
             * 数据盘挂载设置，仅针对于第一块数据盘生效
             */
            @KsYunField(name = "DataDisk")
            private DataDiskDto DataDiskList;

            @Data
            @ToString
            public static class DataDiskDto {
                /**
                 * 是否对数据盘格式化并挂载，默认值；true。若此字段填写false，则 FileSystem 和 MountTarget字段不生效
                 */
                @KsYunField(name = "AutoFormatAndMount")
                private Boolean AutoFormatAndMount;
                /**
                 * 数据盘的文件系统，可选值：ext3，ext4，xfs，默认值ext4。若磁盘已有文件系统，则不进行处理，若没有文件系统，则按照用户的定义进行格式化，仅对第一块磁盘生效
                 */
                @KsYunField(name = "FileSystem")
                private String FileSystem;
                /**
                 * 数据盘挂载点，并挂载，仅对第一块盘生效。
                 */
                @KsYunField(name = "MountTarget")
                private String MountTarget;
            }

            /**
             * 容器运行时，根据集群版本和需求选择
             * Kubernetes版本＜1.24时，有效值：
             * - docker
             * - containerd
             * Kubernetes版本≥1.24时，有效值：
             * - contained
             * 默认值：docker
             */
            @KsYunField(name = "ContainerRuntime")
            private String ContainerRuntime;
            /**
             * 容器的存储路径，不填写的话默认为/data/container
             */
            @KsYunField(name = "ContainerPath")
            private String ContainerPath;
            /**
             * base64 编码的用户脚本, 此脚本会在 节点上k8s 组件运行后执行, 需要用户保证脚本的可重入及重试逻辑,脚本和生成的日志的文件可在录/usr/local/ksyun/kce/userscript路径查看
             */
            @KsYunField(name = "UserScript")
            private String UserScript;
            /**
             * base64 编码的用户脚本, 此脚本会在节点上 k8s 组件运行前执行, 需要用户保证脚本的可重入及重试逻辑,脚本和生成的日志的文件可在录/usr/local/ksyun/kce/pre_userscript路径查看
             */
            @KsYunField(name = "PreUserScript")
            private String PreUserScript;
            /**
             * 节点加入集群后是否可以正常调度，默认值：true
             */
            @KsYunField(name = "Schedulable")
            private Boolean Schedulable;
            /**
             * 节点加入集群时预置的标签
             */
            @KsYunField(name = "Label")
            private List<Object> LabelList;
            /**
             * 自定义节点上k8s组件的参数
             */
            @KsYunField(name = "ExtraArg")
            private ExtraArgDto ExtraArgList;

            @Data
            @ToString
            public static class ExtraArgDto {
                /**
                 * 用户自定义kubelet的参数
                 */
                @KsYunField(name = "Kubelet")
                private List<Object> KubeletList;
            }

            /**
             * 自定义容器日志采集文件大小，超出此大小日志将滚动写入下一文件，默认值为100m
             */
            @KsYunField(name = "ContainerLogMaxSize")
            private Integer ContainerLogMaxSize;
            /**
             * 自定义容器日志采集文件最大数量，默认值为10个
             */
            @KsYunField(name = "ContainerLogMaxFiles")
            private Integer ContainerLogMaxFiles;
            /**
             * 节点加入集群时预置污点，匹配污点容忍进行调度
             */
            @KsYunField(name = "Taints")
            private List<Object> TaintsList;
        }

        /**
         * 云盘标签，N取值范围[1-10]
         */
        @KsYunField(name = "EbsTag")
        private List<Object> EbsTagList;
        /**
         * 实例标签，N取值范围[1-10]
         */
        @KsYunField(name = "InstanceTag")
        private List<Object> InstanceTagList;
        /**
         * 是否删除数据盘
         */
        @KsYunField(name = "DeleteDataDisk")
        private Boolean DeleteDataDisk;
        /**
         * 是否删除实例tag
         */
        @KsYunField(name = "DeleteInstanceTag")
        private Boolean DeleteInstanceTag;
        /**
         * 是否删除EbsTag
         */
        @KsYunField(name = "DeleteEbsTag")
        private Boolean DeleteEbsTag;
        /**
         * CPU核数
         */
        @KsYunField(name = "Cpu")
        private String Cpu;
        /**
         * 内存大小
         */
        @KsYunField(name = "Mem")
        private String Mem;
    }
}